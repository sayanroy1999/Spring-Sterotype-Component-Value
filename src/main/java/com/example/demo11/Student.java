package com.example.demo11;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//If we declare the bean name as ob, then wthe IOC will try to get the ban with ob. So in main, we need to change it to ob
//Else it will take student as the object name. byt the class name should be in camel case, that is "Student"
@Component("ob")
public class Student {
    @Value("Pikachu")
    private String studentName;
    @Value("Oakland")
    private String city;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
