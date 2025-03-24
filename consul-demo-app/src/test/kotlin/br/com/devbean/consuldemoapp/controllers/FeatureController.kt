package br.com.devbean.consuldemoapp.controllers

import br.com.devbean.consuldemoapp.ApplicationConfig
import br.com.devbean.consuldemoapp.model.FeatureModel
import com.google.gson.Gson
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/features")
class FeatureController( val applicationConfig: ApplicationConfig ) {

    @GetMapping
    fun list(): Array<FeatureModel> {
        return Gson().fromJson(applicationConfig.featuresCfg, Array<FeatureModel>::class.java)
    }

}