package com.patters.adapter;

public class MainRunner {

    public static void main(String[] args) {
        VideoDetails video1 = new VideoDetails("dangal", VideoFormat.MP4);
        PlayerFactory.getPlayer("mp4").play(video1);
        PlayerFactory.getPlayer("vlc").play(video1);
        PlayerFactory.getPlayer("avi").play(video1);

        VideoDetails video2 = new VideoDetails("Hero no 1", VideoFormat.TS);
        PlayerFactory.getPlayer("mp4").play(video2);
        PlayerFactory.getPlayer("avi").play(video2);
    }
}
