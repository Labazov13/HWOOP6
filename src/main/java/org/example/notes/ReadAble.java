package org.example.notes;

import java.util.List;

public interface ReadAble {
    List<Note> getAllNotes();
    public String getNote() throws Exception;
}
