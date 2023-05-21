package org.example;

public class Main {
    public static void main(String[] args){		//Вопрос - нужен ли нам в таком случае класс Persister вообще?
        User user = new User("Bob");
        Saver saver = new Saver(user);
        ReportForUser report = new ReportForUser(user);
        report.report();
        saver.save();
    }
}