import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Topping here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Topping extends Actor
{
    /**
     * Act - do whatever the Topping wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private String name;
    public Topping(String name){
        this.name=name;
        setImage(name+".png");
    }
    public void act()
    {
        fall();
        // Add your action code here.
    }
    public void fall(){
      setLocation(getX(), getY()+2);
      if (getY() >= getWorld().getHeight() - 1)
        {
        int randomX = (int)(Math.random()*(getWorld().getWidth()) );
        setLocation(randomX, 0);
        }

    }
}
