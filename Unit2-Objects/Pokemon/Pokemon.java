/**
 * Write a description of class Pokemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
public class Pokemon extends Actor

{
    // instance variables - replace the example below with your own
    private int hp;
    private int ap;
    private String name;
    private GreenfootImage img;
    private boolean outStatus;
    private Attack attack;
    private String type;
    public Pokemon(int hp,int ap, String name, String attack,String type){
        this.hp=hp;
        this.ap=ap;
        this.name=name;
        this.img=new GreenfootImage(name.toLowerCase()+".png");
        this.img.scale(160,160);
        setImage(this.img);
        this.attack=new Attack(attack);
        this.type=type;
        this.outStatus=false;
    }
    /**
     * Constructor for objects of class Pokemon
     */
    public String getType(){
        return this.type;
        
    }
    public void attack(String aname, User enemy){
        enemy.getPokemon().takeDamage(getAPower(aname, enemy));
    }
    public void takeDamage(int amount){
        this.hp=this.hp-amount;
        if(this.hp<0){
            this.hp=0;
            outStatus=true;
        }
    }
    public void heal(){
        this.hp=this.hp+20;
    }
    public Attack getAttack(){
        return this.attack;
    }
    public boolean isOut(){
        
        return this.outStatus;
    }
    public int getAPower(String aname,User enemy){
        Attack a=enemy.getPokemon().getAttack();
        return a.getPower();
    }
   

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
     
}