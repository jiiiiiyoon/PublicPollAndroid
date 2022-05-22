package com.junjange.myapplication.data

import com.google.gson.annotations.SerializedName

data class Comment(@SerializedName("data") val commentItem: ArrayList<CommentItem>)

data class CommentItem(

    @SerializedName("id") val id: Int,
    @SerializedName("contents") val contents: String,
    @SerializedName("user") val user: UserItem,
    @SerializedName("poll") val poll: PollComponent,

    )
