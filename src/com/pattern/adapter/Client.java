package com.pattern.adapter;

public class Client {
    public static void main(String[] args) {
        MediaPlayerInterface audioPlayer=new AudioPlayer();
        audioPlayer.play("mp3","jasonmusic.mp3");

        AdvancedMediaPlayerInterface mp4Player=new Mp4Player();
        MediaPlayerInterface  advancedPlayer= new AdvancedMediaPlayerAdapter(mp4Player);
        advancedPlayer.play("mp4","alone.mp4");

        AdvancedMediaPlayerInterface vlcPlayer=new VlcPlayer();
        MediaPlayerInterface  advancedPlayer1= new AdvancedMediaPlayerAdapter(vlcPlayer);
        advancedPlayer1.play("vlc","farway.vlc");


    }
}
