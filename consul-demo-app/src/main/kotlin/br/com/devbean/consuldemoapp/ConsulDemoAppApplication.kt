package br.com.devbean.consuldemoapp

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
class ConsulDemoAppApplication

fun main(args: Array<String>) {
	runApplication<ConsulDemoAppApplication>(*args)
}
