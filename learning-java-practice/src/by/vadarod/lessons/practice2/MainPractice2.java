package by.vadarod.lessons.practice2;

import java.util.Arrays;

public class MainPractice2 {
    public static void main(String[] args) {
//  1. Необходимо, чтобы программа отображала следующую последовательность чисел: 7 14 21 28 35 42 49 56 63 70 77 84 91 98

//        for (int i = 0; i < 97;){
//            i = i +7;
//            System.out.println(i);
//        }

//        int i = 0;
//        while (i < 98) {
//            i = i +7;
//            System.out.println(i);
//        }

//  2. Необходимо вывести следующую последовательность цифр: 1 2 4 8 16 32 64 128 256 512 (цикл while)

//        int i = 1;

//        System.out.println(i);
//
//        while (i < 512) {
//            i = i*2;
//            System.out.println(i);
//        }
//
//        do {
//            System.out.println(i);
//            i = i*2;
//        } while (i < 513);
//    }

//  3. Написать программу, которая посчитает сумму первых 10 чисел (цикл while)

//        int i = 1;
//        int j = 10;
//        int result = 0;
//
//        while (i <= j) {
//            result = result + i;
//            i++;
//        }
//
//        System.out.println(result);

//  4. Вывести числа от 100 до 1 через запятую. В конце не должно быть запятой

//        int i = 100;
//
//        while (i > 1) {
//            System.out.print(i + ", ");
//            i--;
//        }
//        System.out.print(i);

//  8. Создать массив из чисел. Вывести макс и мин число.
//
//        int massive[] = {23, 545, 3, 6556, 232};
//
//        int min = massive[0];
//        int max = massive[0];
//        for (int i = 0; i < massive.length; i++) {
//
//            if (massive[i] < min) {
//                min = massive[i];
//            }
//
//            if (massive[i] > max){
//            max = massive[1];
//            }
//        }
//        System.out.println("Минимальное значение " + min);
//        System.out.println("Максимальное значение " + max);
//
//  10. Сортировать массив чисел. Сортирвка пузырьком
        int massive[] = {23, 545, 3, 6556, 232};

        for (int i = massive.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {

                if (massive[j] > massive
                        [j + 1]) {
                    int x = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = x;
                }
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}
