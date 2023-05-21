package org.example.notes;

import java.util.List;

public class Creater implements CreateAble {
    ReadAble reader;
    SaveAble saveAble;
    public Creater(ReadAble reader, SaveAble saveAble) {
        this.reader = reader;
        this.saveAble = saveAble;
    }

    @Override
    public String createNote(Note note) {
        List<Note> notes = reader.getAllNotes();
        int max = 0;
        for (Note item : notes) {
            int id = Integer.parseInt(item.getID());
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        note.setID(id);
        notes.add(note);
        saveAble.saveAllNotes(notes);
        return id;
    }
}
