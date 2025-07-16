package visitor;

public class Client {
    public static void main(String[] args) {
        AudioFile audioFile = new AudioFile();
        ImageFile imageFile = new ImageFile();
        VideoFile videoFile = new VideoFile();

        FileVisitor fv=new VirusScannerVisitor();
        audioFile.accept(fv);
        imageFile.accept(fv);
        videoFile.accept(fv);

    }
}
