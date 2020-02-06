package de.snx.statsapi.addon.topwall.manager;

import de.snx.statsapi.addon.topwall.file.TopwallFile;

public class FileManager {

    public TopwallFile topwallFile;

    public FileManager(){
        this.topwallFile = new TopwallFile();
    }

    public TopwallFile getLocationFile() {
        return this.topwallFile;
    }
}