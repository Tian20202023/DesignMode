package Decorater;

public class MilkDecorator extends BeverageDecorator{
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }
    public String getDescription(){
        return beverage.getDescription()+"+Milk";
    }
    public int getCost(){
        return beverage.getCost()+3;
    }
}
