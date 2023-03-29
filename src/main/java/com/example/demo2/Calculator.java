package com.example.demo2;

import org.springframework.stereotype.Component;

/**
 * @author kurakuraninja
 * @since 29/03/23
 */

@Component
public class Calculator {
    public int plus(int a, int b){
        return a + b;
    }

    public int min(int a, int b){
        return a - b;
    }
}
