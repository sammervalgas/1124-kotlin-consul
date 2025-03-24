package br.com.devbean.consuldemoapp

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.stereotype.Component

@Component
@RefreshScope
class ApplicationConfig {

    @Value("\${auth.client-id}")
    lateinit var clientId: String

    @Value("\${auth.client-secret}")
    lateinit var clientSecret: String

    @Value("\${app.features.cfg}")
    lateinit var featuresCfg: String

}