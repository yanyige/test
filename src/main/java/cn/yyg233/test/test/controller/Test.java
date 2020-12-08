package cn.yyg233.test.test.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.*;

/**
 * @author yige.yyg
 * @date 2019-10-08 8:51 PM
 **/
public class Test {
    public static void main(String[] args) {
        String serializedObject = "";
        Student s = new Student("yige", "12");

        // serialize the object
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream so = new ObjectOutputStream(bo);
            so.writeObject(s);
            so.flush();
            serializedObject = bo.toString();
        } catch (Exception e) {
            System.out.println(e);
        }

        // deserialize the object
        try {
            byte b[] = serializedObject.getBytes();
            ByteArrayInputStream bi = new ByteArrayInputStream(b);
            ObjectInputStream si = new ObjectInputStream(bi);
            Student obj = (Student) si.readObject();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Data
    @AllArgsConstructor
    static class Student implements Serializable {
        String name;
        String age;
    }

}

