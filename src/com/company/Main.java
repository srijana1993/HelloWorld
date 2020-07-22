package com.company;
import java.util.Date;
import java.text.SimpleDateFormat;



public class Main {
    public static void main(String[] args) {
        System.out.println("hello world ! from github.com.");
        System.out.print("Srijana Timalsina");
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));

    }
}
