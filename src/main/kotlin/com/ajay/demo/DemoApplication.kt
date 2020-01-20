package com.ajay.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.boot.Banner
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody





@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	println ("Hello World")
	runApplication<DemoApplication>(*args)
	{
		setBannerMode(Banner.Mode.OFF)
	}
}
