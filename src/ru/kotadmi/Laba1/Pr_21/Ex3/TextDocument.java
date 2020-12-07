package ru.kotadmi.Laba1.Pr_21.Ex3;

public class TextDocument extends Document {

    public TextDocument(Status status) {
        super(status);
    }

    @Override
    public String getType() {
        return "text";
    }

}
