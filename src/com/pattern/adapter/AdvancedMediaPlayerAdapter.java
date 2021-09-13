package com.pattern.adapter;

public class AdvancedMediaPlayerAdapter implements  MediaPlayerInterface{
AdvancedMediaPlayerInterface advancedMediaPlayerInterface;
    public  AdvancedMediaPlayerAdapter(AdvancedMediaPlayerInterface myMediaPlayer){
advancedMediaPlayerInterface=myMediaPlayer;
    }
    @Override
    public void play(String audioType, String fileName) {
        advancedMediaPlayerInterface.loadFileName(fileName);
        advancedMediaPlayerInterface.listen();
    }
}
