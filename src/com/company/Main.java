package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.List;




public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        File file = new File("1.txt");
        InputStream in;
        try( BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))){
            StringBuffer strAllLinesFromFile = new StringBuffer();
            String str = null;
            while ((str = reader.readLine()) != null ){

            }


        }
        */


        Path path = Paths.get("2.txt");
        String strNew = "New string to file";

        try {
            Files.write(path, strNew.getBytes(), // StandardOpenOption.TRUNCATE_EXISTING);
                    Files.exists(path, LinkOption.NOFOLLOW_LINKS) ? StandardOpenOption.TRUNCATE_EXISTING : StandardOpenOption.CREATE);
        } catch(IOException e) {
            e.printStackTrace();

        }


        if( Files.exists(path, LinkOption.NOFOLLOW_LINKS) ){
            try{
                List<String> lines = Files.readAllLines(path);
            } catch(IOException e) {
                e.printStackTrace();
            }

        }

    }
}
