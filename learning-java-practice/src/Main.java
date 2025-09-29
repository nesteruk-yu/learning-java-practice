import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//1. Дано уравнение: (10+12)*x=88;. Найти значение x.
        double x = 88.0 / (10 + 22);
        System.out.println(x);

//4. Введите x,y,z. К числу x прибавьте y, число y умножьте на z. Используйте операции присваивания.Результат выведите в косноль
//
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Введи x");
//        int x = in.nextInt();
//
//        System.out.println("Введи y");
//        int y = in.nextInt();
//
//        System.out.println("Введи z");
//        int z = in.nextInt();
//
//        int result = (x+y)*z;
//        System.out.println(result);
//
//5. Дано уравнение 213/x+258/x+60=217. Вывести в консоль чему будет равен x

//        double x = (213 + 258.0)/(217 - 60);
//        System.out.println(x);

// 6. Даны значения: x=5; y=2; c=x*y; Расставьте операции инкремента декремента так,
// чтобы после выполнения операции (c=x*y) с=10; x=6; y=1

//        int x = 5;
//        int y = 2;
//
//        System.out.println("c равно " + (x++ * y--));
//        System.out.println("x равно " + x);
//        System.out.println("y равно " + y);

//1. Ввести числа a и b с консоли. Если a>b, то вывести разность (a-b) передав ее в новую переменную.
// Иначе если a=b  вывести сумму этих чисел.
//Иначе, вывести разность b-a. Результат вычисления передать в новую переменную.

//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Введи a");
//        int a = in.nextInt();
//        System.out.println("Введи b");
//        int b = in.nextInt();
//
//        if (a > b) {
//            int aa = a - b;
//            System.out.println(aa);
//        } else if (a == b) {
//            int bb = b + a;
//            System.out.println(bb);
//        } else {
//            int cc = b - a;
//            System.out.println(cc);
//        }

// 2. Ввести числа a и b с консоли. Если a>b и b не равно 0-вывести результат деления a на b.
// Иначе если a не равно 0, вывести b/a, Иначе вывести сумму чисел a и b.
//
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Введи a");
//        int a = in.nextInt();
//        System.out.println("Введи b");
//        int b = in.nextInt();
//
//        if (a > b && b != 0) {
//            double aa = (double)a / b;
//            System.out.println(aa);
//        } else if (a != 0) {
//            System.out.println((double) b/a);
//        } else {
//            System.out.println(a + b);
//        }

//        3. На вход дано число. Определить, делиться ли оно на три. Вывести соответствующий текст.
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Введи a");
//        int a = in.nextInt();
//
//        if (a % 3 == 0){
//            System.out.println("Число " + a + " делится на 3");
//        } else {
//            System.out.println("Число " + a + " не делится на 3");
//        }
    }
}