package com.example.demo.controller;

import com.example.demo.repository.ContactRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.model.Contact;
import com.example.demo.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("/api/reports")
@CrossOrigin(origins = "http://localhost:5500") 
public class ReportController {

 @Autowired
 private ContactRepository contactRepository;

 @Autowired
 private UserRepository userRepository;

 
 @GetMapping("/contact-count")
 public List<Map<String, Object>> getContactCountPerUser() {
     List<User> users = userRepository.findAll();
     List<Map<String, Object>> response = new ArrayList<>();

     for (User user : users) {
         Map<String, Object> map = new HashMap<>();
         map.put("userName", user.getName());
         map.put("contactCount", contactRepository.countByUserId(user.getId()));
         response.add(map);
     }

     return response;
 }

 
 @GetMapping("/recent-contacts")
 public List<Contact> getRecentContacts() {
     return contactRepository.findTop5ByOrderByIdDesc();
 }
}
