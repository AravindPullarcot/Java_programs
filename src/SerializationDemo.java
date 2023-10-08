//import java.io.*;
//import
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    int age;

    String name;
    int rollNum;

    public SerializationDemo(int age, String name, int rollNum) {
        this.age = age;
        this.name = name;
        this.rollNum = rollNum;


    }

//    public String toJson(){
       //Gson gson new gson();
//        return gson.toJson();
//    }

    public void showDetails() {
        System.out.println("AGe" + this.age);
        System.out.println("Name:" + this.name);
        System.out.println("ID:" + this.rollNum);
    }

    public static void main(String[] args) throws Exception {
       /* FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ASUS\\OneDrive\\Desktop\\pioneer\\Program1_primenumber\\src\\serialization.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        try {
            SerializationDemo serializationDemo;
            for (int i = 0; i < 3; i++) {
                serializationDemo = (SerializationDemo) objectInputStream.readObject();
                serializationDemo.showDetails();
            }*/
        try {


            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\ASUS\\OneDrive\\Desktop\\pioneer\\Program1_primenumber\\src\\serialization.json");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            SerializationDemo serializationDemo = new SerializationDemo(12, "Arun", 12313);
            objectOutputStream.writeObject(serializationDemo);
            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch (IOException e){
            e.getMessage();
        }
    }

}



        /*} catch (IOException e) {
            e.getMessage();
        } finally {


            fileInputStream.close();
            objectInputStream.close();

        }
    }*/


// serialisation



