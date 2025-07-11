package Factory;

public class JpgReaderFactory implements ImageReaderFactory {
    public ImageReader createReader(){
        System.out.println("使用JpgReaderFactory：");
        return new JpgReader();
    }
}
