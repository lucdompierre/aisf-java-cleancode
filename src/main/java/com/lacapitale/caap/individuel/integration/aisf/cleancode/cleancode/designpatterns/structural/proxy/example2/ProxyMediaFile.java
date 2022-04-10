package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.structural.proxy.example2;

/**
 * @author eugenia
 */
class ProxyMediaFile implements MediaFile {

    private MediaFileImpl mediaFileImpl;
    private String fileName;

    public ProxyMediaFile(String fileName) {
        this.fileName = fileName;
    }

    public void printName() {
        if (mediaFileImpl == null) {
            mediaFileImpl = new MediaFileImpl(fileName);
        }
        mediaFileImpl.printName();
    }
}
