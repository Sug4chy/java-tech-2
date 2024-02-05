package com.example.demo.service

import com.example.demo.model.Post
import org.springframework.stereotype.Service

@Service
class PostService {
    fun listAllPosts(): List<Post> {
        return listOf(
            Post("Пост 1", 0),
            Post("Пост 2", 0),
            Post("Пост 3", 0)
        )
    }
}