package com.hj.decoupling.demo02;

/**
 * @program: day01
 * @ClassName Download
 * @description:
 * @author: huJie
 * @create: 2020-10-15 15:22
 **/
public class Download {

    private IDisk disk;
    public Download(IDisk disk) {
        this.disk = disk;

    }

    public void download(String file){
        disk.save(file);
    }

    public static void main(String[] args) {
//        HardDisk hardDisk = new HardDisk();
//        UDisk uDisk = new UDisk();
        Download download = new Download(new HardDisk());
        Download download1 = new Download(new UDisk());
        download.download("电影...");
        download1.download("音乐....");
    }
}
