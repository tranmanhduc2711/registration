package com.example.registration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.stereotype.Controller
@CrossOrigin
public class Controller {
    @PostMapping("/registration")
    ResponseEntity<?> register(@RequestBody RegistrationDto registrationDto){
        return new ResponseEntity<>(registrationDto, HttpStatus.OK);
    }
}
