package com.pattern.strategy.dog.test;

import com.pattern.strategy.dog.Dog;
import com.pattern.strategy.dog.PetDog;
import com.pattern.strategy.dog.StreetDog;
import com.pattern.strategy.dog.ToyDog;
import com.pattern.strategy.dog.behaviour.impl.MockBarking;
import com.pattern.strategy.dog.behaviour.impl.NaturalBarking;
import com.pattern.strategy.dog.behaviour.impl.NoSnuffing;
import com.pattern.strategy.dog.behaviour.impl.RegularSnuffing;

public class TestStrategyPattern {
    public static void main(String[] args) {
        Dog pet = new PetDog();
        pet.setBarking(new NaturalBarking());
        pet.setSnuffing(new RegularSnuffing());

        Dog streetDog = new StreetDog();
        streetDog.setBarking(new NaturalBarking());
        streetDog.setSnuffing(new RegularSnuffing());

        Dog toy = new ToyDog();
        toy.setBarking(new MockBarking());
        toy.setSnuffing(new NoSnuffing());

        pet.doBarking();
        pet.doBiting();
        pet.doSnuffing();
        pet.doWalking();
        System.out.println("--------------------");
        streetDog.doBarking();
        streetDog.doBiting();
        streetDog.doSnuffing();
        streetDog.setSnuffing(new NoSnuffing());
        streetDog.doSnuffing();
        streetDog.doWalking();
        System.out.println("--------------------");
        toy.doBarking();
        toy.doBiting();
        toy.doSnuffing();
        toy.doWalking();

    }
}
