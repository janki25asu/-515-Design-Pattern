package src;

public class UserInfoItem {

    int UserType;
    String name;
    UserInfoItem(int ut,String n){
        this.UserType=ut;
        this.name=n;
    }
    public void createUser(){
        System.out.println(" User has been created");
        System.out.println("Name:  " + this.name);
        Buyer b1=new Buyer(0,this.name);
    }
}
