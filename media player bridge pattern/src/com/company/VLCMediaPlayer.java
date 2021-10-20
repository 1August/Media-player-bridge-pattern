package com.company;

public class VLCMediaPlayer extends MediaPlayer{
    public VLCMediaPlayer(String mediaName) {
        super("VLC Media Player.", mediaName);
    }

    @Override
    public void playMedia() {
        System.out.print(getClass().getSimpleName() + " is open! ");
        getMediaFormat().readMedia();
        System.out.print(getMediaName() + " is playing.");
    }
}
