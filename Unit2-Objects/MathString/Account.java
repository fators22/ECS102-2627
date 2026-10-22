public class Account {
    private String username;
    public void setUserName(String u){
username=u;
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
