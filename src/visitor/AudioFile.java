package visitor;

public class AudioFile implements AbstractFile {
    public void accept(FileVisitor visitor) {
        visitor.visit(this);
    }
}
