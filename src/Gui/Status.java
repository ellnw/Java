package Gui;



public class Status {
    protected int hpKillbill,hpJjja,hpGrakk,hpHorn;
    protected int spKillbill,spJjja,spGrakk,spHorn;
    protected int levelKillbill,levelJjja,levelGrakk,levelHorn;



    public Status(){
        hpKillbill = 30;
        hpJjja = 500;
        hpGrakk = 300;
        hpHorn = 100;
        spKillbill = 300;
        spJjja = 500;
        spGrakk = 800;
        spHorn = 1000;
        levelGrakk = 4;
        levelHorn = 10;
        levelJjja = 6;
        levelKillbill = 1;



    }

    //Hp Monster
    public int gethpKillbill(){
        return  hpKillbill;
    }

    public int gethpJjja(){
        return  hpJjja;
    }

    public int gethpHorn(){
        return  hpHorn;
    }

    public int gethpGrakk(){
        return  hpGrakk;
    }

    //Sp Monster
    public int getSpKillbill(){
        return  spKillbill;
    }

    public int getSpJjja(){
        return  spJjja;
    }

    public int getSpGrakk(){
        return  spGrakk;
    }

    public int getSpHorn(){
        return  spHorn;
    }

    //LEVEL MONSTER
    public int getLevelKillbill(){
        return  levelKillbill;
    }

    public int getLevelJjja(){
        return levelJjja;
    }

    public int getLevelGrakk(){
        return levelGrakk;
    }

    public int getLevelHorn(){
        return levelHorn;
    }



    }




