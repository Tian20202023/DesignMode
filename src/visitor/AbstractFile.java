package visitor;

public interface AbstractFile {
    void accept(FileVisitor visitor);
}
