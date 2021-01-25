package by.itacademy;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        set();
        get();
    }

    private static void set() throws IOException {
        FileOutputStream outputStream = new FileOutputStream("D:\\mikhalevich\\lesson14\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        User user = new User("Bill", "12345");
        //сохраняем игру в файл
        objectOutputStream.writeObject(user);
        //Закрываем поток и освобождаем ресурс
        objectOutputStream.close();
    }

    private static void get() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("D:\\mikhalevich\\lesson14\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Object object = (User) objectInputStream.readObject();

        System.out.println(object);
    }
}
