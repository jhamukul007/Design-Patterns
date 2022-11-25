package com.patters.adapter;

import java.util.List;

import static com.patters.adapter.VideoFormat.AVI;
import static com.patters.adapter.VideoFormat.MOV;
import static com.patters.adapter.VideoFormat.MP4;
import static com.patters.adapter.VideoFormat.MPEG;
import static com.patters.adapter.VideoFormat.WEBM;

// eg VLC player can play MP4, MOV, AVI, WEBM, MPEG
public class VLCPlayer implements Player {

    @Override
    public void play(VideoDetails videoDetails) {
        if(!getVideoSupported().contains(videoDetails.getVideoFormat())){
            System.out.println("[MP4Player] doesn't support movie format " + videoDetails.getVideoFormat());
            return;
        }
        System.out.println("[MP4Player] playing movie : " + videoDetails.getFileName());
    }

    @Override
    public List<VideoFormat> getVideoSupported() {
        return List.of(MP4, MOV, AVI, WEBM, MPEG);
    }
}
