package com.example.server

import com.example.common.Week
import mu.KotlinLogging
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

private val log = KotlinLogging.logger { }

@SpringBootTest
class ServerApplicationTests {

    @Test
    fun contextLoads() {
        Week.values().forEach {
            log.info { it }
        }
        Assertions.assertThat(Week.SUNDAY.isWeekend()).isTrue()
    }

}
