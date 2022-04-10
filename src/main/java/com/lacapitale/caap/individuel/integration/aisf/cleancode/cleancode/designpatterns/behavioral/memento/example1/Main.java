package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.memento.example1;

/**
 * @author eugenia
 */
public class Main {

    private static final String FILE_WRITER_MSG_PREFIX = "File writer content->\n";

    public static void main(String[] args) {

        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First Set of Data\n");
        System.out.println(FILE_WRITER_MSG_PREFIX + fileWriter + "\n");

        // lets save the file
        caretaker.save(fileWriter);
        //now write something else
        fileWriter.write("Second Set of Data\n");

        //checking file contents
        System.out.println(FILE_WRITER_MSG_PREFIX + fileWriter + "\n");

        //lets setSaved to last save
        caretaker.setSaved(fileWriter);

        //checking file content again
        System.out.println(FILE_WRITER_MSG_PREFIX + fileWriter + "\n");

    }
}
