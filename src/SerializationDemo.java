import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {
    int age;

    String name;
    int rollNum;
    public SerializationDemo(int age,String name,int rollNum){
        this.age=age;
        this.name=name;
        this.rollNum=rollNum;

    }
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ASUS\\OneDrive\\Desktop\\pioneer\\Program1_primenumber\\src\\serialization.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        try {
            SerializationDemo serializationDemo;
            for (int i=0;i<3;i++){
                serializationDemo = (SerializationDemo) objectInputStream.readObject();
            }
        } catch (IOException e) {
            e.getMessage();
        } finally {
            fileInputStream.close();
            objectInputStream.close();

        }
    }
}
