package example.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class testProperties {

    public static void main(String args[]) throws IOException
    {

        Properties config = new Properties();
        FileInputStream fis;
        fis = new FileInputStream(System.getProperty("user.dir")+ "/src/main/resources/Config.properties");
       config.load(fis);
        System.out.println(config.getProperty("browser"));

        fis = new FileInputStream(System.getProperty("user.dir")+ "/src/main/resources/or.properties");
        config.load(fis);
        System.out.println(config.getProperty("bmlBtn"));




    }
}

