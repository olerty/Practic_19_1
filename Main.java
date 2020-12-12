package com.company.z1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws INNException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ФИО:");
        String name = scan.nextLine();
        System.out.println("Введите ИНН:");
        String inn = scan.nextLine();
        Client client1 = new Client(name, inn);
        System.out.println(client1.toString());
    }
}
