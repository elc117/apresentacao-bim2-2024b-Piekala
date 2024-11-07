package classes.weapons;

import java.util.ArrayList;
import classes.Player;


public class Pistol extends Handle{

    protected ArrayList<Integer> ammo;
    protected float              weight;
    protected float              weak_speed;
    
    protected Integer            damage;
    protected Integer            skin;

    public Pistol(){
        this.weight     = 0.5f;
        this.weak_speed = 0.4f;
        this.ammo = new ArrayList<>();
        
        for(int i = 0; i < 5; i++){
            this.ammo.add(15);
        }

        this.skin = 0;
    }

    public void fire( Player player ){
        
        if(ammo.get(0) > 0){
            System.out.println("Atirando em: " + player.getName() + ".");
            player.takeDamage( this.damage );
            ammo.set(0, ammo.get(0) - 1);
            try{
                Thread.sleep((long) (weak_speed * 1000)); 
            } 
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void right_click( Player player ){
        return;
    }

    @Override
    public void left_click( Player player ){

    }

    @Override
    public void inspect(){
        System.out.println("Inspecionando pistola.");
    }

}
