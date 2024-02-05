package com.example.demo.service

import com.example.demo.repository.PostRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LikesService(
    @Autowired private val postRepository: PostRepository
) {

    fun like(postId: Long): Int {
        val post = postRepository.findById(postId).get()
        post.likes++
        postRepository.save(post)
        return post.likes
    }
}