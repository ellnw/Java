import java.util.Scanner;

public class Priest extends Novice {
    private String job;
    private String skill;
    private int hp,maxHp,maxExp,maxLevel,maxSp,exp,level;
    private int sumHp;
    int select,boots;
    Scanner input = new Scanner(System.in);
    Novice hp1 = new Novice();


    public void reStat(){
        System.out.println("---------------------------------");
        System.out.println("class : Priest");
        System.out.println("maxExp = " + 200);
        maxHp = get_hp();
        System.out.println("maxHp =  " + maxHp);
        maxSp = maxSp + 1500;
        System.out.println("maxSp =  " + maxSp);
        System.out.println("exp = " + 0);
        level = 5;
        System.out.println("level =  " + level);
        System.out.println("---------------------------------");

    }

    public void heal_skill(){
       System.out.print("Are you want to heal [1] or [0] :");
       select = input.nextInt();
        if (select == 1) {
               sumHp = hp1.hpMethod() + hp1.get_hp();
               System.out.println("heal: " + sumHp);
           }
           else {
               System.out.println("Not heal");
           }
    }


    public void buff_skill(){
        level = level + 3;
        System.out.println("level" + level);
        maxHp = get_hp() + 1000;
        System.out.println("Hp" + maxHp);
        maxSp = maxSp + 1000;
        System.out.println("Sp" + maxSp);
    }

    public void revive_life_skill(){
        if(maxHp == 0 && maxSp == 0){
            maxHp = levelUp() + 500;
            maxSp = levelUp() + 500;
        }
        else{
            System.out.println("return hometown" );
        }
    }



}
