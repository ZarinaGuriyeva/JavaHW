import java.util.Scanner;

public class HWSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер напитка: ");
        int drink = scanner.nextInt();


        switch (drink) {
            case 1:
                printDrink1();
                break;

            case 2:
                printDrink2();
                break;

            case 3:
                printDrink3();
                break;

            case 4:
                printDrink4();
                break;

            default:
                System.out.println("Данного напитка нет в наличии");
        }


    }
    public static void printDrink1(){
        System.out.println("Эспрессо - неделимый процесс");
    }
    public static void printDrink2() {
        System.out.println("Американо - приготовление эспрессо и добавление воды");
    }
    public static void printDrink3(){
        System.out.println("Капучино - приготовление эспрессо и добавление вспененного молока");
    }
    public static void printDrink4(){
        System.out.println("Чай - выбор пакетика и добавление воды");
    }

}
