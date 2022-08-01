package com.hillel.kucherenko.homeWork15;

public class Main {
    public static void main(String[] args) {
        ClassicMusic classicMusicGroup = new ClassicMusic("Orchestra X");
        PopMusic popMusicGroup = new PopMusic("some Pop-group");
        RockMusic rockMusicGroup = new RockMusic("Metallica");

        MusicStyles[] atlasWeekend = {classicMusicGroup, popMusicGroup, rockMusicGroup};

        for (MusicStyles group : atlasWeekend) {
            group.playMusic();
        }
    }

}
