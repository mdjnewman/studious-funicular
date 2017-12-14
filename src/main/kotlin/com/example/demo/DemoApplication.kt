package com.example.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.CompletableFuture

@SpringBootApplication
@RestController
class DemoApplication {

    @RequestMapping("/sad", method = arrayOf(RequestMethod.POST))
    fun getErroringCompletableFuture(): CompletableFuture<String> {
        return CompletableFuture.supplyAsync {
            try {
            } catch (e: InterruptedException) {
            }
            throw RuntimeException();
        }
    }

}

fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java)
}
