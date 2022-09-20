package com.hillel.mashtalyar.homework.homework15;

import com.hillel.mashtalyar.homework.homework11.Arrays;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicStyles=new MusicStyles[]{new PopMusic(),new ClassicMusic(), new RockMusic()};
        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();

        }
    }
}
