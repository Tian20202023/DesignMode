package MultiplatformSystem;

public class MP3 extends Media{
    public MP3(Platform platform) {
        super(platform);
    }

    public void play(String filename) {
        System.out.println("播放媒体："+filename+".mp3"+platform.decode(filename));
    }

    public String getName(String fileName) {
        return fileName+".mp3";
    }
}
