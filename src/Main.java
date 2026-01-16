public class Main {
    public static void main(String[] args) {
        //Exercise 1
        System.out.println("***Задача 1***");
        //Объявляем переменную clientOS, которая равна 0 или 1 (0 — iOS, 1 — Android).
        int clientOS = 1;
        if (clientOS < 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Exercise 2
        System.out.println("***Задача 2***");
        //Инициализируем переменную clientOS, которая равна 0 или 1 (0 — iOS, 1 — Android).
        clientOS = 0;
        //Объявляем переменную переменную clientDeviceYear, в которой необходимо указать год создания телефона 2015 год.
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("становите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        //Exercise 3
        System.out.println("***Задача 3***");
        //Объявляем переменную переменную year, в которой необходимо указать год для проверки
        int year = 2021;
        boolean startYear = year <= 1584;
        boolean each400Year = year % 400 == 0;
        boolean each100Year = year % 100 != 0;
        boolean each4Year = year % 4 == 0;
        if (startYear) {
            System.out.println("В " + year + " году високосный год ещё не ввели");
        } else if ((each4Year && each100Year) || each400Year) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //Exercise 4
        System.out.println("***Задача 4***");
        //Объявляем целочисленную переменную deliveryDistance, которая содержит дистанцию до клиента.
        int deliveryDistance = 95;
        boolean dist20 = deliveryDistance <= 20;
        boolean dist60 = deliveryDistance > 20 && deliveryDistance <= 60;
        boolean dist100 = deliveryDistance > 60 && deliveryDistance <= 100;
        if (dist20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (dist60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (dist100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
        //Exercise 5
        System.out.println("***Задача 5***");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Сейчас месяц январь, зима");
                break;
            case 2:
                System.out.println("Сейчас месяц февраль, зима");
                break;
            case 3:
                System.out.println("Сейчас месяц март, весна");
                break;
            case 4:
                System.out.println("Сейчас месяц апрель, весна");
                break;
            case 5:
                System.out.println("Сейчас месяц май, весна");
                break;
            case 6:
                System.out.println("Сейчас месяц июнь, лето");
                break;
            case 7:
                System.out.println("Сейчас месяц июль, лето");
                break;
            case 8:
                System.out.println("Сейчас месяц август, лето");
                break;
            case 9:
                System.out.println("Сейчас месяц сентябрь, осень");
                break;
            case 10:
                System.out.println("Сейчас месяц октябрь, осень");
                break;
            case 11:
                System.out.println("Сейчас месяц ноябрь, осень");
                break;
            case 12:
                System.out.println("Сейчас месяц декабрь, зима");
                break;
            default:
        }
    }
}