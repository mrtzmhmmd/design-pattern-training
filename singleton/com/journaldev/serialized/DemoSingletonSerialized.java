package singleton.com.journaldev.serialized;

import java.io.*;

public class DemoSingletonSerialized {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();
        System.out.println("Instance One hashCode = " + instanceOne.hashCode());
        System.out.println("Instance Two hashCode = " + instanceTwo.hashCode());
    }
}
