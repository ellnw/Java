import java.util.Scanner;

public class Novice {
    private Bag bag;
    private int hp;
    private int level;
    private int up = 10;
    char w,a,s,d;
    char walk;
    String attack;
    String at1 = "y";
    Bag mineBag = new Bag();
    Scanner na = new Scanner(System.in);
    Scanner wa = new Scanner(System.in);
    Scanner at = new Scanner(System.in);
    Scanner num = new Scanner(System.in);
    String name;

    public Novice() {
        hp = 1000;
    }

    public void insertName() {

        name = na.nextLine();
    }

    public int get_hp() {
        return hp = 1000;
    }

    public int eat() {
        hp = hp + 100;
        return hp;
    }


    public void hpMethod() {
        hp = get_hp();
        if (hp <= 800)
            System.out.println("Low HP");
    }

    public void stamina() {
        int run, max = 200, speed = 50;
        for (run = 0; run < max; run++) {
            if (run <= 150) {
                run = run + speed;
            } else {
                run = run - speed;
            }
        }
    }

    public int level() {
        if (level > up) {
            up = up + 1;
        }
        return up;
    }

    public void attack_Monster() {
        attack = at.nextLine();
            if (attack.equals(at1)) {
                hp = hp - 400;
                System.out.println("HP: " + hp);
                System.out.println("Monster is Dead");
            }
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


    public void getItem(){
        bag.found_item();
    }

    public void full_bag(Item item){
        bag.fullBag(item);
    }





}
