package com.patters.adapter;

public class VideoDetails implements Cloneable{
    private String fileName;
    private VideoFormat videoFormat;

    public VideoDetails(String fileName, VideoFormat videoFormat) {
        this.fileName = fileName;
        this.videoFormat = videoFormat;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public VideoFormat getVideoFormat() {
        return videoFormat;
    }

    public void setVideoFormat(VideoFormat videoFormat) {
        this.videoFormat = videoFormat;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
