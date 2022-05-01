package com.example.demo.controller;


import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;
import com.example.demo.helper.UserFoundException;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
//import com.example.demo.helper.UserFoundException;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")

public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

//    @Autowired
//    private UserRepository userRepository;

    //creating user


    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {


//        user.setProfile("default.png");

        //encoding password with bcryptpasswordencoder

        user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));



        Set<UserRole> roles=new HashSet<>();

        Role role = new Role();
        role.setRoleId(45L);
        role.setRoleName("Normal");


        UserRole userRole=new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);

        roles.add(userRole);

        return this.userService.createUser(user, roles);

    }


    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){

        return this.userService.getUser(username);
    }

    //get all user
    @GetMapping("/")
    public ResponseEntity<?> getUser(){
        return ResponseEntity.ok(this.userService.getUser());}

    //delete the user by id
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        this.userService.deleteUser(id);
    }


    //update user
//    @PutMapping("/{id}")
////    public User updateUser (@RequestBody User user) {
////        return this.userService.updateUser(user);
////    }
//    public User updateUser(@PathVariable Long id, @RequestBody User user){
//
//      return this.userService.updateUser();
//    }

    //update vehicle
    @PutMapping("/")
    public User updateUser(@RequestBody User user){
        return this.userService.updateUser(user);
    }


//    @ExceptionHandler(UserNotFoundException.class)
//    public ResponseEntity<?> exceptionHandler(UserNotFoundException ex) {
//        return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
//    }
//
    @ExceptionHandler(UserFoundException.class)
    public ResponseEntity<?> exceptionHandler(UserFoundException ex) {
        return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
    }




//    update api
//    @PutMapping
//    public User updateUser(@RequestBody User user) {
//
//    }


}
