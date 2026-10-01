import greenfoot.*;

public class Pokemon extends Actor
{
    private int hp;
    private int ap;
    private String name;
    private GreenfootImage img;
    private boolean outStatus;
    private Attack attack;
    private String type;

    public Pokemon(int hp, int ap, String name,
                   String attack, String type)
    {
        this.hp = hp;
        this.ap = ap;
        this.name = name;
        this.img = new GreenfootImage(name.toLowerCase()+".png");
        this.attack = new Attack(attack);
        this.type = type;

        setImage(img);
        outStatus = false;
    }

    public String getType()
    {
        return type;
    }

    public void attack(String attackName, User enemy)
    {
        int power = getAttackPower(attackName, enemy);

        if (power > 0)
        {
            enemy.getPokemon().takeDamage(power);
        }
    }

    public void takeDamage(int amount)
    {
        hp -= amount;

        if (hp <= 0)
        {
            hp = 0;
            outStatus = true;
        }
    }

    public void heal()
    {
        hp += 20;

        if (hp > 100)
        {
            hp = 100;
        }

        outStatus = false;
    }

    public void printAttack()
    {
        System.out.println(name + " uses " + attack.getName());
        System.out.println("Attack power: " + attack.getPower());
    }

    public int getAttackPower(String attackName, User enemy)
    {
        if (attack != null && attack.getName().equalsIgnoreCase(attackName))
        {
            return attack.getPower() + ap;
        }

        return 0;
    }

    public int getHp()
    {
        return hp;
    }

    public int getAp()
    {
        return ap;
    }

    public String getName()
    {
        return name;
    }

    public boolean isOut()
    {
        return outStatus;
    }

    public Attack getAttack()
    {
        return attack;
    }
}
