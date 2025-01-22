package com.alpha.portfolio;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api")
@CrossOrigin("https://dipakkhaire23.github.io")  // Allow requests from the React frontend
public class ContactController {

    @Autowired
    private ContactMessageRepository contactMessageRepository;

    @PostMapping(value = "/contact", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> submitContactForm(@RequestBody ContactMessage contactMessage) {
        // Save the contact message in the repository
        contactMessageRepository.save(contactMessage);

        // Return a successful response
        return ResponseEntity.ok("{\"status\": \"success\"}");
    }
    @RequestMapping("/hello")
    public ResponseEntity<Map<String, String>> hello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, world!");
        return ResponseEntity.ok(response);
    }

}
