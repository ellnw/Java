import java.util.Scanner;

public class Novice {
    private Bag bag;
    private int hp,maxHp,maxExp,maxLevel,maxSp;
    private int level;
    private int exp;
    char walk;
    Bag mineBag = new Bag();
    Scanner na = new Scanner(System.in);
    Scanner wa = new Scanner(System.in);
    Scanner at = new Scanner(System.in);
    String name;

    public Novice() {
        maxExp = 100;
        maxHp = 1000;
        maxSp = 0;
        exp = 0;
        level = 1;
    }

    public void novice_stat() {
        System.out.println("maxExp = " + 100);
        System.out.println("maxHp = : " + 500);
        System.out.println("maxSp = : " + 0);
        System.out.println("exp = " + 0);
        System.out.println("level =  " + 1);
    }


    public void insertName() {

        name = na.nextLine();
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

    public int levelUp(){
        hp = hp-(150+level);
        exp = exp + (20+level);
        if(hp <= 0 ){
            System.out.println("You Died");
        }
        if(exp >= maxExp) {
            System.out.println("Level Up");
            level = level + 1;
            maxLevel = level;
            exp = exp - maxExp;
            maxHp = maxHp + 100;
            maxExp = maxExp + 5;
            hp = maxHp;

        }
        return maxLevel;
    }


    public int hpMethod() {
        hp = get_hp();
        if (hp <= 300)
            System.out.println("Low HP");
        return hp;
    }



    public void walk(){
        walk = wa.next().charAt(0);
        switch (walk){
            case 'w' :
                System.out.println("Move forward");
                break;
            case 'a' :
                System.out.println("Move left");
                break;
            case 'd' :
                System.out.println("Move right");
                break;
            case 's' :
                System.out.println("Move backward");
                break;
            default:
                System.out.println("Stop");
        }
    }

    public void function_weapon(){
        mineBag.listWeapon();
    }
    public void function_armor(){
        mineBag.listArmor();
    }
    public void function_medicine(){
        mineBag.listMedicine();
    }
    public void function_dress(){
        mineBag.listDress();
    }

    public void openBag(){
        mineBag.showBag();
    }

    public void getItem(){

        bag.found_item();
    }

    public void full_bag(Item item){
        bag.fullBag(item);
    }







}


