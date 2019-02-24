import java.util.Scanner;
import java.util.ArrayList;

public class El_Game {

    public static void main(String[] args) {
        //system();
        awaking();
    }




    public static void awaking(){
        int select1,skillPr,skillPa;
        Priest s1 = new Priest();
        Scanner input1 = new Scanner(System.in);
        Paladin s2 = new Paladin();
        System.out.println("You select JOB: [1]:Priest: \n\t\t\t\t[2]:Paladin:");
        select1 = input1.nextInt();
        if(select1 == 1){
            System.out.println("You select JOB: [1]:Priest");
            System.out.println("---------------------------------");
            System.out.println("Old status:");
            System.out.println("---------------------------------");
            s1.novice_stat();
            System.out.println("---------------------------------");
            System.out.println("New status:");
            s1.reStat();
            System.out.println("Skill:\t[1]:heal\t[2]:buff\t[3]:revive");

            skillPr = input1.nextInt();
            if (skillPr == 1){
                s1.heal_skill();
            }
            else if (skillPr == 2){
                s1.buff_skill();

            }
            else if (skillPr == 3){
                s1.revive_life_skill();
            }
            else{
                //system();
            }

        }
        else if(select1 == 2)
        {
            System.out.println("You select JOB: [2]:Paladin");
            System.out.println("---------------------------------");
            System.out.println("Old status:");
            System.out.println("---------------------------------");
            s2.novice_stat();
            System.out.println("---------------------------------");
            System.out.println("New status:");
            s2.reStat();
            System.out.println("Skill: ");
            skillPa = input1.nextInt();
            if (skillPa == 1){
                s2.shield_skill();
            }
            else if (skillPa == 2){
                s2.atk_skill();
            }
            else if (skillPa == 3){
                s2.buff_skill();
            }
            else{
                //system();
            }

        }
    }

/*


    public static void system(){
        int select;
        Novice myNovice =  new Novice();
        Scanner num = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Bag myBag = new Bag();
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

        while(true) {
            System.out.println("Press key");
            System.out.println("1: attack\t2.status\n3.OpenBag");
            select = input.nextInt();
            if( select == 1){
                myNovice.levelUp();
                System.out.println("--------------------------------------------");
                System.out.println("ํYou drop item: ");
                System.out.print("ํHave you want it?Y/N: ");
                myBag.found_item();

            }

            else if (select == 2){
                myNovice.showStat();
            }

            else if (select == 3){
                System.out.print("press i: ");
                myNovice.openBag();
                if(select == 3){
                    System.out.print("You can select object in function: ");
                    int number = num.nextInt();
                    if (number == 1)
                        myNovice.function_weapon();
                    else if (number == 2)
                        myNovice.function_armor();
                    else if (number == 3)
                        myNovice.function_medicine();
                    else if (number == 4)
                        myNovice.function_dress();
                    else if(number == 0){
                        System.out.println("Exits");
                    }
                }
            }

            else if (select == 0){
                break;
            }

            System.out.print("Move Key w,a,s,d: ");
            myNovice.walk();

            if (myNovice.levelUp() >= 5){
                System.out.println("MaxLevel = 10");
                System.out.println("You can Awake");
                System.out.println("You must go to Select JOB");
                break;

            }
        }
    }
      */
}
