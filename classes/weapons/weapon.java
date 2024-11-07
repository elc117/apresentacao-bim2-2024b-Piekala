package classes.weapons;
import java.util.ArrayList;

public abstract class Weapon extends HandObject{

    //attributes:
    protected ArrayList<Integer> ammo;

    protected float      weight;
    protected float      fire_speed;
    protected float      reload_speed;
    protected float      fire_disperse;

    protected boolean    available;
    
    protected Integer    skin;
    protected Integer    keychan;
 
    //methods:

    public Weapon(){

    }
    
    public abstract void fire();
    public abstract void reload();

    public abstract void inspect();
    
    public abstract void left_click();
    public abstract void right_click();

    public abstract void drop();


}