public class Main {
    public static void year(int temp) {
        int year = temp;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            ;
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void main(String[] args) {
        task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2000;
        year(year);
    }
    public static void task2() {
        System.out.println("Задача 2");
    }
}