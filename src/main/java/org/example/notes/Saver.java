package org.example.notes;

import java.util.ArrayList;
import java.util.List;

public class Saver implements SaveAble{
    FileOperation fileOperation;
    NoteMap noteMap = new NoteMap();

    public Saver(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    public void saveAllNotes(List<Note> notes){
        List<String> lines = new ArrayList<>();
        for (Note item: notes) {
            lines.add(noteMap.map(item));
        }
        fileOperation.saveAllLines(lines);
    }
}
