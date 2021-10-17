package com.pattern.strategy.dog.behaviour.impl;

import com.pattern.strategy.dog.behaviour.Snuffing;

public class RegularSnuffing implements Snuffing {
    @Override
    public void snuff() {
        System.out.println("regular snuffing!!");
    }
}
