package ru.gb.jc_l1_lesson_1_ep3;

import java.util.Scanner;

public class MainHWep3 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Узнай правду о числе!");
        System.out.println("Введи число в поле этой консоли...");

        int usrInput = scanner.nextInt();

        if (usrInput < 0) {
            System.out.println("Число " + usrInput + " отрицательное");
        } else System.out.println("Число " + usrInput + " положительное");
        scanner.close();
    }
}
