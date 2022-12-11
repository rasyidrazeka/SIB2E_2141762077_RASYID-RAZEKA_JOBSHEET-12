package tugas.gameZombie;
public class WalkingZombie extends Zombie{

    WalkingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    public void heal(){
        if(level == 1){
            health = (health+(10/100*health));
        }else if(level == 2){
            health = (health+(30/100*health));
        }else if(level == 3){
            health = (health+(40/100*health));
        }
    }
    public void destroyed(){
        health -= health * 2/100;
    }
    public String getZombieInfo(){
        String info = "Walking Zombie Data =\n";
        info += super.getZombieInfo();
        return info;
    }
}