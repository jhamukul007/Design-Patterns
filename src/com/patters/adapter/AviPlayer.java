package com.patters.adapter;

import java.util.List;

import static com.patters.adapter.VideoFormat.AVI;

public class AviPlayer implements Player{

    @Override
    public void play(VideoDetails videoDetails) {
        if(!getVideoSupported().contains(videoDetails.getVideoFormat())){
            System.out.println("[AviPlayer] doesn't support movie format " + videoDetails.getVideoFormat());
            return;
        }
        System.out.println("[AviPlayer] playing movie : " + videoDetails.getFileName());
    }

    @Override
    public List<VideoFormat> getVideoSupported() {
        return List.of(AVI);
    }
}
