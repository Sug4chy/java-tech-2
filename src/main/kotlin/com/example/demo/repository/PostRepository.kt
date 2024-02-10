package com.example.demo.repository

import com.example.demo.model.Post
import org.springframework.data.repository.CrudRepository

interface PostRepository : CrudRepository<Post, Long>