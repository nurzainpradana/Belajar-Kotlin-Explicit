package com.zainpradana.kotlinintent

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Siswa (
    var nama: String?,
    var umur: Int?
) : Parcelable