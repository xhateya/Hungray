package com.xhateya.idn.dzikirapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Artikel(
    val imageArtikel : Int,
    val tittleArtikel : String,
    val descArtikel : String,

):Parcelable