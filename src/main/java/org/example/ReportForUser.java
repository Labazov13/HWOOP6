package org.example;

public class ReportForUser implements ReportAble{
    private User user;

    public ReportForUser(User user) {
        this.user = user;
    }

    @Override
    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}
