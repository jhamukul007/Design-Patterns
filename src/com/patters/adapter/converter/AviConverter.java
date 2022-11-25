package com.patters.adapter.converter;

import com.patters.adapter.VideoDetails;
import com.patters.adapter.VideoFormat;

public class AviConverter implements Converter{

    @Override
    public VideoDetails convert(VideoDetails videoDetails) {
        System.out.println("Converting file " + videoDetails.getFileName() + " to the avi format");
        VideoDetails details = null;
        try {
            details = (VideoDetails) videoDetails.clone();
            details.setVideoFormat(VideoFormat.AVI);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return details;
    }
}
