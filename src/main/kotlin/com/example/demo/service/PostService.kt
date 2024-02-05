package com.example.demo.service

import com.example.demo.model.Post
import com.example.demo.repository.PostRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*
import java.util.stream.StreamSupport

@Service
class PostService(
    @Autowired private val postRepository: PostRepository
) {

    fun listAllPosts(): List<Post> {
        return StreamSupport.stream(postRepository.findAll().spliterator(), false).toList()
    }

    fun create(text: String) {
        val post = Post(null, text, Date())
        postRepository.save(post)
    }
}