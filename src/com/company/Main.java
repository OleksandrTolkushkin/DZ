package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      /*  Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Privet" + name);
        }
    }*/
        /*2. Отобразить в окне консоли аргументы командной строки в обратном порядке.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цифры: ");
        int value = scanner.nextInt();
        int mirror = 0;
        while (value != 0) {
            mirror = mirror * 10 + (value % 10);
            value = value / 10;
        }
        System.out.print("Обратная последовательность цифр: " + mirror);
    }
}

