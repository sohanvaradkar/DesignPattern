package com.pattern.adapter;

public interface MediaPlayerInterface {
    public void play(String audioType,String fileName);
}
class AudioPlayer implements MediaPlayerInterface{

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3"))
            System.out.println("playing mp3 file. Name "+fileName);
        else
            System.out.println("Invalid Media "+audioType+" format not supported ");
    }
}
