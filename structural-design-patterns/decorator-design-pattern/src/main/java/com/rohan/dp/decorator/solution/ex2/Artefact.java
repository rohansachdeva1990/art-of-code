package com.rohan.dp.decorator.solution.ex2;

public class Artefact implements AbstractArtefact {

    private String name;

    public Artefact(String name) {
        this.name = name;
    }

    @Override
    public String render() {
        return name;
    }
}
