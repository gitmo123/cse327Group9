package com.company;

import java.util.HashMap;

public class student {

    protected String Name;
    protected String ID;
    protected String Username;
    protected char[] Password;
    protected HashMap<String, course> CourseTaken = new HashMap<String, course>();


    private void AddCourse(course C){
        CourseTaken.put(C.course_name, C);
    }}

    //Display contents of LinkedList to JFrame
    //can be done using a csv file
    /*
    private SeeCoursesTaken() {
        if(isEmpty()) {
            System.out.print("\nLIST IS EMPTY !!!"); //need to add a prompt to JFrame instead of system.out.print
        } else {
            while(current!=null) {
                current.displayLink();
                current=current.next;
            }
        }
    }*

    private void DeleteCourse(course C){
        Node<Item> currentNode = first;
        Node<Item> previousNode = null;
        while(currentNode != null){
            if(item.equals(currentNode.item)){
                if(previousNode  == null) {
                    first = currentNode.next;
                }
                else {
                    previousNode.next = currentNode.next;
                }
                N--;
            }
            else {
                previousNode = currentNode;
            }
            currentNode = currentNode.next;
        }
    }
}


}*/
