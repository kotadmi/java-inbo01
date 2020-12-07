package ru.kotadmi.Laba1.Pr_21.Ex3;

public class MusicDocumentFactory implements AbstractDocumentFactory {

    @Override
    public Document create() {
        return new MusicDocument(Status.NEW);
    }

    @Override
    public Document open() {
        return new MusicDocument(Status.OPENED);
    }
}
