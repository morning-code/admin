package io.code.morning.admin.index

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController {

    @GetMapping("/")
    fun get():  String {
        return "Hello Morning Code"
    }
}