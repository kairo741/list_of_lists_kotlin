package com.example.list_of_lists_kotlin.models

import java.util.*

class User {
    private var success: Number
    private var name: String
    private var status: String
    private var createDate: Date

    constructor(success: Number, name: String, status: String, createDate: Date) {
        this.success = success
        this.name = name
        this.status = status
        this.createDate = createDate
    }
}