package Decorater;

public class SugarDecorator extends BeverageDecorator{
    public SugarDecorator(Beverage beverage){
        super(beverage);
    }

    public String getDescription(){
        return beverage.getDescription()+"+Sugar";
    }
    public int getCost(){
        return beverage.getCost()+2;
    }
}
