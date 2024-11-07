package classes.weapons;
import classes.Player;

public class Knife extends Handle{
    //attributes:

    protected float   weight;
    protected float   weak_speed;
    protected float   strong_speed;
    
    protected Integer skin;
 
    //methods:

    public Knife(){
        this.strong_speed = 1.0f;
        this.weak_speed   = 0.5f;
        this.weight       = 0.2f;
    }

    public void fire( Integer damage , Player player ){
       
        if( damage == 150 )
       {

            System.out.println("Golpeando: " + player.getName() + ".");
            player.takeDamage( damage );
            try{
                Thread.sleep((long) (weak_speed * 1000)); 
            } 
            catch (InterruptedException e){
                e.printStackTrace();
            }

       }

       else
       {

            System.out.println("Golpeando: " + player.getName() + ".");
            player.takeDamage( damage );
            try {
                Thread.sleep((long) (strong_speed * 1000)); 
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

       }
    }

    public void inspect(){
        System.out.println("Inspecionando faca.\n");
    }
    
    public void left_click( Player player ){
        fire( 75 , player );
    }
    public void right_click( Player player ){
        fire( 150 , player );
    }


}