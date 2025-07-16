package memento;

public class Editor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // 创建备忘录：保存当前状态
    public EditorMemento save() {
        return new EditorMemento(text);
    }

    // 从备忘录恢复状态
    public void restore(EditorMemento memento) {
        text = memento.getText();
    }

}
