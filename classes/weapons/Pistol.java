package classes.weapons;

import java.util.ArrayList;
import classes.Player;


public class Pistol extends Handle{

    protected float   weight;
    protected float   weak_speed;
    
    protected Integer damage;
    protected Integer skin;

    public Pistol(){
        this.weight     = 0.5f;
        this.weak_speed = 0.4f;

        this.skin = 0;
    }

    public void fire( Player player ){
        System.out.println("Atirando em: " + player.getName() + ".");
        player.takeDamage( this.damage );
        try{
            Thread.sleep((long) (weak_speed * 1000)); 
        } 
        catch (InterruptedException e){
            e.printStackTrace();
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
        System.out.println("Você está inspecionando essa pistola.");
    }

}
