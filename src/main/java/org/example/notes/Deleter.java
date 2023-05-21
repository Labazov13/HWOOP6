package org.example.notes;


import java.io.IOException;
import java.util.List;

public class Deleter implements DeleteAble {
    FileOperation fileOperation;
    ReadAble reader;
    NoteMap noteMap = new NoteMap();

    public Deleter(FileOperation fileOperation, ReadAble reader) {
        this.fileOperation = fileOperation;
        this.reader = reader;
    }

    public void deleteNote(String ID) throws IOException {
        List<Note> notes = reader.getAllNotes();
        for(Note note : notes){
            if(note.getID().equals(ID)){
                deleteNote(note, ID);
            }
        }
    }

    public void deleteNote(Note note, String ID) throws IOException {
        List<String> lines = fileOperation.readAllLines();
        for(String line : lines){
            if(noteMap.map(line).getID().equals(ID)){
                fileOperation.deleteLine(line);
            }
        }
    }
}

