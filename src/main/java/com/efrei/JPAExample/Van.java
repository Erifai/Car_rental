package com.efrei.JPAExample;

import javax.persistence.Entity;

@Entity
public class Van extends Vehicule {
    protected float maxWeight;

    public Van(String plaque , float maxW){
        super(plaque);
        this.maxWeight=maxW;
    }

    public float getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }
}
