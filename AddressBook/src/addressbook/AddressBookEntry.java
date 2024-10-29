package addressbook;
public class AddressBookEntry {
private static void main(String args[]){
    
private String name;
private String add;
private int tel;
private String email;   
    public AddressBookEntry (){
    name="";
    add="";
    tel=0;
    email="";
    }
    
    
    public AddressBookEntry(String name,String add, int tel,String email){
    this.name=name;
    this.add=add;
    this.tel=tel;
    this.email=email; 
    }
    
    public String getName(){
        return name;
    }

   public int getTelNumber(){
   return tel;
}
    public void changeTelNumber(int tel){
   this.tel=tel;
}
    public String getEmailAdd(){
   return email;
}
      public void changeEmailAdd(String email){
    this.email=email;
}

    String getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

