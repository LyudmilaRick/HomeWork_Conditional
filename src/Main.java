public class Main {

    public static void main(String[] args) {
        // 12.10.2021
        // Задание 1 iOS VS Android
        // использую BYTE ибо точно знаю, что значение 0 или 1
        byte clientOS = 0;  // iOS is better
        System.out.println("// Задание 1");
           // second variant, but first was better
           if (clientOS ==0) {
               System.out.println("Установите версию приложения для iOS по ссылке");
           }
        if (clientOS ==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2 = Задание 1 + проверить год
        // byte clientOS = 0; - объявлено ранее
        clientOS = 0; // инициализация
        int clientDeviceYear = 2015;
        int oldYear = 2015;
        boolean isYearSoOld = clientDeviceYear < oldYear;
        System.out.println("// Задание 2");
        // old iOS
        if (clientOS ==0 && isYearSoOld) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        // old Android
        if (clientOS ==1 && isYearSoOld) {
            System.out.println("Установите облегченную версию приложения для Android  по ссылке");
        }
        // new iOS
        if (clientOS ==0 && !isYearSoOld) {
            System.out.println("Установите  версию приложения для iOS по ссылке");
        }
        // new Android
        if (clientOS ==1 && !isYearSoOld) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 3
        System.out.println("// Задание 3");
        int year = 2204;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
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
            case 2:
            case 12:
                System.out.println("Время года - зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года - весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года - лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года -осень");
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
        if (salary >= 50_000 && salary <= 80_000) {
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
        float maxPayment = salaryClient * 0.5f;

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
        rateBase = 1 + rateBase / 100;
        float wantedSumCalc =  wantedSum  * rateBase;
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



