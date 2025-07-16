package visitor;

public class ImageFile implements AbstractFile {
    public void accept(FileVisitor visitor) {
        visitor.visit(this);
    }
}
