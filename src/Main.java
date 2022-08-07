public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("У нас нет приложеия для вашей операционной системы");
        }
    }

    public static void task2() {
        int clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("У нас нет приложеия для вашей операционной системы");
        }
    }

    public static void task3() {
        int year = 2021;
        int chekYear = year % 4;
        int chek100Years = year % 100;
        int chek400Years = year % 400;

        if (chek400Years == 0) {
            System.out.println(year + " год является високосным.");
        } else if (chekYear == 0 && chek100Years != 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void task4() {
        int deliveryDistance = -101;
        int chekDistanc = (deliveryDistance - 20) % 40;
        int addDays = (deliveryDistance - 20) / 40;
        if (deliveryDistance <= 20 && deliveryDistance > 0) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance > 20 && chekDistanc == 0) {
            System.out.println("Потребуется " + (1 + addDays) + " дней.");
        } else if (deliveryDistance > 20 && chekDistanc != 0) {
            System.out.println("Потребуется " + (2 + addDays) + " дней.");
        } else {
            System.out.println("Мы не доставляем в прошлое.");
        }
    }

    public static void task5() {
        int monthNumber = 1;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это зимний месяц.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
    }

    public static void task6() {
        int age = 19;
        double salary = 58_000;
        double limit;

        if (age < 23 && salary < 50_000) {
            limit = salary * 2;
        } else if (age >= 23 && salary < 50_000) {
            limit = salary * 3;
        } else if (age < 23 && salary >= 50_000 && salary < 80_000) {
            limit = salary * 2 * 1.2;
        } else if (age >= 23 && salary >= 50_000 && salary < 80_000) {
            limit = salary * 3 * 1.2;
        } else if (age < 23 && salary >= 80_000) {
            limit = salary * 2 * 1.5;
        } else {
            limit = salary * 3 * 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей.");
    }
}