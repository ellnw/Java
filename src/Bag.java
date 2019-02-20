import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Bag {
    private ArrayList<Item> items;
    private int limit;
    private Item item;
    char select;
    int number;
    String sh;
    String sh2 = "i";
    Item mItem = new Item();
    ArrayList<String> weapon = new ArrayList<String>();
    ArrayList<String> armor = new ArrayList<String>();
    ArrayList<String> medicine = new ArrayList<String>();
    ArrayList<String> dress = new ArrayList<String>();
    Scanner se = new Scanner(System.in);
    Scanner sh1 = new Scanner(System.in);


    public Bag(){
        items = new ArrayList<>();
        limit = 100;

    }

     public void fullBag(Item newItem){
        if(items.size() <= limit )
            items.add(newItem);
        else
            System.out.println("Full Bag");
     }


    public void listWeapon(){
            weapon.add("Sickle");
            weapon.add("Sword");
            weapon.add("Bow");
            weapon.add("Wand");
            weapon.add("Shield");
            System.out.println("Have: " + weapon.size() + " " + "weapon");
            System.out.println("[1] = " + weapon.get(0));
            System.out.println("[2] = " + weapon.get(1));
            System.out.println("[3] = " + weapon.get(2));
            System.out.println("[4] = " + weapon.get(3));
            System.out.println("[5] = " + weapon.get(4));

    }

    public void listArmor(){
            armor.add("Dragone Armor");
            armor.add("Demon Armor");
            armor.add("God Armor");
            armor.add("Heal Armor");
            armor.add("Train Armor");
            System.out.println("Have: " + armor.size() + " " + "armor");
            System.out.println("[1] = " + armor.get(0));
            System.out.println("[2] = " + armor.get(1));
            System.out.println("[3] = " + armor.get(2));
            System.out.println("[4] = " + armor.get(3));
            System.out.println("[5] = " + armor.get(4));

    }

    public void listMedicine(){

            medicine.add("HP bottle");
            medicine.add("Mana bottle");
            medicine.add("AtkBottle");
            medicine.add("High bottle");
            medicine.add("Defense Bottle");
            System.out.println("Have: " + medicine.size() + " " + "medicine");
            System.out.println("[1] = " + medicine.get(0));
            System.out.println("[2] = " + medicine.get(1));
            System.out.println("[3] = " + medicine.get(2));
            System.out.println("[4] = " + medicine.get(3));
            System.out.println("[5] = " + medicine.get(4));

    }

    public void listDress(){
            dress.add("Earring");
            dress.add("Glove");
            dress.add("necklace");
            dress.add("Tail");
            dress.add("Hat");
            System.out.println("Have: " + dress.size() + " " + "dress");
            System.out.println("[1] = " + dress.get(0));
            System.out.println("[2] = " + dress.get(1));
            System.out.println("[3] = " + dress.get(2));
            System.out.println("[4] = " + dress.get(3));
            System.out.println("[5] = " + dress.get(4));
    }


    public void showBag() {
        sh = sh1.nextLine();
        if(sh.equals(sh2)) {
            System.out.println("In Bag");
            System.out.println("You can select show object");
            System.out.println("1.weapon");
            System.out.println("2.armor");
            System.out.println("3.medicine");
            System.out.println("4.dress");
        }
        else
            System.out.println("Don't Show");

    }


    public void found_item(){
        select = se.next().charAt(0);
        switch (select){
            case 'y' :
                System.out.println("You get item in bag");
                break;
            case 'Y':
                System.out.println("You get item in bag");
                break;
            default:
                System.out.println("You don't get items.");
        }
    }


    public void getCoin(){
        item.getCoin();
    }

    public void dropItem(){
        mItem.killMonster();
    }

}
