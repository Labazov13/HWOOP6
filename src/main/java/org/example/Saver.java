package org.example;

public class Saver implements SaveAble {

    private User user;

    public Saver(User user) {
        this.user = user;
    }

    @Override
    public void save() {
        System.out.println("Save user: " + user.getName());
    }
}
