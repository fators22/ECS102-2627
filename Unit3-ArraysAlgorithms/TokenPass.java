public class TokenPass {
    private int currentPlayer;
    private int[] board;

    public TokenPass(int playerCount){
        board= new int[playerCount];
        for(int i=0; i<playerCount; i++){
          board[i]=(int)(Math.random()*10)+1;
        }
        currentPlayer=(int)(Math.random()*playerCount);
    }
    public void distributeTokens(){
        int tokens=board[currentPlayer];
        int where=currentPlayer+1;
        board[currentPlayer]=0;
        while(tokens>0){
            tokens--;
            if(where==board.length){
                where=0;
            }
            board[where]++;
            where++;

        }
    } 
    
}
