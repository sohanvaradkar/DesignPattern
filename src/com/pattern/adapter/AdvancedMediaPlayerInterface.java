package com.pattern.adapter;

public interface AdvancedMediaPlayerInterface {
    public void loadFileName(String fileName);
    public void listen();
}
class VlcPlayer implements AdvancedMediaPlayerInterface
{
   String myFile;

    @Override
    public void loadFileName(String fileName) {
        myFile=fileName;
    }

    @Override
    public void listen() {
        System.out.println("playing vlc file. name : "+myFile);
    }
}
class Mp4Player implements AdvancedMediaPlayerInterface
{
    String myFile;

    @Override
    public void loadFileName(String fileName) {
        myFile=fileName;
    }

    @Override
    public void listen() {
        System.out.println("playing mp4 file. name : "+myFile);
    }
}