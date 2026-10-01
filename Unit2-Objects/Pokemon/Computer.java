import greenfoot.*;

public class Computer extends User
{
    public Computer(String name)
    {
        super(name);
    }

    public void switchPokemon()
    {
        System.out.println(getName() + " switched Pokemon.");
    }
}
