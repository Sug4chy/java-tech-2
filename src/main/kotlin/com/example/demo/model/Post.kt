package com.example.demo.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.io.Serializable
import java.util.*

@Entity
class Post(
    @Id
    @GeneratedValue
    val id: Long?,
    val text: String,
    val creationDate: Date,
    var likes: Int = 0,
): Serializable {
    constructor() : this(0, "", Date())
}