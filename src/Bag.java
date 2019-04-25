import Main.NoviceGui;
import Mons.Monster;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Bag extends JPanel {
    private ArrayList<Item> items;
    private int limit;
    Potion myPotion = new Potion();
    char select;
    String sh;
    String sh2 = "i";
    Item mItem = new Item();
    ArrayList<String> weapon = new ArrayList<String>();
    ArrayList<String> armor = new ArrayList<String>();
    ArrayList<String> medicine = new ArrayList<String>();
    ArrayList<String> dress = new ArrayList<String>();
    Scanner se = new Scanner(System.in);
    Scanner sh1 = new Scanner(System.in);
//GUI
    private JTextField sizeBox;
    private JTextField sizeBoxArmor;
    JButton btn1detail;
    JButton btn2detail;
    JButton btn3detail;
    JButton btn4detail;
    JPanel left = new JPanel();
    JPanel right = new JPanel();
    JPanel center = new JPanel();
    JPanel top = new JPanel();
    JPanel bottom = new JPanel();
    JTextField top1;


    public Bag(){
        items = new ArrayList<>();
        limit = 100;
        setLayout();

    }

    public void listWeapon(){

        weapon.add("Sickle" );
        weapon.add("Sword");
        weapon.add("Bow");
        weapon.add("Wand");
        weapon.add("Shield");
        weapon.add("Stat weapon");
         System.out.println("Have: " + weapon.size() + " " + "weapon");
         for (int i = 0; i < weapon.size(); i++)
                System.out.println("[ " + i + " ]"  + weapon.get(i));
           /* System.out.println("[2] = " + weapon.get(1));
            System.out.println("[3] = " + weapon.get(2));
            System.out.println("[4] = " + weapon.get(3));
            System.out.println("[5] = " + weapon.get(4));
            System.out.println("[6] = " + weapon.get(5));*/


    }

    private void setLayout() {
        listWeapon();
        listArmor();
        listMedicine();

        //Set layout weapon-----------------------------------------------------
        JList<String> list = new JList<>(weapon.toArray(new String[0]));

        JScrollPane scrollPane = new JScrollPane(list);
        add(scrollPane, BorderLayout.CENTER);
        setLayout(new BorderLayout(5,5));

        JList<String> listArmor = new JList<>(armor.toArray(new String[0]));
        JScrollPane scrollPaneArmor = new JScrollPane(listArmor);
        add(scrollPaneArmor, BorderLayout.CENTER);
        setLayout(new BorderLayout(5,5));

        JList<String> listMedicine = new JList<>(medicine.toArray(new String[0]));
        JScrollPane scrollPaneMedicine = new JScrollPane(listMedicine);
        add(scrollPaneMedicine, BorderLayout.CENTER);
        setLayout(new BorderLayout(5,5));

        //sizeBox();

        sizeBox = new JTextField("All Weapon: " + weapon.size() + "\tAll Armor: " + armor.size() + "\tAll medicine: " + medicine.size()
                ,JTextField.CENTER);
        sizeBox.setEditable(false);  // ensures that the list text cannot be edited in the panel
        sizeBox.setOpaque(true);
        sizeBox.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        sizeBox.setFont(new Font("Serif", Font.BOLD, 14));

        add(left, BorderLayout.WEST);
        add(right, BorderLayout.EAST);
        add(center, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);

        // place series of grid layouts inside the border layout components
        left.setLayout(new GridLayout(4,1));
        right.setLayout(new GridLayout(5,2));

        center.setLayout(new BorderLayout(1,2));
        center.add(list,BorderLayout.WEST);
        center.add(listArmor,BorderLayout.CENTER);
        center.add(listMedicine,BorderLayout.EAST);
        center.add(top,BorderLayout.NORTH);
        top.setLayout(new GridLayout(5,2,5,1));
        bottom.setLayout(new GridLayout(1,2,5,5));
        bottom.add(sizeBox);

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

    public void listDress1(){
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
            System.out.println("0.Exits");
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

    public void select_weapon(){
        mItem.selectWeapon();
    }

    public void select_potion() {
        myPotion.potionItem();

    }



//    public static void main(String[] args) {
//        Bag loads = new Bag();
//        loads.load();
//    }




}
