import java.util.Scanner;


public class El_Game {

    public static void main(String[] args) {
        int select;
        Novice myNovice =  new Novice();
        Potion myPotion = new Potion();
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
            System.out.println("--------------------------------------------");
            System.out.println("Press key");
            System.out.println("1: attack\t2.status\t3.OpenBag");
            System.out.println("--------------------------------------------");
            select = input.nextInt();
            if( select == 1){
                myNovice.attack();
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
                    if (number == 1){
                        myNovice.function_weapon();
                        System.out.print("Start weapon: key [6]: and Not key [0] ");
                        number = input.nextInt();
                        if(number == 6){
                            myNovice.selectWeapon();
                        }
                    }

                    else if (number == 2)
                        myNovice.function_armor();

                    else if (number == 3) {
                        myNovice.function_medicine();
                        System.out.print("show potion: key [1]: ");
                        number = num.nextInt();
                        //System.out.print("Start potion: key [1]: ");
                        if (number == 1){
                            myNovice.selectPotion();
                            }

                    }

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

            if (myNovice.attack() >= 5){
                System.out.println("MaxLevel = 10");
                System.out.println("You can Awake");
                System.out.println("You must go to Select JOB");
                break;
            }
        }
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
            System.out.println("Skill:\t[1]:shield\t[2]:atk\t[3]:buff");
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


        }
    }






}
