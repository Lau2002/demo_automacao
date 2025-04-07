package com.demo_automacao.controller;

import com.demo_automacao.service.SmokeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SmokeController {

    private final SmokeService smokeService;

    @GetMapping("/smoke")
    public ResponseEntity<String> getSmokeTest() {
        return ResponseEntity.ok(smokeService.smokeTest());
    }

    @GetMapping("/protected")
    public ResponseEntity<String> getProtectedEndpoint() {
        return ResponseEntity.ok("Este endpoint está protegido!");
    }
}