package br.com.devbean.consuldemoapp

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ApplicationConfigTest {

    @Autowired
    lateinit var applicationConfig: ApplicationConfig

    @Test
    fun `should get consul var from ConsulDemo`() {

    }
}