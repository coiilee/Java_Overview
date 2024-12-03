package com.kh.practice.todolist;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
    }

    private String Woof;

    public Dog() {
    }

    public Dog(String woof) {
        Woof = woof;
    }

    public String getWoof() {
        return Woof;
    }

    public void setWoof(String woof) {
        Woof = woof;
    }

    @Override
    public String toString() {
        return super.toString() + "Dog 울음소리 :" +Woof;
    }

}
