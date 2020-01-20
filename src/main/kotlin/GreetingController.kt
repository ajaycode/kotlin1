package com.ajay.demo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*


@Controller
class GreetingController
{
    @Autowired
    lateinit var taskService: TaskService

    @RequestMapping("/")
    //@ResponseBody
    fun home (@RequestParam num: Int, model : Model):String
    {
        var username:String =  taskService.findUser(num)
        var message:String = "Welcome"

        //return "Welcome ${username}"
        model.addAttribute("message", message)
        model.addAttribute("username", username)

        //model.addAllAttributes("message", message, "username", username)
        return "home"
    }
}
