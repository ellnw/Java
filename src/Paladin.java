public class Paladin extends Novice {
    private String job;
    private String skill;
    private int maxHp,maxLevel,level,maxSp,atk = 500;

    public void reStat(){
        System.out.println("---------------------------------");
        System.out.println("class : Paladin");
        System.out.println("maxExp = " + 200);
        maxHp = get_hp() + 2000;
        System.out.println("maxHp =  " + maxHp);
        maxSp = maxSp + 2500;
        System.out.println("maxSp =  " + maxSp);
        System.out.println("exp = " + 0);
        level = 5;
        System.out.println("level =  " + level);
        System.out.println("---------------------------------");
    }

    public void shield_skill(){
        System.out.println("if you have shield");
        atk = atk_skill() - 700;
        System.out.println("atk =  " + atk);
        maxHp = get_hp() + 1000;
        System.out.println("Hp =  " + maxHp);
    }

    public int atk_skill(){
        atk = atk + 2100;
        System.out.println("atk =  " + atk);
        maxHp = get_hp() - 200;
        System.out.println("Hp =  " + maxHp);
        return atk;
    }

    public void buff_skill(){
        maxLevel = level + 2;
        System.out.println("level" + level);
        maxHp = get_hp() + 500;
        System.out.println("Hp =  " + maxHp);
        maxSp = maxSp + 400;
        System.out.println("Sp =  " + maxSp);
    }

}
