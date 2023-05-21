package org.example.notes;

import java.util.List;

public class Changer implements ChangeAble{
    ReadAble reader;
    SaveAble saver;

    public Changer(ReadAble reader, SaveAble saver) {
        this.reader = reader;
        this.saver = saver;
    }

    @Override
    public void changeNote() throws Exception {
        String id = reader.getNote();
        Note changeNote = Viewer.createNote();
        changeNote.setID(id);
        updateNote(changeNote);
    }
    public void updateNote(Note changeNote) {
        List<Note> notes = reader.getAllNotes();
        for (Note note : notes) {
            if(note.getID().equals(changeNote.getID())){
                note.setHeader(changeNote.getHeader());
                note.setText(changeNote.getText());
            }
        }
        saver.saveAllNotes(notes);
    }
}


