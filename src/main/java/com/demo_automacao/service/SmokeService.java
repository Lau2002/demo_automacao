package com.demo_automacao.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SmokeService {

    public String smokeTest() {
      return "[SUCCESS]";
    }
}