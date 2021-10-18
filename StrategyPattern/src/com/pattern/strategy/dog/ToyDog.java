package com.pattern.strategy.dog;

public class ToyDog extends Dog{
    @Override
    public void doBiting() {
        System.out.println("Toy Dogs cant bite");
    }
}
