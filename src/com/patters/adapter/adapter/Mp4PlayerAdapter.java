package com.patters.adapter.adapter;

import com.patters.adapter.MP4Player;
import com.patters.adapter.Player;
import com.patters.adapter.VideoDetails;
import com.patters.adapter.VideoFormat;
import com.patters.adapter.converter.Converter;
import com.patters.adapter.converter.Mp4VideoConverter;

import java.util.List;

public class Mp4PlayerAdapter implements Player {

    private MP4Player mp4Player;
    private Converter converter;

    public Mp4PlayerAdapter() {
        this.mp4Player = new MP4Player();
        converter = new Mp4VideoConverter();
    }

    @Override
    public void play(VideoDetails videoDetails) {
        if (!mp4Player.getVideoSupported().contains(videoDetails))
            videoDetails = converter.convert(videoDetails);
        mp4Player.play(videoDetails);
    }

    @Override
    public List<VideoFormat> getVideoSupported() {
        return null;
    }
}
