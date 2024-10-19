/*
  PRIVATE : CAN ONLY ACCESS WITHIN THAT CLASS
  DEFAULT : CAN ACCESS WITHIN CLASS & WITHIN PACKAGE
  PROTECTED : CAN ACCESS WITHIN CLASS & WITHIN PACKAGE & OUTSIDE THE PACKAGE BY SUBCLASS
  PUBLIC :  CAN ACCESS WITHIN CLASS & WITHIN PACKAGE & OUTSIDE THE PACKAGE BY SUBCLASS & OUTSIDE THE PACKAGE 
 */
public class P2accesmod {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.username = "puneeth";
        System.out.println(myAccount.username);
        //myAccount.password = "abc@123"; //get error cant access it is a private
        //System.out.println(myAccount.password); //get error cant access it is a private

        myAccount.setPassword("abcd"); //initalized the password using the method
        //System.out.println(myAccount.password); //wont access can only be set
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pswd){
        password = pswd;
    }
}