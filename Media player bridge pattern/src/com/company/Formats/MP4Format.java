package com.company.Formats;

import com.company.MediaFormat;

public class MP4Format implements MediaFormat {
    @Override
    public void readMedia() {
        System.out.println("MP4 format is reading!");
    }
}
