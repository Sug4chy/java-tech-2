package com.example.demo.service

import com.example.demo.model.Post
import org.springframework.stereotype.Service
import java.util.*

@Service
class PostService {
    fun listAllPosts(): List<Post> {
        return listOf(
            Post("Пост 1", Date()),
            Post("Пост 2", Date()),
            Post("Пост 3", Date())
        )
    }
}