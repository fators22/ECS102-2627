import greenfoot.*;

public class PokemonGame extends World
{
    private User player;
    private Computer computer;

    public PokemonGame()
    {
        super(800, 600, 1);

        player = new User("Player");
        computer = new Computer("Computer");

        addObject(player, 200, 500);
        addObject(computer, 600, 500);

        Pokemon squirtle = new Pokemon(
            100,
            10,
            "Squirtle",
            "Water Gun",
            "Water"
        );

        Pokemon pikachu = new Pokemon(
            100,
            10,
            "Pikachu",
            "Tackle",
            "Electric"
        );

        player.setPokemon(squirtle);
        computer.setPokemon(pikachu);

        addObject(squirtle, 200, 300);
        addObject(pikachu, 600, 300);

        // Starting message
        showText("POKEMON BATTLE!", 400, 50);
        showText("Click a Pokemon to attack!", 400, 80);
    }

    public void act()
    {
        // Player attacks
        if (Greenfoot.mouseClicked(player.getPokemon()))
        {
            player.attack("Water Gun", computer);

            showText("ATTACKING!", 400, 120);
            showText("Squirtle used Water Gun!", 400, 150);
            showText(
                "Pikachu HP: " + computer.getPokemon().getHp(),
                400,
                180
            );
        }

        // Computer attacks
        if (Greenfoot.mouseClicked(computer.getPokemon()))
        {
            computer.attack("Tackle", player);

            showText("ATTACKING!", 400, 120);
            showText("Pikachu used Tackle!", 400, 150);
            showText(
                "Squirtle HP: " + player.getPokemon().getHp(),
                400,
                180
            );
        }

        // Game over
        if (player.isEndGame())
        {
            showText("GAME OVER!", 400, 220);
            showText("Pikachu wins!", 400, 250);
        }

        if (computer.isEndGame())
        {
            showText("YOU WIN!", 400, 220);
            showText("Pikachu has fainted!", 400, 250);
        }
    }
}
