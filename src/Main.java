public class Main {

    public static void main(String[] args) {
        // Задание 1 iOS VS Android
        // использую BYTE ибо точно знаю, что значение 0 или 1
        byte clientOS = 0;  // iOS is better
        System.out.println("// Задание 1");
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылк");
                break;
        }
        // Задание 2 = Задание 1 + проверить год
        // byte clientOS = 0; - объявлено ранее
        clientOS = 1; // инициализация
        int clientDeviceYear = 2015;
        int oldYear = 2015;
        boolean isYearSoOld = clientDeviceYear < oldYear;
        System.out.println("// Задание 2");
        switch (clientOS) {
            case 0:
                if (isYearSoOld) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (isYearSoOld) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
        }
        // Задание 3
        System.out.println("// Задание 3");
        int year = 3033;
        int valueMod; //Оператор деления по модулю
        boolean isLeapYear = false;
        // если ни один if  не отработает - значение isLeapYear не изменится!
        if (year % 400 == 0) {
            isLeapYear = true;
        } else if (year % 100 == 0) {
            isLeapYear = false;
        } else if (year % 4 == 0) {
            isLeapYear = true;
        }
        if (isLeapYear == true) {
            System.out.println(year + "год является високосным");
        } else {
            System.out.println(year + " год не  является високосным");
        }


    }
}

