package Serializable;

import java.io.*;

/**
 * serialization is a process of converting state of object into
 * byteArray
 * serialization is important when travelling object through network
 * Only objects that implemented Serializable interface can written to output stream
 */
public class serializableDemo {
    public serializableDemo(){
        try {
            student s = new student("damitha");
            FileOutputStream fout = new FileOutputStream("fout.txt");
            try {
                ObjectOutputStream out = new ObjectOutputStream(fout);
                out.writeObject(s);
                out.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
