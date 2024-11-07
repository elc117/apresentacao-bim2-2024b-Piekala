package classes;

import java.util.Scanner;

import classes.weapons.Handle;
import classes.weapons.Knife;
import classes.weapons.Pistol;
import classes.weapons.Weapon;

public class Player {
    
    private int    id;
    private String name;

    private int    life;
    private int    shield;

    private Handle handWeapon;

    private Knife  knife;
    private Pistol pistol;
    private Weapon weapon;
 
    public Player(){

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
            System.out.println("O jogador " + this.name + "foi derrotado!");
        }

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

            System.out.println("1) Faca.\n");

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

        }while(true);
    
        input.close();
    }

}