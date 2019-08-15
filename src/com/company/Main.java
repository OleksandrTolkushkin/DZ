package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //1. Приветствовать любого пользователя при вводе его имени через командную строку.
        /*  Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Privet" + name);
        }
    }*/
        /*2. Отобразить в окне консоли аргументы командной строки в обратном порядке.*/
        /* Scanner scanner = new Scanner(System.in);*/
        /*System.out.print("Введите цифры: ");
        int value = scanner.nextInt();
        int mirror = 0;
        while (value != 0) {
            mirror = mirror * 10 + (value % 10);
            value = value / 10;
        }
        System.out.print("Обратная последовательность цифр: " + mirror);
    }
}*/
        /*3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.*/
        /*int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : a) {
            System.out.println(i);
            System.out.print(i);
        }
    }
}*/
//4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
/*        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String password1 = scanner.next();
        String password2 = "Task1.4";
        if (password1.equals(password2))
            System.out.println("Пароль верен");
        else System.out.println("Пароль не совпадает. Повторите попытку.");
    }
}*/
//5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целые цисла: ");
        int value = scanner.nextInt();
        int sum = 0;
        while (value != 0) {
            sum = sum + value % 10;
            value = value / 10;
        }
        System.out.println("Cумма чисел: " + sum);
    }
}