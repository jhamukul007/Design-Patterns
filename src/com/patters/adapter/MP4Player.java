package com.patters.adapter;

import java.util.Arrays;
import java.util.List;

// Only Play MP4
public class MP4Player implements Player{

    @Override
    public void play(VideoDetails detail) {
        if(!getVideoSupported().contains(detail.getVideoFormat())){
            System.out.println("[MP4Player] doesn't support movie format " + detail.getVideoFormat());
            return;
        }
        System.out.println("[MP4Player] playing movie : " + detail.getFileName());
    }

    @Override
    public List<VideoFormat> getVideoSupported() {
        return List.of(VideoFormat.MP4);
    }
}
