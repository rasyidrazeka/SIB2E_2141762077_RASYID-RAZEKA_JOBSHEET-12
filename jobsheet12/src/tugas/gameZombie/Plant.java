package tugas.gameZombie;
public class Plant {
    
    public void doDestroy(Destroyable d){
        if(d instanceof Zombie){
            Zombie z = (Zombie) d;
            z.destroyed();
            z.heal();
            //System.out.println("" + z.getZombieInfo());
        }else if(d instanceof Barrier){
            Barrier b = (Barrier) d;
            b.destroyed();
            //System.out.println("" + b.getBarrierInfo());
        }
    }
}