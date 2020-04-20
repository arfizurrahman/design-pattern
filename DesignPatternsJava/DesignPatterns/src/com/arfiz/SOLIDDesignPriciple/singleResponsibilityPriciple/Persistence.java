package com.arfiz.SOLIDDesignPriciple.singleResponsibilityPriciple;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Persistence {
    public void saveToFile(Journal j, String fileName, boolean overwrite){
        File file = new File(fileName);
        try {
            if (overwrite || !file.exists()) {
                FileWriter myWriter = new FileWriter(fileName);
                myWriter.write(j.toString());
                myWriter.close();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
