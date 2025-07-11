package AbstractFactory;

public class Client {
    public static void main(String[] args) {
        System.out.println("使用 WindowsFactory：");
        GUIFactory WinFactory=new WindowsFactory();
        Button winButton=WinFactory.createButton();
        winButton.render();
        TextField winTextField=WinFactory.createTextField();
        winTextField.render();

        System.out.println("使用 MacFactory：");
        GUIFactory MacFactory=new MacFactory();
        Button macButton=MacFactory.createButton();
        macButton.render();
        TextField macTextField=MacFactory.createTextField();
        macTextField.render();

    }
}
