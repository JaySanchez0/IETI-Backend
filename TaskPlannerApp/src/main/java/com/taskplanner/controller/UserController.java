package com.taskplanner.controller;

import com.taskplanner.model.User;
import com.taskplanner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"*"})
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<?> getUsers(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable String id){
        return ResponseEntity.ok(service.getById(id));
    }

    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody User user){
        User u = service.create(user);
        if(u!=null)
            return ResponseEntity.ok().build();
        else
            return ResponseEntity.badRequest().build();
    }

    @PutMapping
    public ResponseEntity<?> updateUser(@RequestBody User user){
        service.update(user);
        return ResponseEntity.accepted().build();
    }

    @DeleteMapping
    public ResponseEntity<?> deleteUser(@RequestBody User user){
        service.remove(user.getEmail());
        return ResponseEntity.ok().build();
    }

}
