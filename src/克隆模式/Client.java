package 克隆模式;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Photo photo=new Photo(16);
        Resume resume=new Resume("ysa", 22, photo);
        //浅拷贝
        Resume resume1=resume.clone();
        photo.setSize(32);
        System.out.println("浅拷贝：");
        System.out.println("resume:"+resume);
        System.out.println("resume1:"+resume1);
        //深拷贝
        Resume resume2=resume.deepclone();
        photo.setSize(64);
        System.out.println("深拷贝：");

        System.out.println("resume:"+resume);
        System.out.println("resume2:"+resume2);

        //选择深拷贝还是浅拷贝复制照片
        Resume newResume=new Resume("zly", 25, new Photo(64));
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        if("y".equalsIgnoreCase(str)) {
            newResume=resume.deepclone();
            System.out.println("deepclone");
        }else if("n".equalsIgnoreCase(str)){
            newResume=resume.clone();
            System.out.println("clone");
        }
    }
}
