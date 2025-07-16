package memento;

import java.util.Stack;

public class EditorHistory {
    private Stack<EditorMemento> history = new Stack<>();

    // 保存状态
    public void push(EditorMemento memento) {
        history.push(memento);
    }

    // 恢复状态
    public EditorMemento pop() {
        if (history.isEmpty()) {
            System.out.println("没有更多可撤销的状态");
            return null;
        }
        return history.pop();
    }

    public boolean hasHistory() {
        return !history.isEmpty();
    }
}
