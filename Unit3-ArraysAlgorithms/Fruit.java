
public class Fruit
{
    // Array is declared, but no memory has been allocated yet
    String[] fruitNames;

    public Fruit()
    {
        // You CANNOT use the {} initializer syntax by itself here
        // because that technique is only valid during declaration
        fruitNames = new String[3];
        
    }
