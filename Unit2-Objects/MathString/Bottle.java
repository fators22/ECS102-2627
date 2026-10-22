public class Bottle{
   private double amountLeft;
   private double capacity;

   public Bottle(double capacity)
   {
        this.capacity=capacity;
        this.amountLeft=capacity;
   }

   public double updateAmount(double amt){
    amountLeft-=amt;
    if(amountLeft*4<capacity){
         amountLeft=capacity;
    }
    return amountLeft;
   }

}