package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.*;

public class DuplicateCounter {
    private HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();

    void count(String dataFile) throws IOException {
        Scanner scnr = new Scanner(new File(dataFile));
        while (scnr.hasNext()) {
            String line = scnr.next();
            Integer count = wordCounter.get(line);
            if (count != null) {
                wordCounter.put(line, count + 1);
            } else {
                wordCounter.put(line, 1);
            }
        }
        scnr.close();
    }

    void write(String outputFile) throws IOException {
        PrintWriter pw = new PrintWriter(outputFile);
        pw.println(wordCounter);
        pw.flush();
        pw.close();
    }

}
