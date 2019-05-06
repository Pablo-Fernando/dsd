package com.watchicol.api.location.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired

import com.watchicol.api.location.pojos.*

@RestController
class LocationController { 
    @Autowired
    LocationService locationService

    @PostMapping("validateDenoucement")
    public Boolean validateDenoucement(@RequestBody Denoucement info)
    {
        locationService.validate(info)
    }

}