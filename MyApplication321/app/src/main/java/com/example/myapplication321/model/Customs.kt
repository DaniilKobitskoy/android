package com.example.myapplication321.model




data class Custom(
    val `data`: List<Data?>?,
    val meta: Meta?
) {
    data class Data(
        val count: Int?, // 10
        val date: String?, // 04.09.2019 в 18:11
        val id: Int?, // 18456789
        val price: Int?, // 540
        val status: String? // new
    )

    data class Meta(
        val code: Int?, // 200
        val message: Boolean?, // false
        val status: Boolean? // true
    )
}