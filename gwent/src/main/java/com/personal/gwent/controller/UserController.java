package com.personal.gwent.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

        User created = service.saveUser(user);
        return ResponseEntity.status(201).body(created);
    }

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticateUser(@RequestParam("username") String username,
                                              @RequestParam("password") String password) {
        Optional<User> user = service.findByUsername(username);
        
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            return ResponseEntity.status(200).body(user.get());
        }
        else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }
    }

    // @ExceptionHandler(MethodArgumentNotValidException.class)
    // public ResponseEntity<Object> handleValidationException(MethodArgumentNotValidException ex) {
    //     List<String> errorMessages = ex.getBindingResult()
    //         .getAllErrors()
    //         .stream()
    //         .map(DefaultMessageSourceResolvable::getDefaultMessage)
    //         .collect(Collectors.toList());

    //     return ResponseEntity.badRequest().body(errorMessages);

    // }


}
