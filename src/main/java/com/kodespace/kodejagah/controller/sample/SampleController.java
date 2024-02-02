package com.kodespace.kodejagah.controller.sample;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/sample")
public class SampleController {

    @GetMapping (value = "/stores", headers = "X-API-VERSION=1")
    public ResponseEntity <String> sampleAPI(){
        log.info("Sample API");
        return ResponseEntity.ok("Sample API Done");
    }



}
