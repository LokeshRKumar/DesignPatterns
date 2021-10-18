package com.pattern.strategy.dog.behaviour.impl;

import com.pattern.strategy.dog.behaviour.Barking;

public class NaturalBarking implements Barking {

    @Override
    public void bark() {
        System.out.println("Barking naturally!!");
    }
}
