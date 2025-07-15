package MultiplatformSystem;

public class MP4 extends Media{
    public MP4(Platform platform) {
        super(platform);
    }

    public void play(String filename) {
        System.out.println("播放媒体："+filename+".mp4"+platform.decode(filename));
    }

    public String getName(String fileName) {
        return fileName+".mp4";
    }
}
