package MultiplatformSystem;

public class MediaPlayerFacade {
    public void playMedia(Media media,String fileName) {
        media.play(fileName);
    }
}
