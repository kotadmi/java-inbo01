package ru.kotadmi.Laba1.Pr_21.Ex3;

public class ImageDocumentFactory implements AbstractDocumentFactory {

    @Override
    public Document create() {
        return new ImageDocument(Status.NEW);
    }

    @Override
    public Document open() {
        return new ImageDocument(Status.OPENED);
    }
}

