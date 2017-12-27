package com.company;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.LinkedList;


public class admin {
    private String username_admin;
    private char[] password_admin;
    protected HashMap<String, course> CourseOffered = new HashMap<String, course>();
    protected HashMap<String, student> RegisteredStudent = new HashMap<String, student>();


    //sets username of com.company.admin object
    private void set_admin_details(String username_admin, char[] password_admin) {
        this.username_admin = username_admin;
        this.password_admin = password_admin;
    }

    protected course set_new_course(String course_name, String student_limit, int sections) {
        course course = new course();
        course.course_name = course_name;
        course.student_limit = student_limit;
        course.sections = sections;
        return course;
    }

    protected student add_new_student(String Name, String ID, String Username, char[] Password) {
        student student_temp = new student();
        student_temp.Name = Name;
        student_temp.ID = ID;
        student_temp.Password = Password;
        return student_temp;
    }

    protected void addCourseToRecord(String course_name, String student_limit, int sections){
        course course_temp;
        course_temp = set_new_course(course_name, student_limit, sections);
        CourseOffered.put(course_name, course_temp);
    }


    protected void addStudentToRecord(String Name, String ID, String Username, char[] Password){
        student student_temp;
        student_temp = add_new_student(Name, ID, Username, Password);
        RegisteredStudent.put(Username, student_temp);
    }

    protected void deleteStudent(student c){
        RegisteredStudent.remove(c.Username);
    }

    protected void deleteCourse(course c){
        CourseOffered.remove(c.course_name);
    }

    protected void adminEntry(){
        //add course: name, limit, section
        //add section to course
        //add student
        //delete from student list
        JFrame adminframe = new JFrame("Admin Panel");
        adminframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //adminframe.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        adminframe.setLayout(new FlowLayout());
        //.pack();


        //adminframe.setSize(400, 400);


        //buttons
        JButton AddStudent = new JButton("Add New Student");
        JButton DeleteStudent = new JButton("Delete Student");

        JButton AddCourse = new JButton("Add New Course");
        JButton DeleteCourse = new JButton("Delete Student");


        //add data to hashmap from JFrame
        //text fields stored and sent to hashmap

        //store a textfield value to hashmap
        //add student

        Container add_student = new Container();

        JTextField username_student = new JTextField(20);
        JPasswordField password_student = new JPasswordField(20);

        JTextField ID_student = new JTextField(20);
        JTextField Name_student = new JTextField(20);

        add_student.add(username_student, BorderLayout.SOUTH);
        add_student.add(password_student, BorderLayout.SOUTH);
        add_student.add(ID_student, BorderLayout.SOUTH);
        add_student.add(Name_student, BorderLayout.SOUTH);

        student c = new student();

        c.Username = username_student.getText();
        c.Password = password_student.getPassword();
        c.ID = ID_student.getText();
        c.Name = Name_student.getText();










        //View data from hashmap from JFrame
        //Delete data from hashmap through JFrame


        adminframe.setVisible(true);
    }











}
