package visitor;

public class DisplayVisitor implements FileVisitor{
    public void visit(ImageFile file) {
        System.out.println("对图片文件《photo.jpg》进行展示");
    }
    public void visit(VideoFile file) {
        System.out.println("对视频文件《movie.mp4》进行播放");
    }
    public void visit(AudioFile file) {
        System.out.println("对音频文件《song.mp3》进行播放");
    }
 }
