package com.company.Formats;

import com.company.MediaFormat;

public class WebmFormat implements MediaFormat {
    @Override
    public void readMedia() {
        System.out.println("Webm format is reading!");
    }
}
