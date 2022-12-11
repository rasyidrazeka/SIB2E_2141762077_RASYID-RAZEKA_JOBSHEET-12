package tugas.gameZombie;
public class JumpingZombie extends Zombie{
    
    public JumpingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    public void heal(){
        if(level == 1){
            health = (health+(30/100*health));
        }else if(level == 2){
            health = (health+(40/100*health));
        }else if(level == 3){
            health = (health+(50/100*health));
        }
    }
    public void destroyed(){
        health -= health * 1/100;
    }
    public String getZombieInfo(){
        String info = "Jumping Zombie Data =\n";
        info += super.getZombieInfo();
        return info;
    }
}