package Composite;

public class File extends FileSystemNode {
    public File(String indent) {
        this.name = indent;
    }
    public void display(){
        System.out.println(name);
    }
}
