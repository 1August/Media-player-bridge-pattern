package com.company;

public class WindowsMediaPlayer extends MediaPlayer{
    public WindowsMediaPlayer(String mediaName) {
        super("Windows Media Player.", mediaName);
    }

    @Override
    public void playMedia() {
        System.out.print(getClass().getSimpleName() + " is open! ");
        getMediaFormat().readMedia();
        System.out.print(getMediaName() + " is playing.");
    }
}
