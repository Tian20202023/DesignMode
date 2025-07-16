package visitor;

public class VideoFile implements AbstractFile {
    public void accept(FileVisitor visitor) {
        visitor.visit(this);
    }
}
