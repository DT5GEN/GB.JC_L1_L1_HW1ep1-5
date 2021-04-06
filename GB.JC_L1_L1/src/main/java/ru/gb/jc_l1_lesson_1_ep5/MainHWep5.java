package ru.gb.jc_l1_lesson_1_ep5;

import java.util.Scanner;

public class MainHWep5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите любой год: ");
        int year = in.nextInt();
        in.close();
        if ((year %4) == 0){
            System.out.print("Год високосный!");
        } else System.out.print("Год невисокосный!");

    }
}

