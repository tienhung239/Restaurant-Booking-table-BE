package com.BEintern.restaurantbookingtable.controller;

import com.BEintern.restaurantbookingtable.model.Users;
import com.BEintern.restaurantbookingtable.repository.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {

    //test
    @Autowired
    UserInterface userInterface;
    @PostMapping("/signin")
    public ResponseEntity<?> signin(){
        List<Users> listUser = userInterface.findAll();

        for (Users users: listUser) {
            System.out.println(users.getUsFullName());
        }
        return new ResponseEntity<>("",HttpStatus.OK);
    }


}
