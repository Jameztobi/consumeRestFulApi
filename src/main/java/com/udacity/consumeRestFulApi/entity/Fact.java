package com.udacity.consumeRestFulApi.entity;

public class Fact {
    private String fact;

    public Fact() {
    }

    public Fact(String fact) {
        this.fact = fact;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }
}
