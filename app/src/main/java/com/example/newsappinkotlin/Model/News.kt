package com.example.newsappinkotlin.Model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "News"
)

data class News (
    @SerializedName("author") var author :String?,
    @SerializedName("title") var title :String?,
    @SerializedName("description") var description :String?,
    @SerializedName("url") var url :String?,
    @SerializedName("urlToImage") var image :String?
)