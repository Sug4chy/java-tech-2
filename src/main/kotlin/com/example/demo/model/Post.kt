package com.example.demo.model

import java.util.Date

class Post(val id: Long, val text: String, val creationDate: Date, var likes: Int = 0)