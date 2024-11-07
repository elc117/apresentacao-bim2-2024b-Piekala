package classes.weapons;
import classes.Player;


public abstract class HandObject {
    
    protected float weight;
    
    public HandObject(){}

    public HandObject( float weight ){
        this.weight = weight;
    }

    public abstract void left_click( Player player );

    public abstract void right_click( Player player );

    public abstract void inspect();

}
