import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pizza pizza = new Pizza();
        addObject(pizza,191,166);
        pizza.setLocation(196,175);
        pizza.setLocation(300, 300);
        pizza.setLocation(295,309);
        Topping topping = new Topping("Cheese");
        addObject(topping,295,309);
        pizza.setLocation(306,300);
        pizza.setLocation(297,304);
        Topping topping2 = new Topping("Olives");
        addObject(topping2,297,304);
        pizza.setLocation(310,303);
        pizza.setLocation(325,270);
        pizza.setLocation(311,312);
        pizza.setLocation(306,300);
        pizza.setLocation(305,302);
    
        Topping topping3 = new Topping("Mushrooms");
        addObject(topping3,306,305);
        pizza.setLocation(312,307);
        pizza.setLocation(309,305);
    }
}
