package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class POSTtesting {
    private String name;
    private String email;
    public POSTtesting() {}
    public POSTtesting(String name, String email)
    {
        this.name = name;
        this.email = email;
    }
    public String getName()
    {
        return this.name;
    }
    public String getEmail()
    {
        return this.email;
    }
    @PostMapping("/api/get")
    public ResponseEntity<String> get(@RequestBody String name, @RequestBody String email)
    {
        POSTtesting testing = new POSTtesting(name, email);
        return ResponseEntity.ok("Received:\n"+ testing.getName() + "\n" + testing.getEmail());
    }
}
