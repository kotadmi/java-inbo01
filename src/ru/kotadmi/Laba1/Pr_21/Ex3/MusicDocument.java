package ru.kotadmi.Laba1.Pr_21.Ex3;

public class MusicDocument extends Document {

    public MusicDocument(Status status) {
        super(status);
    }

    @Override
    public String getType() {
        return "music";
    }

}
