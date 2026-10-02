package LoanShark;

public class Customer{
    //instant variables  visible by whole class except limits to static methods 
    String name;
    String story;
    double amount;
    int score;
    double rate;
    int years;

    public Customer(String n, String s, double a, int c, double r, int y){
        this.name=n;
        this.story=s;
        this.amount=a;
        this.score=c;
        this.rate=r;
        this.years=y;

    }
      public static Customer generateRandom() {
     String[] names = {"Diego", "Maria", "John", "Sarah", "Mike", "Devon", "Dustin", "Charlotte"};
     String[] stories = {
    "We're going to finally put in that pool and make our backyard something dreamy. We need to borrow $1800.",
    "I need money for a new washer and dryer.",
    "My car broke down and I need repairs.",
    "I want to start a small business.",
    "I need to pay for medical bills.",
    "We're making a smart toothbrush. You'll be able to track plaque buildup from your phone! We're going to need $1600 though.",
    "Yo, Can I get $800 to open my new gym, Squats R Us?",
    "Hey, my paycheck doesn't clear 'til Friday, but I've got to pay rent tomorrow. Can I borrow $345 to tide me over?"
};
        
        // TODO: pick a random name from names
        int index=(int) (Math.random()*names.length);
        String na=names[index];
        // TODO: pick a random story from stories
        index=(int)(Math.random()*stories.length);
        String st=stories[index];

        // TODO: pick a random loanAmount between 345 and 2500
        double amt=(int)(Math.random()*2156)+345;
        // TODO: pick a random creditScore between 300 and 1150
        int scr=(int)(Math.random()*851)+300;
        // TODO: pick a random rate between 5 and 15
        double rt=Math.random()*11+5;
        // TODO: pick a random years between 1 and 5
        int ys=(int)(Math.random()*5)+1;

        
        return new Customer(na, st, amt, scr, rt, ys);
    }

    public boolean determineDefault() { 
       // TODO: declare a double variable called chance
        double chance=0.0;
       // TODO: use if/else to set chance based on creditScore
       //       creditScore >= 700 → chance = 0.10
         if(score >= 700 ){
            chance = 0.10;
         }else if (score >= 500 ){
           chance = 0.30;
         }else {
            chance = 0.80;
         }
    
         return Math.random() < chance;
           
    }

    
  
    String getName(){
        return this.name;

    }
    int getCreditScore(){
         return this.score;
    }
    double getLoanAmount(){
       return this.amount;
    }
   

}