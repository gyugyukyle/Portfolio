package addressbook;
import java.io.*;
public class AddressBook {
 private int top = 0;
 private static final int MAXENTRIES=100;
 private AddressBookEntry[]list;
 public static void main(String args[]){
     BufferedReader keyln=new BufferedReader(new InputStreamReader (System.in));
     AddressBook addBook=new AddressBook();
     String act="";
     while (true){
System.out.println("\n[A]Add entry");
System.out.println("[D] Delete entry");
System.out.println("[V]View all entries");
System.out.println("[U]Update entry");
System.out.println("[Q]Quit");
System.out.print("Enter desired action:");
     try{
     act=keyln.readLine();
     }catch(Exception e){System.out.println("Error");
     }{
if(act.equals("A")||act.equals("a"))
  addBook.addEntry();
else if (act.equals("D")||act.equals("d"))
  addBook.delEntry();
 else if (act.equals("V")||act.equals("v"))
  addBook.viewEntries();
else if (act.equals("U")||act.equals("u"))
  addBook.updateEntry();
else if (act.equals("Q")||act.equals("q"))
  addBook.exit(0);
 else
     System.out.println("Unknown Command");

public AddressBook(){
list=new AddressBookEntry(MAXENTRIES);    
}

public void addEntry (){
BufferedReader keyln=new BufferedReader(new InputStreamReader(System.in));
String name="";
String add="";
int tel=0;
String email="";

if(top==MAXENTRIES){
    System.out.println("Adress Book is full");
    return;
}
try{
    System.out.print("Name:                ");
    name=keyln.readLine();
    System.out.print("Address:                ");
    add=keyln.readLine();
    System.out.print("Telephone number:");
    tel=Integer.parseInt(keyln.readLine());
    System.out.print("Email Address:           ");
    email=keyln.readLine();
}
catch(Exception e){
    System.out.println(e);
    System.exit(0);
}
AddressBookEntry entry=new AddressBookEntry(name,add,tel,email);
list[top]=entry;
top++;
}

public void delEntry(){
    BufferedReader keyln= new BufferedReader(new InputStreamReader(System.in));

     int index=0;
     if(top==0){
         System.out.println("Address book id empty");
         return;
     }
     
     try{
         viewEntries();
         System.out.print("\n Enter entry number");
         index=Integer.parseInt(keyln.readLine())-1;        
     }
     catch (Exception e){}
     if (index<0||index>=top){
         System.out.println("Index Out of Bounds");
         return;
     } 
     else{
         list[top]=null;
     }
}
public void viewEntries(){
    for(int index=0;index<top;++index){
        System.out.println((index+1)+"Name:"+list[index].getName());
        System.out.println("Address:"+list[index].getAddress());
        System.out.println("Telephone Number:"+list[index].getTelNumber());
        System.out.println("Email Adress:"+list[index].getEmailAdd());
    }  
}
    
public void updateEntry(){
    BufferedReader keyln=new BufferedReader(new InputStreamReader(System.in));
int index=0;
String name="";
String add="";
int tel=0;
String email="";  

try{
    System.out.print("Name:                ");
    name=keyln.readLine();
    System.out.print("Address:                ");
    add=keyln.readLine();
    System.out.print("Telephone number:");
    tel=Integer.parseInt(keyln.readLine());
    System.out.print("Email Address:           ");
    email=keyln.readLine();
}
catch(Exception e){
    System.out.println(e);
    System.exit(0);
}
AddressBookEntry entry=new AddressBookEntry(name,add,tel,email);
list[index]=entry;
}

   



}
    
}

