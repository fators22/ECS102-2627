import greenfoot.*;


public class Attack extends Actor
{
    private String name;
    private int power;

     public Attack(String name)
    {
        this.name = name;
        this.power = 10;
    }
    public Attack(String name, int power)
    {
        this.name = name;
        this.power = power;
    }

    public String getName()
    {
        return name;
    }

    public int getPower()
    {
        return power;
    }
}
