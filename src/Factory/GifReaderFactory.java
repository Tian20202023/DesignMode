package Factory;

public class GifReaderFactory implements ImageReaderFactory {
    public ImageReader createReader(){
        System.out.println("使用GifReaderFactory：");
        return new GifReader();
    }
}
