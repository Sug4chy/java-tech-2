package com.example.demo.controller

import com.example.demo.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class PostsCreateController(
    @Autowired private val postService: PostService
) {

    @RequestMapping(path = ["/new"], method = [RequestMethod.GET])
    fun create(model: Model): String {
        model.addAttribute("appName", "Сентябрь горит")
        return "create"
    }

    @RequestMapping(path = ["/new"], method = [RequestMethod.POST])
    fun doCreate(@ModelAttribute("text") text: String): String {
        postService.create(text)
        return "redirect:/"
    }
}