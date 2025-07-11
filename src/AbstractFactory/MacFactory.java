package AbstractFactory;

public class MacFactory extends GUIFactory {
    public Button createButton() {
        return new MacButton();
    }
    public TextField createTextField() {
        return new MacTextField();
    }
}
