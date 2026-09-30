//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("task 1");
        int osType = 1;
        if (osType == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Task 2
        System.out.println("task 2");
        int clientDevviceYear = 2015;
        if (osType == 0 && clientDevviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (osType == 0) {
            System.out.println("УУстановите версию приложения  для iOS по ссылке");
        } else if (clientDevviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Task 3
        System.out.println("task 3");
        int year = 2027;
        if (year > 1584 && ((year % 4 == 0 && year % 100 == 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        // Task 4
        System.out.println("task 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        // Task 5
        System.out.println("task 5");
        int montNumber = 12;
        if (montNumber < 1 || montNumber > 12) {
            System.out.println("Некорректный номер месяца");
        } else {
            switch (montNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println(montNumber + "-й месяц принадлежит к сезону зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println(montNumber + "-й месяц принадлежит к сезону весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(montNumber + "-й месяц пренадлежит к сезону лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(montNumber + "-й месяц пренадлежит к сезону осень");
            }
        }

    }
}


