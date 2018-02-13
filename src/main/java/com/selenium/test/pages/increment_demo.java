package com.selenium.test.pages;

import static java.lang.System.out;

import java.util.Scanner;

public class increment_demo {
    public static void main1(String[] args) {
        int j = 1;
        int k = 8;

        for (int i = 0; i < 3; ++i) {
            //System.out.println("i=" + new Integer(++i).toString() + ", j=" + j++);
            int kk = ++k;
            int jj = j++ + 6;
            System.out.println("kk=" + kk + ", jj=" + jj);
            System.out.println("i=" + i + ", j=" + j + ", k=" + k);
            k -= 5;
        }

        System.out.println("j=" + j + ", k=" + k);
    }

    public static void main2(String[] args) {
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void main3(String[] args) {
        for (int i = 1; i <= 10; i++) {
//            System.out.println("3*" + i + "=" + 3 * i);

            String i_str = new Integer(i).toString();
            String i3_str = new Integer(i * 3).toString();
            String str1 = "3*";
            String str2 = str1 + i_str;
            String str3 = str2 + "=";
            String str = str3 + i3_str;
            System.out.println(str);
        }
    }

    static int get_index(int v) {
        return v + 1;
    }

    public static void main4(String[] args) {

        int[] array1 = new int[3];

        array1[0] = 5;
        array1[1] = 17;
        array1[2] = 350;

//        System.out.println(array1[0]);
//        System.out.println(array1[1]);
//        System.out.println(array1[2]);

        for (int i = -1; i < array1.length - 1; i++) {
            System.out.println(array1[get_index(i)]);
        }
    }

    // пользователь вводит любое число от 1 до 10 и на экран выводится табюлица умножения введенного пользователем числа
    public static void main667(String[] args) {
        System.out.print("Введите любое целое положительное число от 1 до 10 : ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int x = 1; x <= count; x++) { // цикл для таблицы умножения в столбик
            for (int y = 1; y <= count; y++) { //цикл для таблицы умножения в столбик
                int result = x * y; //цикл для таблицы умножения в столбик
                //  int count = 10;

//        for (int x = 1; x <= count; x++) { //цикл для треугольника таблицы умножения
//            for (int y = 1; y <= x; y++) { //цикл для треугольника таблицы умножения
//                int result = x * y;       //цикл для треугольника таблицы умножения
                // System.out.printf("%4d", y);
                // System.out.printf("%4d", x*y); //вывблицы умножения на примере таб Пифагора
                //   System.out.printf("%5d",(result) );

                System.out.printf("\t\t%d * %d = %d", x, y, result);//вывод таблицы умножения в стобцах
            }
            System.out.printf("\n");
        }
    }

    /*      int i = 1;
          int j = 1;
          while (i <= 10) {
              j = 1;
              while (j <= 10) {
                  if (j == 10)
                      System.out.println(i * j + " ");
                  else
                      System.out.print(i * j + " ");
                  j++;
              }
              i++;
          }
      }
  */
    //Дано массив из 10 целых чисел. Вывести на экран сумму всех его элементов кроме первого и последнего.
    public static void main55(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 1; i < 9; i++)
            sum += a[i];

        System.out.println("Sum = " + sum);
    }

    //Простая программа для вывода элементов массива и матрицы, знакомимся ссылочными типами.
    public static void main7(String[] args) {
        // Создаём массив с типом строки
        String[] massive3 = {"Красный", "Синий", "Голубой"};
        // Создание двухмерного массива - матрицы
        int[][] matrix = {
                {1, 3, 2, 2},
                {2, 9, 4, 22, 2}
        };

        for (int i = 0; i < massive3.length; i++) {
            out.printf("%s ", massive3[i]);
        }
        out.println();

        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                out.printf("%3d", matrix[x][y]);
            }
            out.println();
        }
    }

    public static void main8(String[] args) {
        int count = 10;
        for (int i = 0; i < count; i++) {
            for (int k = 0; k < i + 1; k++) {
                out.print("*");
            }
            out.println();
//    out.println("****");
//    out.println("****");
//    out.println("****");
        }
    }

    //проверка корректности ввода данных пользователем в консоле
    public static void main54(String[] args) {
        System.out.print("Введите любое целое положительное число от 1 до 10 : ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        if (count < 1 || count > 10) {
            System.out.print("Вы ввели число не в диапазоне чисел от 1 до 10");
        }
        //  else if (count>10) {
        //  System.out.print("Вы ввели число не равное от 1 до 10");
    }


    public static void main777(String args[]) {
        int x = 30;

        if (x < 20) {
            System.out.print("Это оператор if");
        } else {
            System.out.print("Это оператор else");
        }
    }

    //вывод на экран таблиц истинности для операций AND OR XOR
    public static void main444(String[] args) {
        System.out.println("Это логический оператор AND");

        int x, y;

        for (x = 0; x < 2; x++) {
            for (y = 0; y < 2; y++) {
                boolean res = (y == 1) && (x == 1);


                System.out.printf("\t\t%d  %d =%s", x, y, String.valueOf(res));
                //System.out.printf(String.valueOf(res),"\n");

                System.out.printf("\n");

            }
        }
    }
    //Вычислите a+b
    //Исходные данные
    //a и b
    //Результат
    //a+b
    //Пример
    //исходные данные	1 и 5
    // результат 6
    //Замечания :Используйте +

    public static void main221(String[] args) {
        int a, b;
        a = 5;
        b = 1;
        int sum = (a + b);
        System.out.println("Результат сложения " + a + " и " + b + " = " + sum);

    }

    // Напишите метод, заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой».
    public static void main1155(String[] args) {
        String s = "Ах ты бяка";
        String s2 = s.replaceAll("бяка", "вырезано цензурой");//Метод replaceAll() — заменяет каждую подстроку данной строки, которая соответствует заданному регулярному выражению, с данной заменой, другими словами — метод позволяет заменить слово в строке.
        System.out.println(s2);
    }
//Создайте программу, которая вычислит выражение 20ˣ⅓+158² и выведет результат на экран.

    public static void main(String[] args) {
//        float x = 2;
//        float result = (float) Math.pow(20, x / 3) + (float) Math.pow(158, 2);
//        System.out.println("Result = " + result);
        double x1 = 20;
        double y1 = 1;
        double x2 = 158;
        double y2 = 2;
       // System.out.printf("Значение %.3f в степени %.2f равно %.3f \n", x1, y1, Math.pow(x1, y1));
        double result = Math.pow(x1,y1/3)+Math.pow(x2,y2);
        System.out.println(result);
//        double slag1 = 20.0*(1.0/3.0);
//        int slag2 = 158*158;
//        double result = slag1 + slag2;
//        System.out.println(slag1 + " + " + slag2 + " = " + result);

    }

    }