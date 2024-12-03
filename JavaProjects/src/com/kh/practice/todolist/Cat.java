package com.kh.practice.todolist;


    public class Cat extends Animal {
        public void makeSound() {
            super.makeSound();
        }

        private String Meow;

        public Cat() {
        }

        public Cat(String meow) {
            Meow = meow;
        }

        public String getMeow() {
            return Meow;
        }

        public void setMeow(String meow) {
            Meow = meow;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "Meow='" + Meow + '\'' +
                    '}';
        }


    }

