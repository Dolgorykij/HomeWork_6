//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for ( int i = 1; i<=10; i++ ) {
            System.out.println(i);
        }
        System.out.println("Задание 2");
        for (int i = 10; i>=1; i--) {
            System.out.println(i);
        }
        System.out.println("Задание 3");
        for (int i =0; i<=17; i=i+2) {
            System.out.println(i);
        }
        System.out.println("Задание 4");
        for (int i =10;i >=-10;i = i-1) {
            System.out.println(i);
        }
        System.out.println("Задание 5");
        for (int i =1904;i <=2096; i =i+4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("Задание 6");
        for (int i = 0;i<=98;i = i+7) {
            System.out.println(i);
        }
        System.out.println("Задание 7");
        for (int i = 1;i<=512; i = i*2) {
            System.out.println(i);
        }
        System.out.println("Задание 8");
        {int savings = 29000;
        int capital = 0;
        for (int i =0; i<12; i++) {
            capital = capital + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + capital);
        }}
        System.out.println("Задание 9");
        int savings = 29000;
        int capital = 0;
        for (int i =0; i<12; i++) {
            capital = capital + capital / 100;
            capital = capital + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + capital);
        }
        System.out.println("Задание 10");
        int number = 2;
        for (int i =1;i<=10;i++) {
            System.out.println(number*i);
        }
    }
}