package BillGenerator;

public class DeluxPizza extends PizzaClass{

    public DeluxPizza(boolean veg) {
        super(veg);
        super.AddExtraCheese();
        super.AddExtraToppings();
    }

    @Override
    public void AddExtraCheese() {}

    @Override
    public void AddExtraToppings() {}
}
