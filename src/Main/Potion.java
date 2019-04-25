package Main;

public class Potion extends Item {
    int hpPotion;
    int spPotion;
    int levelPotion;
    int expPotion;
    int atkPotion;

    public Potion(){
        hpPotion = 10;
        spPotion = 10;
        levelPotion = 10;
        expPotion = 10;
        atkPotion = 10;
    }
    public void potionItem() {
        System.out.println("--------------------------------------------");
        System.out.println("hpPotion: " + hpPotion);
        System.out.println("spPotion: " + spPotion);
        System.out.println("levelPotion: " + levelPotion);
        System.out.println("expPotion: " + expPotion);
        System.out.println("atkPotion: " + atkPotion);
        System.out.println("--------------------------------------------");
    }

}
