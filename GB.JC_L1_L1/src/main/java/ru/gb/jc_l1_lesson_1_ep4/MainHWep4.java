package ru.gb.jc_l1_lesson_1_ep4;

import java.util.Scanner;

public class MainHWep4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите Ваше Имя: ");
        String name = in.nextLine();
        System.out.printf("Привет, %s!\n", name);
        in.close();
    }
}
