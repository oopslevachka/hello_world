import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        System.out.println("Hello people");
//        System.out.println("ddldl");
//
//        System.out.print("Введите первое  число: ");
//        int a = new Scanner(System.in).nextInt();
//        System.out.print("Введите второе число: ");
//        int b = new Scanner(System.in).nextInt();
//        if(a > 5 || b < 5){
//            System.out.println("Hello !!");
//        }
//        if(a < 5 || b > 5){
//            System.out.println("Bye !!");
//        }

        System.out.print("Введите кол-во денег: ");
        int money = new Scanner(System.in).nextInt();

        int TwixPrice = 70;
        int MarsPrice = 90;
        int WaterPrice = 23;
        int ColaPrice = 34;

        boolean isCanBye = false;

        if(money >= TwixPrice){
            int num = money / TwixPrice;
            System.out.println("Вы можете купить Твикс !! " + num);
            isCanBye = true;
        }
        if(money >= MarsPrice){
            int num = money / MarsPrice;
            System.out.println("Вы можете купить Марс !!" + num);
            isCanBye = true;
        }
        if(money >= WaterPrice){
            int num = money / WaterPrice;
            System.out.println("Вы можете купить Воду !!" + num);
            isCanBye = true;
        }
        if(money >= ColaPrice){
            int num = money / ColaPrice;
            System.out.println("Вы можете купить Колу !!" + num);
            isCanBye = true;
        }
        if (isCanBye == false){
            System.out.println("У вас недостаточно средств((");
        }


    }
}