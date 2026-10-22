public class Account {
    private String username;
    public Acccount(String requestedName){
        if(isAvaliable(requestedName)){
            this,username=requestedName
        }else{
            int count=1;
            while(!isAvaliable(requestedName+count)){
                count++;
            }
            this.username=requestedName+count;
        }
            
    }

    
    public void setUserName(String u){
         username=u;
    }
    public Account(String requestedName)
{
    if(isAvailable(requestedName))
    {
        username = requestedName;
    }
    else
    {
        int n = 1;

        while( ! isAvailable(requestedName + n) )
            n++;

        username = requestedName + n;
    }
}

    public String getShortenedName()
    {
        String shortname = username;

        while (shortname.indexOf("-") != -1)
        {
            int index = shortname.indexOf("-");
        shortname= shortname.substring(0, index - 1)+
                        shortname.substring(index +1);     
        }
        return shortname;
   }
 public static void main(String[] args){
    Account a = new Account();
    a.setUserName("PSmith");
    System.out.println(a.getShortenedName());
 }

    
}
