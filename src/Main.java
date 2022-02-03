public class Main {
    public static void main(String[] args) {


        // Task 1//

        int clientOs = 0;
        switch (clientOs) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }

        // Task 2//

        int clientOS = 1;
        int clientDeviceYear = 2016;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        // Task 3//

        int year = 2100;
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }

        // Task 4//

        int deliveryDistance = 95;
        int deliveryTime;

        if (deliveryDistance <= 20) {
            deliveryTime = 1;
            System.out.println("Потребуется дней " + deliveryTime);
        }
        if (20 < deliveryDistance && deliveryDistance < 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней " + deliveryTime);
        }
        if (60 < deliveryDistance && deliveryDistance < 100) {
            deliveryTime = 3;
            System.out.println("Потребуется дней " + deliveryTime);
        }

        // Task 5//

        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}


