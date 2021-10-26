package com.example.list_of_lists_kotlin.models

class Info {
    private var success: Boolean
    private var message: String
    private var obj: Any

    constructor(success: Boolean, message: String, obj: Any) {
        this.success = success
        this.message = message
        this.obj = obj
    }
}