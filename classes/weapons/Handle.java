package classes.weapons;
import classes.Player;


public abstract class Handle {
    
    protected float weight;
    
    public Handle(){}

    public Handle( float weight ){
        this.weight = weight;
    }

    public abstract void left_click( Player player );

    public abstract void right_click( Player player );

    public abstract void inspect();

}
