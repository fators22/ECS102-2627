public class FrogSimulation {
    private int maxHops;
    private int goalDistance;

    public FrogSimulation(int dist, int numHops)
    {
            goalDistance = dist;
            maxHops = numHops;
    }
    private int hopDistance(){
        int hop=0;
        hop=(int)(Math.random()*10)+1;
        if(Math.random()>0.9){
            hop=-hop;
        }


        return hop;
        
    }

    public boolean simulate(){
        boolean result=false;
        



        return result;
    }
}
