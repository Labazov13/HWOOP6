package org.example.notes;

public class Main {
    public static void main(String[] args) throws Exception {
        FileOperation fileOperation = new FileOperations("NoteBook.txt");
        ReadAble reader = new Reader(fileOperation);
        SaveAble saver = new Saver(fileOperation);
        ChangeAble changer = new Changer(reader, saver);
        DeleteAble deleter = new Deleter(fileOperation, reader);
        CreateAble creater = new Creater(reader, saver);
        Viewer view = new Viewer(creater, reader, changer, deleter);
        view.run();
    }
}
