import java.util.Scanner;

public class HWSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер напитка: ");
        int drink = scanner.nextInt();



        switch (drink) {
            case 1:
                System.out.println("Эспрессо");
                printDrink1();
                break;

            case 2:
                System.out.println("Американо");
                printDrink2();
                break;

            case 3:
                System.out.println("Капучино");
                printDrink3();
                break;

            case 4:
                System.out.println("Чай");
                printDrink4();
                break;

            default:
                System.out.println("Данного напитка нет в наличии");
        }


    }
    public static void printDrink1(){
        System.out.println("Неделимый процесс");
    }
    public static void printDrink2() {
        System.out.println("Приготовление эспрессо и добавление воды");
    }
    public static void printDrink3(){
        System.out.println("Приготовление эспрессо и добавление вспененного молока");
    }
    public static void printDrink4(){
        System.out.println("Выбор пакетика и добавление воды");
     }

}
