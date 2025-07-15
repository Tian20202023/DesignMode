package MultiplatformSystem;

public abstract class Media {
    protected Platform platform;
    public Media(Platform platform) {
        this.platform = platform;

    }
    public Media(){}
    public abstract void play(String filename);
}
