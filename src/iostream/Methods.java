package iostream;

import setqueque.InputParameters;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Methods {

    void serialize() throws IOException {
//        TASK 3
//        List<Employee> list = new ArrayList<>();
//        String name;
//        int id;
//        int salary;
//
//        System.out.print("Enter the name: ");
//        name= InputParameters.getString();
//        System.out.print("Enter the id: ");
//        id = InputParameters.getInt();
//        System.out.print("Enter the salary: ");
//        System.out.println();
//        salary = InputParameters.getInt();
//        Employee employee = new Employee(name, id, salary);
//        list.add(employee);
//        FileOutputStream outputStream = new FileOutputStream("save.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//        objectOutputStream.writeObject(list);
//        objectOutputStream.flush();
//        System.out.println("Serialization: ");
//        System.out.println(objectOutputStream);
//        objectOutputStream.close();
        FileOutputStream outputStream = new FileOutputStream("save.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        Employee employee = new Employee("Vitalii", 25, 10000);
        objectOutputStream.writeObject(employee);
        objectOutputStream.flush();
        System.out.println("Serialization: ");
        System.out.println(objectOutputStream);
        objectOutputStream.close();
    }

    void deSerialize() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("save.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//        List<Employee> list = (List<Employee>) objectInputStream.readObject();
        Employee employee = (Employee) objectInputStream.readObject();
        System.out.println("\nDeserialization: ");
        System.out.println(employee);
//        System.out.println(list);
    }
}
