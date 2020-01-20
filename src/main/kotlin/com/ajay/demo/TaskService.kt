package com.ajay.demo

import org.springframework.stereotype.Component

@Component
class TaskService {
    fun findUser(num: Int): String {

        var username: String
        var message: String = "Welcome"
        if (num == 7)
            username = "Ajay"
        else if (num == 5)
            username = "Geethika"
        else
            username = "Arya"

        return username

    }
}