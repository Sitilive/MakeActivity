package com.example.firstapp

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

//Data class untuk mengirim data dari satu activity ke activity lain maupun ke database
@Parcelize
data class User(
    val name: String?,
    val email: String?,
    val password: String?,
    val age: Int? = 0
): Parcelable
