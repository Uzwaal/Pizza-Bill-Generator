import BillGenerator.DeluxPizza;
import BillGenerator.PizzaClass;

public class Main{
    public static void main(String[] args) {
       /* PizzaClass newPrice=new PizzaClass(true);
        newPrice.AddExtraCheese();
        newPrice.TakeAwayHome();
        newPrice.GetBill();*/

        DeluxPizza pizzaPrice = new DeluxPizza(true);
        pizzaPrice.AddExtraCheese();
        pizzaPrice.AddExtraToppings();
        pizzaPrice.TakeAwayHome();
        pizzaPrice.GetBill();

    }
}