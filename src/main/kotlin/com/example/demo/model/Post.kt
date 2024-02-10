package com.example.demo.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.util.*

@Entity
data class Post(
    @Id
    @GeneratedValue
    val id: Long?,
    val text: String,
    val creationDate: Date,
    var likes: Int = 0,
) {
    constructor() : this(0, "", Date())
}