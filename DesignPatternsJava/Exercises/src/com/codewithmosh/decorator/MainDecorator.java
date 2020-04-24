package com.codewithmosh.decorator;

public class MainDecorator implements AbstractArtefact {
    private AbstractArtefact artefact;

    public MainDecorator(AbstractArtefact abstractArtefact) {
        this.artefact = abstractArtefact;
    }

    @Override
    public String render() {
        return artefact.render() + " [Main]";
    }
}
