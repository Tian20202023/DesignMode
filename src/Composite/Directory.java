package Composite;

import java.util.ArrayList;

public class Directory extends FileSystemNode {
    public Directory(String indent) {
        this.name= indent;
    }
    private ArrayList list=new ArrayList();


    public void add(FileSystemNode element)
    {
        list.add(element);
    }

    public void delete(FileSystemNode element)
    {
        list.remove(element);
    }

    public void display()
    {
        System.out.println(name);
        for(Object object:list)
        {
            ((FileSystemNode)object).display();
        }

    }
}
