package classes;

import java.util.Scanner;

import classes.weapons.Handle;
import classes.weapons.Knife;
import classes.weapons.Pistol;
import classes.weapons.Spyke;
import classes.weapons.Weapon;

public class Player {
    
    //private int     id;
    private String  name;

    private boolean spyke;
    private boolean attacker; 

    private int     life;
    private int     shield;

    private Handle  handWeapon;

    private Knife   knife;
    private Pistol  pistol;
    private Weapon  weapon;
 
    public Player( String name, boolean attacker, Knife knife, Pistol pistol ){

        //this.id = id;
        this.name = name;
        this.attacker = attacker;

        this.life = 100;
        this.shield = 0;

        this.knife = knife;
        this.pistol = pistol;
        this.weapon = null;
        this.handWeapon = pistol;

    }

    public Player( String name, boolean attacker, Knife knife, Pistol pistol, int shield, Weapon weapon ){

        //this.id = id;
        this.name     = name;
        this.attacker = attacker;
        
        this.life     = 100;
        this.shield   = shield;
        
        this.spyke    = false;
        this.knife    = knife;
        this.pistol   = pistol;
        this.weapon   = weapon;

        if( weapon != null )
            this.handWeapon = weapon;
        
        else
            this.handWeapon = pistol;

    }

    public void setAttacker( boolean attacker ){
        this.attacker = attacker;
    }

    public void setLife( int life ){
        this.life = life;
    }

    public int getLife(){
        return this.life;
    }

    public void setName( String name ){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setShield( int shield ){
        this.shield = shield;
    }

    public void setSpyke( boolean spyke ){
        this.spyke = spyke;
    }

    public int getShield(){
        return this.shield;
    }

    public void takeDamage( int damage ){

        damage -= this.shield;

        if( damage <= 0 )
            return;

        this.life-= damage;

        if( this.life <= 0 ){
            this.life = 0;
            System.out.println("O jogador " + this.name + " foi derrotado!");
        }

    }

    public void inspect(){
        this.handWeapon.inspect();
    }

    public void left_click( Player player ){
        this.handWeapon.left_click( player );
    }

    public void right_click( Player player ){
        this.handWeapon.right_click( player );
    }
    

    public void change_weapon(){

        Scanner input = new Scanner(System.in);
        int opc = 0;
        
        do{
            
            if(weapon != null)
                System.out.println("1) Arma Principal");
            
            if(pistol != null)
                System.out.println("2) Pistola.\n");

            System.out.println("3) Faca.\n");
            
            if(this.attacker && this.spyke)
                System.out.println("4) Spyke");

            opc = Integer.parseInt(input.next());

            if( opc == 3 ){
                this.handWeapon = this.knife;
                break;
            }
            else if( opc == 2 && pistol != null  ){
                this.handWeapon = this.pistol;
                break;
            }
            else if( opc == 1 && weapon != null ){
                this.handWeapon = this.weapon;
                break;
            }
            else if( opc == 4 && this.attacker && this.spyke ){
                this.handWeapon = new Spyke();
                break;
            }

        }while(false);
    
        //input.close();
    }

}