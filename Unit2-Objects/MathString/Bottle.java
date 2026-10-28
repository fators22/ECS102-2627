/**
 * Bottle
 * _______________
 *   -capacity:double
 *   -amtLeft:double
 * ___________________
 * +Bottle(cap:double)
 * +updateAmount(amt:double):double
 * ___________________________________
 * 
 * Bottle
 */


public class Bottle {
    private double capacity;
    private double amtLeft;

    public Bottle(double cap){
        capacity=cap;
        amtLeft=cap;
    }
    public double updateAmount(double amt){
        amtLeft-=amt;
        if(amtLeft<0.25*capacity){
            amtLeft=capacity;
        }
        return amtLeft;

    }
   
    
}
