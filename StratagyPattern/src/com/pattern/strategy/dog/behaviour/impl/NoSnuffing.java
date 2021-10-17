package com.pattern.strategy.dog.behaviour.impl;

import com.pattern.strategy.dog.behaviour.Snuffing;

public class NoSnuffing implements Snuffing {
    @Override
    public void snuff() {
        System.out.println("Cannot snuff!!");
    }
}
