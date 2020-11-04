package com.hj.decoupling.demo01;

/**
 * @program: day01
 * @ClassName Download
 * @description:
 * @author: huJie
 * @create: 2020-10-15 15:22
 **/
public class Download {
    HardDisk hardDisk;
    UDisk uDisk;

    public Download(HardDisk hardDisk, UDisk uDisk) {
        this.hardDisk = hardDisk;
        this.uDisk = uDisk;
    }

    public void download(String file){
        hardDisk.save(file);
    }

    public void downloadByUDisk(String file){
        uDisk.save(file);
    }

    public static void main(String[] args) {
        HardDisk hardDisk = new HardDisk();
        UDisk uDisk = new UDisk();
        Download download = new Download(hardDisk, uDisk);
        download.download("下载电影...");
    }
}
