package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

    private Music music;
    private Music music2;
    private List<Music> musicList = new ArrayList<>();

    private String name;
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

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music,@Qualifier("rockMusic") Music music2) {
        this.music = music;
        this.music2 = music2;
    }

    public String playMusic(){
        return "Playing: "+ music.getSong() + music2.getSong();
    }
}
