import greenfoot.*;

public class User extends Actor

{
    private String name;
    private Pokemon pokemon;

    public User(String name)
    {
        this.name = name;
        this.pokemon = null;
    }

    public void setPokemon(Pokemon p)
    {
        pokemon = p;
    }

    public Pokemon getPokemon()
    {
        return pokemon;
    }

    public void switchPokemon(Pokemon newPokemon)
    {
        pokemon = newPokemon;
        System.out.println(name + " switched Pokemon.");
    }

    public void heal()
    {
        if (pokemon != null)
        {
            pokemon.heal();
        }
    }

    public void attack(String name, User enemy)
    {
        if (pokemon != null && enemy != null)
        {
            pokemon.attack(name, enemy);
        }
    }

    public boolean isEndGame()
    {
        if (pokemon == null)
        {
            return true;
        }

        return pokemon.isOut();
    }

    public String getName()
    {
        return name;
    }
}
