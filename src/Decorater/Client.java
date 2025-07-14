package Decorater;

public class Client {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        BeverageDecorator milkDecorator = new MilkDecorator(coffee);
        BeverageDecorator sugarDecorator = new SugarDecorator(milkDecorator);
        System.out.println("饮料描述："+sugarDecorator.getDescription());
        System.out.println("总价："+sugarDecorator.getCost()+"元");
    }
}
