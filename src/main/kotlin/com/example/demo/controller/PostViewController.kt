package com.example.demo.controller

import com.example.demo.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class PostViewController(
    @Autowired private val postService: PostService
) {

    @RequestMapping(path = ["/"], method = [RequestMethod.GET])
    fun list(model: Model): String {
        model.addAttribute("appName", "Сентябрь горит")
        model.addAttribute("posts", postService.listAllPosts())
        return "list"
    }

    @ResponseBody
    @RequestMapping(path = ["/post/{id}"], method = [RequestMethod.GET])
    fun single(@PathVariable id: Long): String {
        return "Здесь будет страница поста №$id"
    }
}