package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.memento.example1;

/**
 * @author eugenia
 */
public class FileWriterCaretaker {

    private Object obj;

    /**
     * Saves the current status
     *
     * @param fileWriter {@link FileWriterUtil}
     */
    public void save(FileWriterUtil fileWriter) {
        this.obj = fileWriter.save();
    }

    /**
     * Restore the latest saved status
     *
     * @param fileWriter {@link FileWriterUtil}
     */
    public void setSaved(FileWriterUtil fileWriter) {
        fileWriter.undoToLastSave(obj);
    }
}
