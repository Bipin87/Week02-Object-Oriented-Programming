import java.util.*;
public class Item{
  int itemCode;
  String itemName;
  double price;
   //Default constructor
  Item(int itemCode, String itemName, double price){
   this.itemCode=itemCode;
   this.itemName=itemName;
   this.price=price;
  }
  double totalPrice(int quantity){
   return price *quantity;
  }
   
  // Display the Item details
  void itemDetail(){
    System.out.println("item Code :"+ itemCode);
    System.out.println("item name :"+itemName);
    System.out.println("item price :"+price);
  }
  public static void main(String[]args){
   Scanner input =new Scanner(System.in);
   int quantity=input.nextInt();
   Item item=new Item(25, "Desktop", 49999.0);
   item.itemDetail();
   double result=item.totalPrice(quantity);
   System.out.println("The given quantity :"+quantity +" and total price is: "+result);
   input.close();
  }
}