package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

//        Music classicalMusic = context.getBean("classicalMusic",Music.class);
//        Music rockMusic = context.getBean("rockMusic",Music.class);
//
//        System.out.println(classicalMusic.getSong());
//        System.out.println(rockMusic.getSong());
//        Music music = context.getBean("musicBean",Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(comparison);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        Computer computer = context.getBean("musicPlaer",Computer.class);
//        System.out.println(computer);
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic",ClassicalMusic.class);
        ClassicalMusic classicalMusic2= context.getBean("classicalMusic",ClassicalMusic.class);
        //musicPlayer.playMusic();
        System.out.println(classicalMusic == classicalMusic2);
        context.close();
    }
}
