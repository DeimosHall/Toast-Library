package com.deimos.mylibrary

import android.content.Context
import android.widget.Toast

class Message(private val context: Context) {
    fun show() { Toast.makeText(context, "Hello from library", Toast.LENGTH_SHORT).show() }
}