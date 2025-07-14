package Composite;

public class Client {
    public static void main(String[] args) {
        Directory dir1,dir2,dir3;
        File file1,file2,file3,file4;

        dir1 = new Directory("root/");
        dir2 = new Directory("doc/");
        dir3 = new Directory("img/");
        file1=new File("resume.docx");
        file2=new File("readme.txt");
        file3=new File("photo.jpg");
        file4=new File("index.html");

        dir1.add(dir2);
        dir2.add(file1);
        dir2.add(file2);
        dir2.add(dir3);
        dir3.add(file3);
        dir3.add(file4);

        dir1.display();
    }
}
