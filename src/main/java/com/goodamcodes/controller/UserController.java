package com.goodamcodes.controller;

import com.goodamcodes.dto.UserLocationDTO;
import com.goodamcodes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/locations")
    public List<UserLocationDTO> getUserLocation() {
        return userService.getUserLocation();
    }
}
