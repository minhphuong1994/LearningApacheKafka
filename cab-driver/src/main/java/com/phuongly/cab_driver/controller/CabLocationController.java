package com.phuongly.cab_driver.controller;

import com.phuongly.cab_driver.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class CabLocationController {

    @Autowired
    private CabLocationService cabLocationService;

    @PutMapping
    public ResponseEntity updateSender() throws InterruptedException {
        int range = 0;
        while(range < 10){
            cabLocationService.updateLocation(Math.random()+" , "+Math.random());
            Thread.sleep(500);
            range++;
        }

        return new ResponseEntity<>(Map.of("message","finished!"), HttpStatus.OK);
    }
}
