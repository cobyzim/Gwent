package com.personal.gwent.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.gwent.exception.InvalidInputException;
import com.personal.gwent.model.user.User;
import com.personal.gwent.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody @Valid User user){
        user.setId(null);
       // try {
            User created = service.SaveUser(user);
            return ResponseEntity.status(201).body(created);
        //}
        // catch(InvalidInputException ex) {
        //     return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
        // }
        
    }


}
