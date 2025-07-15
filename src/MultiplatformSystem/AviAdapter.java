package MultiplatformSystem;

public class AviAdapter extends Media{
    protected MP4 mp4;
    public AviAdapter(MP4 mp4){
        this.mp4=mp4;
    }

    public void play(String fileName) {
        System.out.println("播放媒体：" + fileName + ".avi（通过适配器转换）");
    }
}
