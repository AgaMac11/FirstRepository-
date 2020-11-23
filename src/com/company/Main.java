package com.company;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog. species = "Samoyed";
        dog.name = "Falko";

        System.out.println(dog.species);
        System.out.println(dog.name);

        Human me = new Human();
        me.firstName = "Agata";
        me.lastName = "Maciesza";
        me.pet = dog;

        Phone s = new Phone();
        s.producer= "Samsung";
        s.model = 10;
        s.colour = "Silver";
        s.screensize = 5.0;

        System.out.println(me.firstName);
        System.out.println(me.lastName);
        System.out.println(me.pet.species);
        System.out.println(me.pet.name);
        System.out.println(s.producer);
        System.out.println(s.model);
        System.out.println(s.screensize);
        System.out.println(s.colour);




    }
}
