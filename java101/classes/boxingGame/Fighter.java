package java101.classes.boxingGame;

public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    public Fighter(String name, int damage, int health, int weight,int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge>=0&&dodge<=100) this.dodge=dodge;
        else this.dodge=0;
    }

    public int hit(Fighter foe){
        System.out.println(this.name+" => "+foe.name+" "+this.damage+" damage point punched!");
        if (foe.isDodge()){
            System.out.println(foe.name+" blocked!");
            return foe.health;
        }
        if (foe.health-this.damage<0) return 0;
        return foe.health-this.damage;
    }

    boolean isDodge(){
        double randomNum=Math.random()*100;
        return this.dodge>=randomNum;
    }
}
