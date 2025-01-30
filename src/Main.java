
public class Main {
    public static void main(String[] args) {

//        ----- =====   Задание № 1   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 1   ===== -----");
        byte clientOS = 0;
        switch (clientOS) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке ....");
                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке ....");
                break;
        }

//        ----- =====   Задание № 2   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 2   ===== -----");
        short clientDeviceYear = 2010;
        String mess;
        if (clientDeviceYear >= 2015) {
            mess = (clientOS == 1) ?
                    "Установите версию приложения для Android по ссылке ...." :
                    "Установите версию приложения для iOS по ссылке ....";
        } else {
            mess = (clientOS == 1) ?
                    "Установите облегченную версию приложения для Android по ссылке ...." :
                    "Установите облегченную версию приложения для iOS по ссылке ....";
        }
        System.out.println(mess);

//        ----- =====   Задание № 3   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 3   ===== -----");
        short year = 2021;
        if (year >= 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("Год " + year + " - высокосный.");
            } else {
                System.out.println("Год " + year + " - не высокосный.");
            }
        } else {
            System.out.println("Год " + year + " - за пределом принятого летоисчисления высокосных годов.");
        }

//        ----- =====   Задание № 4   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 4   ===== -----");
        short deliveryDistance = 95;     //  Переменная расстояние до клиента
        int tMin = 1;    //  Переменная минимального дня доставки
        if (deliveryDistance <= 20) {
            System.out.println("Для доставки карты потребуется " + tMin + " день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            tMin = tMin + 1;
            System.out.println("Для доставки карты потребуется " + tMin + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            tMin = tMin + 2;
            System.out.println("Для доставки карты потребуется " + tMin + " дня");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка карты не осеществляется ");
        }

//        ----- =====   Задание № 5   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 5   ===== -----");
        short monthNumber = 9;

//            ---------- Определяем сезон -------------
        String season = switch (monthNumber) {
            case 1, 2, 12 -> " Зима";
            case 3, 4, 5 -> " Весна";
            case 6, 7, 8 -> " Лето";
            case 9, 10, 11 -> " Осень";
            default -> "Нет такого сезона";
        };
//            ---------- Определяем месяц -------------
        String monthName = switch (monthNumber) {
            case 1 -> " Январь";
            case 2 -> " Февраль";
            case 3 -> " Март";
            case 4 -> " Апрель";
            case 5 -> " Май";
            case 6 -> " Июнь";
            case 7 -> " Июль";
            case 8 -> " Август";
            case 9 -> " Сентябрь";
            case 10 -> " Октябрь";
            case 11 -> " Ноябрь";
            case 12 -> " Декабрь";
            default -> " Нет такого мясяца.";
        };
        System.out.println("Месяц № " + monthNumber + monthName + " (" + season + " )");

    }
}