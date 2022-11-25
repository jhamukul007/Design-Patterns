package com.patters.adapter;

import java.util.List;

public interface Player {
    void play(VideoDetails videoDetails);
    List<VideoFormat> getVideoSupported();
}
