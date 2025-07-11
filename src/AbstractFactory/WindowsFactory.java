package AbstractFactory;

public class WindowsFactory extends GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }
    public TextField createTextField() {
        return new WindowsTextField();
    }
}
