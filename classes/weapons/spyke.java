package classes.weapons;

import classes.Player;

public class Spyke extends HandObject{

    public Spyke(){}

    public void plant(){
        System.out.println("Plantando Spyke.");
        try {
            Thread.sleep((long) (4 * 1000)); 
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void fire( Player player ){
        return;
    }

    public void defuse(  ){
        System.out.println("Defusando Spyke.");
        try {
            Thread.sleep((long) (8 * 1000)); 
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void left_click( Player player ){
        plant();
    }

    @Override
    public void right_click( Player player ){
        defuse();
    }

    public void inspect(){}
    
}
