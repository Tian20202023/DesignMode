package MultiplatformSystem;

public class MediaProxy extends Media{
    private Media realMedia;
    private String user;

    public MediaProxy(Media realMedia, String user) {
        this.realMedia = realMedia;
        this.user = user;
    }

    public void play(String fileName) {
        if ("admin".equals(user)) {
            realMedia.play(fileName);
            System.out.println("权限验证成功");
            System.out.println("日志记录：" + fileName + " 已播放");
        } else {
            System.out.println("权限不足，无法播放");
        }
    }
}
