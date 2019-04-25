package Main;

import Gui.Status;


import javax.swing.*;
import java.util.Scanner;

public class Novice {
    private Bag bag;

    protected int hp,sp,attk,loss;
    protected int maxHp;
    protected int maxExp;
    protected int maxLevel;
    protected int level;
    protected int killMonster;
    protected String clas;
    private int exp;
    char walk;
    Bag mineBag = new Bag();
    Scanner na = new Scanner(System.in);
    Scanner wa = new Scanner(System.in);
    Scanner at = new Scanner(System.in);
    private String name;
    private String mons;
    Status statusMons = new Status();
    String result;

    public Novice() {
        this.name = name;
        maxExp = 100;
        maxHp = 1000;
        sp = 1000;
        exp = 0;
        level = 1;
        attk = 50;
        loss = 1;
        hp = 1000;
        killMonster = 0;
        clas=" ";
   }


    public void novice_stat() {
        System.out.println("maxExp = " + 100);
        System.out.println("maxHp = : " + 500);
        System.out.println("maxSp = : " + 0);
        System.out.println("exp = " + 0);
        System.out.println("level =  " + 1);
    }
//
//
//    public void insertName() {
//
//        name = na.nextLine();
//    }

    public String getName(){
        return name;
    }

    public int get_hp() {
        return hp = 1000;
    }




    public void showStat(){
        System.out.println("-------------------------------------");
        System.out.println("                Status");
        System.out.println("-------------------------------------");
        System.out.println("Name : " +name);
        System.out.println("Level : " +level);
        System.out.println("Hp : " + hp + "/" + maxHp);
        System.out.println("Exp : " + exp + "/" + maxExp);
        System.out.println("-------------------------------------");
    }

    public int attackKillbill(){

        hp = hp - statusMons.gethpKillbill();
        System.out.println("HP: " + hp);
        sp = sp - 100;
        exp = exp + 35;
        killMonster = killMonster + 1;
        if(hp <= 0 ){
            System.out.println("You Died");
        }
        if(exp >= maxExp) {
            System.out.println("Level Up: " + level);
            level = level + 1;
            maxLevel = level;
            sp = sp + 1000;
            exp = exp - maxExp;
            maxHp = maxHp + 100;
            maxExp = maxExp + 5;
            hp = maxHp;
        }


        return maxLevel;
    }

    public int attackGrakk(){
        hp = hp - statusMons.gethpGrakk();
        sp = sp - 200;
        System.out.println("HP: " + hp);
        exp = exp + 40;
        killMonster = killMonster + 1;
        if(hp <= 0 ){
            System.out.println("You Died");
        }
        if(exp >= maxExp) {
            System.out.println("Level Up: " + level);
            level = level + 1;
            maxLevel = level;
            sp = sp +1000;
            exp = exp - maxExp;
            maxHp = maxHp + 100;
            maxExp = maxExp + 5;
            hp = maxHp;
        }
        return maxLevel;
    }

    public int attackJjja(){
        hp = hp - statusMons.gethpJjja();
        sp = sp - 300;
        System.out.println("HP: " + hp);
        killMonster = killMonster + 1;
        exp = exp + 60;
        if(hp <= 0 ){
            System.out.println("You Died");
        }
        if(exp >= maxExp) {
            System.out.println("Level Up: " + level);
            level = level + 1;
            sp = sp + 1000;
            maxLevel = level;
            exp = exp - maxExp;
            maxHp = maxHp + 100;
            maxExp = maxExp + 5;
            hp = maxHp;

        }
        return maxLevel;
    }

    public int attackHorn(){
        hp = hp - statusMons.gethpHorn();
        System.out.println("HP: " + hp);
        sp = sp - 500;
        exp = exp + 100;
        killMonster = killMonster + 1;
        if(hp <= 0 ){
            System.out.println("You Died");
        }
        if(exp >= maxExp) {
            System.out.println("Level Up: " + level);
            sp = sp + 1000;
            level = level + 1;
            maxLevel = level;
            exp = exp - maxExp;
            maxHp = maxHp + 100;
            maxExp = maxExp + 5;
            hp = maxHp;

        }
        return maxLevel;
    }


//    public int getHpZero() {
//        int killMonster=0;
//        attackKillbill();
//        killMonster++;
//           return killMonster;
//        }




//    public int hpMethod() {
//        hp = get_hp();
//        if (hp <= 300)
//            System.out.println("Low HP");
//        return hp;
//    }



//    public void walk(){
//        walk = wa.next().charAt(0);
//        switch (walk){
//            case 'w' :
//                System.out.println("Move forward");
//                break;
//            case 'a' :
//                System.out.println("Move left");
//                break;
//            case 'd' :
//                System.out.println("Move right");
//                break;
//            case 's' :
//                System.out.println("Move backward");
//                break;
//            default:
//                System.out.println("Stop");
//        }
//    }

//    public void function_weapon(){
//        mineBag.listWeapon();
//    }
//    public void function_armor(){
//        mineBag.listArmor();
//    }
//    public void function_medicine(){
//        mineBag.listMedicine();
//    }
//    public void function_dress(){
//        mineBag.listDress();
//    }
//
//
//
//    public void openBag(){
//        mineBag.showBag();
//    }
//
//    public void selectWeapon(){
//        mineBag.select_weapon();
//    }
//
//    public void selectPotion(){
//        mineBag.select_potion();
//    }
//
//    public void getItem() {
//
//        bag.found_item();
//    }









}


