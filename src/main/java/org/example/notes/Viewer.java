package org.example.notes;

import java.util.Scanner;

public class Viewer {
    CreateAble creater;
    ReadAble reader;
    ChangeAble changer;
    DeleteAble deleter;

    public Viewer(CreateAble creater, ReadAble reader, ChangeAble changer, DeleteAble deleter) {
        this.creater = creater;
        this.reader = reader;
        this.changer = changer;
        this.deleter = deleter;
    }

    public void contextMenu(){
        System.out.println("1.Создать запись\n2.Прочитать блокнот\n3.Прочитать запись\n4.Изменить запись\n5.Удалить запись\n6.Выход");
    }
    public void run() throws Exception {
        int command = 0;

        while (true){
            contextMenu();
            command = enterInt("Выберите действие: ");
            if(command == 6){
                return;
            }
            switch (command){
                case 1:
                    creater.createNote(createNote());
                    break;
                case 2:
                    System.out.println(reader.getAllNotes());
                    break;
                case 3:
                    reader.getNote();
                    break;
                case 4:
                    changer.changeNote();
                    break;
                case 5:
                    deleter.deleteNote(reader.getNote());
                    break;
            }
        }
    }
    public int enterInt(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }
    public static String enterString(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
    public static Note createNote(){
        String header = enterString("Введите заголовок: ");
        String text = enterString("Введите текст заметки: ");
        return new Note(header, text);
    }
}
