package com.plcoding.plugins

import com.plcoding.routes.randomRabbit
import com.plcoding.routes.randomTimeTable
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.content.*
import io.ktor.http.content.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {
    routing {
        randomRabbit()
        randomTimeTable()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
