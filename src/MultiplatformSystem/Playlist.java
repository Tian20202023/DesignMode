package MultiplatformSystem;

import Composite.FileSystemNode;

import java.util.ArrayList;

public class Playlist extends Media{
    private ArrayList<Media> items=new ArrayList<>();

    public void addItem(Media media){
        if(media!=null){
            items.add(media);
        }
    }

    public void removeItem(Media media){
        items.remove(media);
    }

    public void play(String fileName)
    {
        System.out.println("播放子播放列表：");
        for(Media item:items)
        {
            item.play(fileName);
        }

    }
}
