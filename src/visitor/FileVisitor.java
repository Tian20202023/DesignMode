package visitor;

public interface FileVisitor {
    public void visit(VideoFile file);
    public void visit(ImageFile file);
    public void visit(AudioFile file);
}
