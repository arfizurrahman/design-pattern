package com.codewithmosh.decorator;

public class Editor {
    public void openProject(String path) {
        AbstractArtefact[] artefacts = {
                new Artefact("Main"),
                new Artefact("Demo"),
                new Artefact("EmailClient"),
                new Artefact("EmailProvider"),
        };

        artefacts[0] = new ErrorDecorator(new MainDecorator(artefacts[0]));
        artefacts[1] = new ErrorDecorator(artefacts[1]);

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
