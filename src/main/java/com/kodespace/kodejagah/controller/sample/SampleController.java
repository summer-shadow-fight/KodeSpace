package com.kodespace.kodejagah.controller.sample;


import com.kodespace.kodejagah.Exceptions.UserNotFoundException;
import com.kodespace.kodejagah.dto.UserInput;
import com.kodespace.kodejagah.service.SampleServiceClass;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/sample")
public class SampleController {

    private final SampleServiceClass sampleServiceClass;


    @GetMapping (value = "/stores", headers = "X-API-VERSION=1")
    public ResponseEntity <String> sampleAPI(){
        log.info("Sample API");
        return ResponseEntity.ok("Sample API Done");
    }

    @PostMapping (value = "/id",headers = "X-API-VERSION=1")
public ResponseEntity <String> sampleDBAPI(@Valid @RequestBody UserInput input) throws UserNotFoundException {
        log.info("Sample DB API");
        String userNameById = sampleServiceClass.getUserNameById(input.getUserId());
        return ResponseEntity.ok("User Name ==  " + userNameById);
    }


}
