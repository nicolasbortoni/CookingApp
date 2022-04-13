package com.utn.cookingapp.entities

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
class Recipe(var uid : String,var name : String,var author : String, var receta : String) : Parcelable
{
}