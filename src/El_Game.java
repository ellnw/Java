import java.util.Scanner;

public class El_Game {

    public static void main(String[] args) {
        String select;

        String sh2 = "i";
        Novice myNovice =  new Novice();
        Scanner num = new Scanner(System.in);
        Bag meBag = new Bag();
        Item myItem = new Item();
        System.out.println("Create Novice");
        System.out.print("Novice Name: ");
        myNovice.insertName();
        System.out.println("Start Status:");
        System.out.println("HP = " + myNovice.get_hp());
        myItem.weapon();
        myItem.selectWeapon();
        System.out.println("--------------------------------------------");
        System.out.println("Ready go");
        System.out.println("--------------------------------------------");
        System.out.print("Move Key w,a,s,d: ");
        myNovice.walk();
        System.out.print("You found monster you must press y: ");
        myNovice.attack_Monster();
        System.out.println("--------------------------------------------");
        System.out.println("ํYou drop item: ");
        System.out.print("ํHave you want it?Y/N: ");
        meBag.found_item();
        System.out.println("--------------------------------------------");
        System.out.println("If you Hp up you can eat food");
        System.out.println("HP = " + myNovice.eat());
        myNovice.stamina();
        myNovice.hpMethod();
        System.out.println("You can up class Novice level = " + myNovice.level());
        System.out.println("--------------------------------------------");
        System.out.print("Press I Open Bag: ");
        meBag.showBag();
        System.out.print("You can select object in function: ");
        int number = num.nextInt();
        if(number == 1)
            myNovice.function_weapon();
        else if(number == 2)
            myNovice.function_armor();
        else if(number == 3)
            myNovice.function_medicine();
        else if(number == 4)
            myNovice.function_dress();
        else{
            System.out.print("End");
        }













    }
}
