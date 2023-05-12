package com.project.loanApp.controller;

import com.project.loanApp.service.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Mail")
//@CrossOrigin(origins = "*")
public class MailController {

    @Autowired(required = true)
    private MailServiceImpl mailService;

    @PostMapping("/Sending")
    public ResponseEntity<String> sendMail(@RequestParam String email) {
        mailService.sendMail(email);
        return new ResponseEntity<String>("Mail Sent to: " + email, HttpStatus.OK);
    }

}