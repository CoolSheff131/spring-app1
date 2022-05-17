package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
//                ", musicPlayer=" + musicPlayer.playMusic() +
                '}';
    }

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }
}
