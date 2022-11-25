package com.patters.adapter;

import com.patters.adapter.adapter.AVIPlayerAdapter;
import com.patters.adapter.adapter.Mp4PlayerAdapter;

public class PlayerFactory {
    /**
     * * Factory Design patterns
     * @param type
     * @return
     */
    public static Player getPlayer(String type){
        switch(type){
            case "vlc" : return new VLCPlayer();
            // Adapter design pattern
            // Client doesn't know about
            case "avi" : return new AVIPlayerAdapter();
            default: return new Mp4PlayerAdapter();
        }
    }
}
