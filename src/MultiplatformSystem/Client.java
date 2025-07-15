package MultiplatformSystem;

public class Client {
    public static void main(String[] args) {
        // 创建平台实例
        Platform windows = new WindowsPlatform();
        Platform linux = new LinuxPlatform();

        // 创建媒体
        Media song1 = new MP3(windows);
        Media video1 = new MP4(linux);

        // 添加装饰器
        Media decoratedSong1 = new SpeedDecorator(new SubtitleDecorator(song1));
        Media decoratedVideo1 = new EffectDecorator(video1);

        // 创建AVI适配器
        Media aviMedia = new AviAdapter(new MP4(windows));
        // 创建播放列表
        Playlist playlist = new Playlist();
        playlist.addItem(new MP3(windows));
        playlist.addItem(aviMedia);

        // 使用代理
        Media proxyMedia = new MediaProxy(playlist, "admin");

        // 外观调用
        System.out.println("媒体播放开始：");
        MediaPlayerFacade player = new MediaPlayerFacade();
        player.playMedia(decoratedSong1,"song1");
        player.playMedia(decoratedVideo1,"video1");
        player.playMedia(aviMedia,"video2");
        player.playMedia(proxyMedia,"song2");

    }
}
