package MultiplatformSystem;

public class EffectDecorator extends MediaDecorator{
    public EffectDecorator(Media decoratedMedia) {
        super(decoratedMedia);
    }

    public void play(String fileName){
        media.play(fileName);
        System.out.println("-> 音效增强");
    }
}
