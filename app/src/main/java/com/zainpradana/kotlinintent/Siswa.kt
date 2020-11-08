package com.zainpradana.kotlinintent

import android.os.Parcel
import android.os.Parcelable

data class Siswa (
    var nama: String?,
    var umur: Int?



) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readValue(Int::class.java.classLoader) as? Int) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeValue(umur)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Siswa> {
        override fun createFromParcel(parcel: Parcel): Siswa {
            return Siswa(parcel)
        }

        override fun newArray(size: Int): Array<Siswa?> {
            return arrayOfNulls(size)
        }
    }
}