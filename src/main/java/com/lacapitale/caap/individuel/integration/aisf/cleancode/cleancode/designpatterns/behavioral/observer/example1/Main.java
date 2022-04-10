package com.lacapitale.caap.individuel.integration.aisf.cleancode.cleancode.designpatterns.behavioral.observer.example1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        int observerAmount = 10;
        int messageCount = 100;

        //create subject
        MyTopic topic = new MyTopic();

        for (int i = 0; i < observerAmount; ++i) {
            Observer obj = new MyTopicSubscriber("Subscriber" + i);

            //register observers to the subject
            topic.register(obj);
            //attach observer to subject
            obj.setSubject(topic);
        }


        ExecutorService service = Executors.newFixedThreadPool(messageCount);
        for (int i = 0; i < messageCount; ++i) {
            final int fi = i;
            service.submit(() -> topic.postMessage("New Message " + fi));
        }

        while (((ThreadPoolExecutor) service).getCompletedTaskCount() != messageCount) {
            Thread.sleep(1000);
        }

        service.shutdown();


    }
}
