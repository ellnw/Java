public class Paladin extends Novice {
    private String job;
    private String skill;
    private int hp,maxHp,maxExp,maxLevel,exp,level,maxSp;

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

    }

    public void atk_skill(){

    }

    public void buff_skill(){

    }

}
