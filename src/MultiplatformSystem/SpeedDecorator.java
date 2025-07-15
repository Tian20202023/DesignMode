package MultiplatformSystem;

public class SpeedDecorator extends MediaDecorator{
    public SpeedDecorator(Media decoratedMedia) {
        super(decoratedMedia);
    }

    public void play(String fileName){
        media.play(fileName);
        System.out.println("-> 1.5 倍速");
    }
}
