package com.rohan.dp.decorator.solution.ex2;

public class ErrorDecorator implements AbstractArtefact {

    private AbstractArtefact artefact;

    public ErrorDecorator(AbstractArtefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return artefact.render() + " [Error]";
    }
}
