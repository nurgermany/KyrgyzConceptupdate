package com.example.xaxaton.Kyrgyz.Concept.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@PreAuthorize("hasRole('USER')")  //доступен только для пользователей
public class UserController{
}