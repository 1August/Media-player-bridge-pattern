package com.company;

import com.company.Formats.MP4Format;
import com.company.Formats.WebmFormat;
import com.company.Players.VLCMediaPlayer;
import com.company.Players.WindowsMediaPlayer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MediaPlayer mediaPlayer;
        MediaFormat mediaFormat;

        System.out.println("Select media player:");
        System.out.println("---------------");
        System.out.println("1. VLC Media Player");
        System.out.println("2. Windows Media Player");
        int playerChoice = scanner.nextInt();

        System.out.println("Select video:");
        System.out.println("---------------");
        System.out.println("1. Rick Astley - Never Gonna Give You Up");
        System.out.println("2. Ed Sheeran - Shape of You");
        String mediaName;

        switch (scanner.nextInt()){
            case 1: mediaName = "Never Gonna Give You Up"; break;
            case 2: mediaName = "Shape of You"; break;
            default: mediaName = "";
        }

        System.out.println("Select format:");
        System.out.println("---------------");
        System.out.println("1. mp4");
        System.out.println("2. webm");

        switch (scanner.nextInt()){
            case 1: mediaFormat = new MP4Format(); break;
            case 2: mediaFormat = new WebmFormat(); break;
            default: mediaFormat = null;
        }

        switch (playerChoice){
            case 1: mediaPlayer = new VLCMediaPlayer(mediaName); break;
            case 2: mediaPlayer = new WindowsMediaPlayer(mediaName); break;
            default: mediaPlayer = null;
        }

        mediaPlayer.setMediaFormat(mediaFormat);
        mediaPlayer.playMedia();
    }
}
