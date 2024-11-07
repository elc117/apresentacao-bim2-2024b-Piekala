package classes.weapons;
import classes.Player;


public abstract class Handle {
    
    protected float weight;
    
    public Handle(){}

    public abstract void fire( Integer damage, Player player );

    public abstract void left_click( Player player );

    public abstract void right_click( Player player );

}
