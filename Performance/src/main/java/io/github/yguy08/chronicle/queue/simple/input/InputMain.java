package io.github.yguy08.chronicle.queue.simple.input;

import java.io.IOException;
import java.util.Scanner;

import net.openhft.chronicle.queue.ExcerptAppender;
import net.openhft.chronicle.queue.impl.single.SingleChronicleQueue;
import net.openhft.chronicle.queue.impl.single.SingleChronicleQueueBuilder;

public class InputMain {
    public static void main(String[] args) throws IOException{
        String path = "queue";
        SingleChronicleQueue queue = SingleChronicleQueueBuilder.binary(path).build();
        ExcerptAppender appender = queue.acquireAppender();
        Scanner read = new Scanner(System.in);
        while (true) {
            System.out.println("type something");
            String line = read.nextLine();
            if (line.isEmpty())
                break;
            appender.writeText(line);
        }
        System.out.println("... bye.");
    }
    
}

