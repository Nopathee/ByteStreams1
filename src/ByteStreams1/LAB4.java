package ByteStreams1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB4 {
    public static void main(String[] args) {
        String s = "Hello World!";
        byte[] b = s.getBytes();

        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            BufferedOutputStream output = new BufferedOutputStream(file);
            output.write(b);
            output.close();
        } catch (FileNotFoundException e) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE,null,e);
        } catch (IOException e) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE,null,e);
        }

        try {
            FileInputStream file = new FileInputStream("data.dat");
            BufferedInputStream input = new BufferedInputStream(file);
            int ch;
            while ((ch = input.read()) != -1){
                System.out.print((char)ch);
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE,null,e);
        } catch (IOException e) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE,null,e);
        }


    }
}
