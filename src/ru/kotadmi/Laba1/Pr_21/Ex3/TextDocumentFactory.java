package ru.kotadmi.Laba1.Pr_21.Ex3;

public class TextDocumentFactory implements AbstractDocumentFactory {

    @Override
    public Document create() {
        return new TextDocument(Status.NEW);
    }

    @Override
    public Document open() {
        return new TextDocument(Status.OPENED);
    }
}