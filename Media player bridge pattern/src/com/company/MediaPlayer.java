package com.company;

public abstract class MediaPlayer {
    private String playerName;
    private String mediaName;
    private MediaFormat mediaFormat;

    public MediaPlayer(String playerName, String mediaName) {
        this.playerName = playerName;
        this.mediaName = mediaName;
    }

    public abstract void playMedia();

    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public MediaFormat getMediaFormat() {
        return mediaFormat;
    }
    public void setMediaFormat(MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat;
    }
    public String getMediaName() {
        return mediaName;
    }
    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }
}
