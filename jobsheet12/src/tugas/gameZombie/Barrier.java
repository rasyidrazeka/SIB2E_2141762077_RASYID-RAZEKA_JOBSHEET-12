package tugas.gameZombie;
public class Barrier implements Destroyable{
    public int strength;

    public Barrier(int strength){
        this.strength = strength;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
    public int getStrength(){
        return strength;
    }
    public void destroyed(){
        strength -= 1;
    }
    public String getBarrierInfo(){
        String info = "Barrier Strength = " + getStrength() + "\n";
        return info;
    }
}