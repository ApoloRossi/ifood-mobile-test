package br.com.happybirdornot.ui

import br.com.happybirdornot.UserModel
import com.google.gson.annotations.SerializedName

class TweetModel(userModel : UserModel, text : String) {

    @SerializedName("statuses")
    private lateinit var statuses : Statuses

    init {
        statuses = Statuses()
        statuses.userModel = userModel
        statuses.text = text
    }

    class Statuses {
        var text = String()
        var userModel : UserModel? = null
    }

    fun name() = statuses?.userModel?.userName
    fun userPicture() = statuses?.userModel?.userPicture
    fun accountName() = statuses?.userModel?.accountName
    fun text() = statuses?.text

}