package com.patters.adapter.converter;

import com.patters.adapter.VideoDetails;
import com.patters.adapter.VideoFormat;

public interface Converter {
    VideoDetails convert(VideoDetails videoDetails);
}
