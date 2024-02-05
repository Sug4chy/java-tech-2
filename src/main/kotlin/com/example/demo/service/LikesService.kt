package com.example.demo.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LikesService(
    @Autowired private val postService: PostService
) {

    fun like(postId: Long): Int {
        val post = postService.listAllPosts()[postId.toInt()]
        post.likes++
        return post.likes
    }
}