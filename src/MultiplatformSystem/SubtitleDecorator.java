package MultiplatformSystem;

public class SubtitleDecorator extends MediaDecorator{

    public SubtitleDecorator(Media decoratedMedia) {
        super(decoratedMedia);
    }

    public void play(String fileName){
        media.play(fileName);
        System.out.println("-> 字幕开启");
    }
}
