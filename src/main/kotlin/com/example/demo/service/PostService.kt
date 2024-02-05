package com.example.demo.service

import com.example.demo.model.Post
import org.springframework.stereotype.Service
import java.util.*

@Service
class PostService {
    private val posts: MutableList<Post> = mutableListOf(
        Post(0,"Пост 1", Date()),
        Post(1, "Пост 2", Date()),
        Post(2, "Пост 3", Date())
    )

    fun listAllPosts(): List<Post> {
        return posts
    }

    fun create(text: String) {
        posts.add(Post(posts.size.toLong(), text, Date()))
    }
}