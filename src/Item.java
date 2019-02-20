import java.util.Scanner;



public class Item {

    private int ob;
    private int hp;
    private int attack;
    private int coin;
    private String name;
    int we;
    Scanner wea = new Scanner(System.in);


    public Item() {
        coin = 1000;
    }

    public void getCoin(){
        System.out.println("Coin: $" + coin);
    }

    public void weapon() {
        System.out.println("weapon");
        System.out.println("********");
        System.out.println("1.longSword\n2.shortSword\n3.crossBow\n4.Bow\n5.Lance\n6.Wand");

    }

    public int selectWeapon() {
        System.out.print("You select weapon N.1-6: ");
        we = wea.nextInt();
        if (we == 1)
            System.out.println("weapon: longSword");
        else if (we == 2)
            System.out.println("weapon: shortSword");
        else if (we == 3)
            System.out.println("weapon: crossBow");
        else if (we == 4)
            System.out.println("weapon: Bow");
        else if (we == 5)
            System.out.println("weapon: Lance");
        else if (we == 6)
            System.out.println("weapon: Wand");
        else
            System.out.println("weapon: Random");
        return we;
    }

    public void killMonster() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hp bottle");
            System.out.println("mana bottle");
        }
        for (int i = 10; i <= 50; i++) {
            System.out.println("attack bottle");
        }

    }
}
