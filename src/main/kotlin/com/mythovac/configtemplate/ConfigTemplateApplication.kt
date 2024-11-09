package com.mythovac.configtemplate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * 主类，用于启动程序
 * 不建议修改
 * */
@SpringBootApplication
class SbkEduApplication

fun main(args: Array<String>) {
    runApplication<SbkEduApplication>(*args)
}
