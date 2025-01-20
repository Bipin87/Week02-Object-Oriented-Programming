import java.util.*;
class MobilePhone{
  //create the three variable itemCode, itemName and price
  String brand;
  String model;
  double price;
  //Default constructor
  MobilePhone(String brand, String model, double price){
   this.brand=brand;
   this.model=model;
   this.price=price;
  }
  //Display the details 
  void mobileDetail(){
    System.out.println("mobile brand :"+ brand);
    System.out.println("mobile model :"+model);
    System.out.println("mobile price :"+price);
  }
  public static void main(String[]args){
   MobilePhone mobile=new MobilePhone("Samsung", "S-20 Ultra", 120500.50);
   mobile.mobileDetail();
  }
}