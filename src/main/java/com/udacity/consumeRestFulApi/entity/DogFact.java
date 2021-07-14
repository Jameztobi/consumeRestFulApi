package com.udacity.consumeRestFulApi.entity;

import java.util.ArrayList;
import java.util.List;

public class DogFact {
   private List<Fact> fact;


    public DogFact(List<Fact> fact) {
        this.fact = fact;
    }

    @Override
    public String toString() {
        return "DogFact{" +
                "fact=" + fact.get(0) +
                '}';
    }
}
