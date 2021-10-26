package com.example.list_of_lists_kotlin.models

import java.util.*

class Lista {
    private var id: Number
    private var name: String
    private var icon: Number
    private var idUser: Number
    private var status: String
    private var createDate: Date

    constructor(
        id: Number,
        name: String,
        icon: Number,
        idUser: Number,
        status: String,
        createDate: Date
    ) {
        this.id = id
        this.name = name
        this.icon = icon
        this.idUser = idUser
        this.status = status
        this.createDate = createDate
    }
}