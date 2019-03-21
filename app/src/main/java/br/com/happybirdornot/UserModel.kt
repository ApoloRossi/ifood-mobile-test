package br.com.happybirdornot

import com.google.gson.annotations.SerializedName

data class UserModel(@SerializedName("profile_image_url")
                val userPicture : String,
                     @SerializedName("accountName")
                val userName : String,
                     @SerializedName("name")
                val accountName : String)