package BillGenerator;

import java.sql.SQLOutput;

public class PizzaClass {
    private int price;
    private boolean veg;
    private int AddCheese=100;
    private int AddToppings=100;
    private int Packaging=25;
    private int basePrice;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isTakenHome;

    public PizzaClass(boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price=300;}
        else{
            this.price=400;}
        basePrice=this.price;
    }
   public void AddExtraCheese(){
        isExtraCheeseAdded=true;
      // System.out.println("Extra cheese added");
        this.price+=AddCheese;

   }

   public void AddExtraToppings(){
        isExtraToppingsAdded=true;
       //System.out.println("Extra toppings added");
       this.price+=AddToppings;
   }

   public void TakeAwayHome(){
        isTakenHome=true;
       //System.out.println("Taking home");
       this.price+=Packaging;
   }

   public void GetBill(){
        String bill="";
       System.out.println("The base price of pizza is: "+ basePrice);
       if(isExtraCheeseAdded){
           bill += "Extra cheese added: "+ AddCheese +"\n";
       }
       if(isExtraToppingsAdded){
           bill += "Extra toppings added: "+ AddToppings +"\n";
       }
       if(isTakenHome){
           bill +="Packaging charge: " + Packaging +"\n";
       }
       bill += "Bill is: " +this.price;
       System.out.println(bill);

   }
}

