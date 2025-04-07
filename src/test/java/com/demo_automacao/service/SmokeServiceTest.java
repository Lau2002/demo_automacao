package com.demo_automacao.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SmokeServiceTest {

    @InjectMocks
    private SmokeService smokeService;

    @Test
    void givenNoErrorsWhenGetSmokeTestThenShouldReturnSuccessful() {
        String expected = "[SUCCESS]";

        String result = smokeService.smokeTest();

        assertEquals(expected, result);
    }

}