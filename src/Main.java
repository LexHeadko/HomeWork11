import java.time.LocalDate;

public class Main {
    public static void findYear(int temp) {
        int year = temp;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            ;
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void mobileApp(int yearRelease, byte osClient) {
        int yearOfRelease = yearRelease;
        byte clientOS = osClient; // 0 - iOS, 1 - AndroidOS
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && yearOfRelease < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && yearOfRelease < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && yearOfRelease >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && yearOfRelease >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void dilivery (int distance) {
        int deliveryDistance = distance;
        if (deliveryDistance <= 100) {
            int days = 1;
            if (deliveryDistance > 20) {
                days++;
            }
            if (deliveryDistance > 60) {
                days++;
            }
            System.out.println("Доставка займет " + days + " дн.");
        } else {
            System.out.println("Доставки нет!");
        }
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
        findYear(year);
    }
    public static void task2() {
        System.out.println("Задача 2");
        int yearOfRelease = 2023;
        byte clientOS = 0; // 0 - iOS, 1 - AndroidOS
        mobileApp(yearOfRelease, clientOS);
    }
    public static void task3() {
        System.out.println("Задача 3");
        int distance = 65;
        dilivery(distance);
    }
}