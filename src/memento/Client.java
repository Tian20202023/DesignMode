package memento;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        EditorHistory history = new EditorHistory();

        // 写入内容并保存状态
        editor.setText("Hello");
        System.out.println("写入：" + editor.getText());
        history.push(editor.save());

        editor.setText("Hello World");
        System.out.println("写入：" + editor.getText());
        history.push(editor.save());

        editor.setText("Hello World!");
        System.out.println("写入：" + editor.getText());
        history.push(editor.save());

        // 第一次撤销
        if (history.hasHistory()) {
            editor.restore(history.pop());
            System.out.println("执行撤销：" + editor.getText());
        }

        // 第二次撤销
        if (history.hasHistory()) {
            editor.restore(history.pop());
            System.out.println("执行撤销：" + editor.getText());
        }
    }
}
