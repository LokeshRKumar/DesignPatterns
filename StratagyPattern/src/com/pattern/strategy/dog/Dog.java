package com.pattern.strategy.dog;

import com.pattern.strategy.dog.behaviour.Barking;
import com.pattern.strategy.dog.behaviour.Snuffing;

public abstract class Dog{
    //Behaviour/Algorithm that can vary and also can be reused if other type of dog have the same behaviour.
    //So, Encapsulated that varies and composited in the Dog abstract class.
    protected Snuffing snuffing;
    protected Barking barking;

    //Made abstract method, that will vary and has no scope of re-usability of behaviour/algorithm
    public abstract void doBiting();
    //default algorithm for all dog (no future scope of changing) so implemented in the base class
    public void doWalking(){
        System.out.println("Dog walks!!");
    }
    //do snuffing
    public void doSnuffing() {
        snuffing.snuff();
    }
    // do snuffing
    public void doBarking() {
        barking.bark();
    }
    //to set snuffing behaviour at runtime
    public void setSnuffing(Snuffing snuffing) {
        this.snuffing = snuffing;
    }
    //to set barking behaviour at runtime
    public void setBarking(Barking barking) {
        this.barking = barking;
    }
}
