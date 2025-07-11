package Factory;

public class Client {
    public static void main(String[] args) {
        ImageReaderFactory factory1=new GifReaderFactory();
        ImageReader reader1=factory1.createReader();
        reader1.read();
        ImageReaderFactory factory2=new JpgReaderFactory();
        ImageReader reader2=factory2.createReader();
        reader2.read();
    }
}
