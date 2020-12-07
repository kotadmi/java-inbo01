package ru.kotadmi.Laba1.Pr_21.Ex3;

public class ImageDocument extends Document {

    public ImageDocument(Status status) {
        super(status);
    }

    @Override
    public String getType() {
        return "image";
    }

}
