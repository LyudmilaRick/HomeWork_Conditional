public class Main {

    public static void main(String[] args) {
        // 12.10.2021
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
        int year = 3020;
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
        // Задание 4
        System.out.println("// Задание 4");
        int deliveryDistance = 95;
        int deliveryInitial = 1;
        int deliveryStep = 1;
        int deliveryTime;
        if (deliveryDistance <= 20) {
            deliveryTime = deliveryInitial;
        } else if (deliveryDistance <= 60) {
            deliveryTime = deliveryInitial + deliveryStep;
        } else if (deliveryDistance <= 100) {
            deliveryTime = deliveryInitial + deliveryStep * 2;
        } else {
            deliveryTime = deliveryInitial + deliveryStep * 3;
        }
        System.out.println("Потребуется дней: " + deliveryTime);
        // Задание 5
        System.out.println("// Задание 5");
        int monthNumber = 10;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь - зима");
                break;
            case 2:
                System.out.println("Февраль - зима");
                break;
            case 3:
                System.out.println("Март - весна");
                break;
            case 4:
                System.out.println("Апрель - весна");
                break;
            case 5:
                System.out.println("Май -  весна");
                break;
            case 6:
                System.out.println("Июнь - лето");
                break;
            case 7:
                System.out.println("Июль - лето");
                break;
            case 8:
                System.out.println("Август - лето");
                break;
            case 9:
                System.out.println("Сентябрь -осень");
                break;
            case 10:
                System.out.println("Октябрь -осень");
                break;
            case 11:
                System.out.println("Ноябрь -осень");
                break;
            case 12:
                System.out.println("Декабрь - зима");
                break;
            default:
                System.out.println("Период указан некорректно");
        }
        // Задание 6. Повышенная сложность.
        System.out.println("// Задание 6");
        int age = 19;
        int salary = 58_000;
        float koefCalc;
        // check age
        if (age < 23) {
            koefCalc = 2f;
        } else {
            koefCalc = 3f;
        }
        // check salary
        if (salary < 50_000) {
            // koefCalc is the same
        }
        else if (salary <= 80_000) {
            koefCalc = koefCalc * 1.2f;
        } else  {
            koefCalc = koefCalc * 1.5f;
        }
        float limitClient = salary * koefCalc;
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limitClient + " рублей");

        // Задание 7. Повышенная сложность.
        System.out.println("// Задание 7");
        int ageClient = 25;
        int salaryClient = 60_000;
        float wantedSum = 330_000f;
        float maxPayment = salaryClient * 50.00f / 100.00f;

        float rateBase = 10f;
        float calcRate;
        // first check
        if (ageClient < 23 ) {
            rateBase = rateBase + 1f;
        }
        else if (ageClient < 30 ) {
            rateBase = rateBase + 0.5f;
        }
        // second  check
        if (salaryClient  > 80_000) {
            rateBase = rateBase - 0.7f;
        }

        float wantedSumCalc =  wantedSum / 100 * (100 + rateBase);
        float monthPayment  =  wantedSumCalc / 12;
        System.out.println("Максимальный платеж при ЗП " + salaryClient + " равен " + maxPayment + " рублей");
        System.out.println("Платеж по кредиту равен " + monthPayment);
        if (maxPayment > monthPayment ) {
            System.out.println("Одобрено" );
        } else {
            System.out.println("Отказано" );
        }
        }
    }



