package org.example.notes;

public class Note {
    private String ID = "";
    private String header;
    private String text;

    public Note(String header, String text) {
        this.header = header;
        this.text = text;
    }

    public Note(String ID, String header, String text) {
        this(header, text);
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public String getHeader() {
        return header;
    }

    public String getText() {
        return text;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("ID: %s\nЗаголовок: %s\nТекст записки:\n%s", getID(), getHeader(), getText());
    }
}


