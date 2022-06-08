package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Задание 1 и 2");

        int clientOS = 0;
        int clientDeviceYear=2007;
        if (clientOS == 0 && clientDeviceYear >= 2015 ) {
                System.out.println("Перейдите по ссылке и скачайте приложение для IOS!");
            }   else if (clientOS == 0 && clientDeviceYear < 2015 ) {

                System.out.println("Перейдите по ссылке и скачайте облегченную версию приложения для IOS!");
            }
         else if (clientOS == 1 && clientDeviceYear >= 2015 ) {
            System.out.println("Перейдите по ссылке и скачайте приложение для Android!  ");
        }   else if (clientOS == 1 && clientDeviceYear < 2015 ) {

            System.out.println("Перейдите по ссылке и скачайте облегченную версию приложения для Android!  ");
        }


        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Задание 3");

        int year = 3200;
         if ((year%4==0 && year%100!=0) || (year%4==0 && year%400==0)) {
             System.out.println(" Год является високосным ");
         } else {
             System.out.println(" Год  не является високосным ");
         }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Задание 4");

        int deliveryDistance = 95;
        if (deliveryDistance<=20) {
            System.out.println("Доставка займет 1 день!");
        } else if  (deliveryDistance<=60) {
            System.out.println("Доставка займет 2 дня!");
        } else if  (deliveryDistance<=100) {
            System.out.println("Доставка займет 3 дня!");
        }




        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Задание 5");
        int monthNumber =1;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сезон зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

}
