package com.example.list_of_lists_kotlin.models

import java.util.*

class Item {
    private var id: Number
    private var name: String
    private var urlPhoto: String
    private var base64photo: String
    private var idList: Number
    private var status: String
    private var createDate: Date

    constructor(
        id: Number,
        name: String,
        urlPhoto: String,
        base64photo: String,
        idList: Number,
        status: String,
        createDate: Date
    ) {
        this.id = id
        this.name = name
        this.urlPhoto = urlPhoto
        this.base64photo = base64photo
        this.idList = idList
        this.status = status
        this.createDate = createDate
    }
}