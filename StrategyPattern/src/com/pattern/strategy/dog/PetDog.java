package com.pattern.strategy.dog;

public class PetDog extends Dog{
    @Override
    public void doBiting() {
        System.out.println("Pet do not bite!");
    }
}
