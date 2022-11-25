package com.patters.adapter.adapter;

import com.patters.adapter.AviPlayer;
import com.patters.adapter.Player;
import com.patters.adapter.VideoDetails;
import com.patters.adapter.VideoFormat;
import com.patters.adapter.converter.AviConverter;
import com.patters.adapter.converter.Converter;

import java.util.List;

/**
 * * Adapter design patterns
 */
public class AVIPlayerAdapter implements Player {
    private Converter aviConverter;
    private Player aviPlayer;

    public AVIPlayerAdapter(){
        this.aviConverter = new AviConverter();
        this.aviPlayer = new AviPlayer();
    }

    @Override
    public void play(VideoDetails videoDetails) {
        if (!aviPlayer.getVideoSupported().contains(videoDetails))
            videoDetails = aviConverter.convert(videoDetails);
        aviPlayer.play(videoDetails);
    }

    @Override
    public List<VideoFormat> getVideoSupported() {
        return null;
    }
}
