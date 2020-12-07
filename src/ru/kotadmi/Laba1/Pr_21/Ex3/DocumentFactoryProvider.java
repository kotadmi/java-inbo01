package ru.kotadmi.Laba1.Pr_21.Ex3;

public class DocumentFactoryProvider {

    public static AbstractDocumentFactory getFactory(String type) {
        if (type.equals("image")) {
            return new ImageDocumentFactory();
        }
        if (type.equals("music")) {
            return new MusicDocumentFactory();
        }
        if (type.equals("text")) {
            return new TextDocumentFactory();
        }
        return null;
    }

}
