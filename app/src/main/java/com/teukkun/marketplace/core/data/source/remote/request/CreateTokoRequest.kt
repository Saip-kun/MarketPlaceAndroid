package com.teukkun.marketplace.core.data.source.remote.request

data class CreateTokoRequest(
        val name: String,
        val kota: String,
        val userId: Int
)