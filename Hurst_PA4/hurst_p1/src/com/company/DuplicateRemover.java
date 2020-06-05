package com.company;

import java.io.*;
import java.util.HashSet;

class DuplicateRemover {
    private HashSet<String> uniqueWords = new HashSet<String>();

    DuplicateRemover() throws FileNotFoundException {
    }

    void remove(String dataFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(dataFile));
        String line = br.readLine();

        while (line != null) {
            uniqueWords.add(line);
            line = br.readLine();
        }

        br.close();
    }

    void write(String outputFile) throws IOException {
        PrintWriter pw = new PrintWriter(outputFile);
        pw.println(uniqueWords);
        pw.flush();
        pw.close();
    }

}


