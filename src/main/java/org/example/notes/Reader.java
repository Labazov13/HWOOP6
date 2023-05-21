package org.example.notes;

import java.util.ArrayList;
import java.util.List;

public class Reader implements ReadAble {
    FileOperation fileOperation;
    NoteMap noteMap = new NoteMap();

    public Reader(FileOperation fileOperation) {
        this.fileOperation = fileOperation;

    }

    @Override
    public List<Note> getAllNotes() {
        List<String> lines = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(noteMap.map(line));
        }
        return notes;
    }

    @Override
    public String getNote() throws Exception {
        String ID = Viewer.enterString("Введите ID заметки: ");
        List<Note> notes = getAllNotes();
        for (Note note : notes) {
            if (note.getID().equals(ID)) {
                System.out.println(note);
                return ID;
            }
        }
        throw new Exception("User not found");
    }
}
