package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    private Music music1;
    private Music music2;
//    private List<Music> musicList = new ArrayList<>();

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }

//    @Autowired
//    public MusicPlayer(@Qualifier("classicalMusic") Music music,@Qualifier("rockMusic") Music music2) {
//        this.music = music;
//        this.music2 = music2;
//    }

//    public String playMusic(){
//        return "Playing: "+ rockMusic.getSong();
//    }
}
