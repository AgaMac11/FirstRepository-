package com.company;

public class Animal {
    String species;
    String name;
    Double weight;
    final static Double MIN_WEIGHT = 2.0;
    public Boolean isAlive = true;

    public Animal (String species) {
        this.species = species;
    }

    void feed(Double foodWeight) {
        if (this.isAlive) {
            this.weight += foodWeight;
            System.out.println("Thanks for food");
        } else {
            System.out.println("Too late");
        }
    }

    void takeForAWalk() {
        if (this.isAlive) {
            this.weight--;
            System.out.println("Thanks for a walk");
            if (this.weight < MIN_WEIGHT) {
                this.isAlive = false;
            }
            } else {
            System.out.println("Dead");
        }
    }
    Double getWeight() {
        return weight;
    }


}
