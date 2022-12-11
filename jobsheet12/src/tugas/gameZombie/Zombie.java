package tugas.gameZombie;
public abstract class Zombie implements Destroyable{
    public int health;
    public int level;

    public abstract void heal();
    public abstract void destroyed();
    public String getZombieInfo(){
        String info = "Health = " + health +"\n";
        info += "Level = " + level + "\n";
        return info;
    }
}