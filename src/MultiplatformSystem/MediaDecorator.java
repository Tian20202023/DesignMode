package MultiplatformSystem;

public abstract class MediaDecorator extends Media{
    protected Media media;

    public MediaDecorator(Media media) {
        this.media = media;
    }

    public void play(String fileName){
        media.play(fileName);
    }
}
