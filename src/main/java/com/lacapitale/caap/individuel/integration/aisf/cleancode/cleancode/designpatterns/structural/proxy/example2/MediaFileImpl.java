package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.proxy.example2;

/**
 * @author eugenia
 */
class MediaFileImpl implements MediaFile {

    private String fileName;

    public MediaFileImpl(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    public void printName() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
