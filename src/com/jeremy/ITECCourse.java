package com.jeremy;

import java.util.ArrayList;


public class ITECCourse {

    //creating private variables and arraylists
    private String name;
    private int code;
    private ArrayList<String> students = new ArrayList<String>();
    private int maxStudents;
    private String roomNumber;

    //creating public get and set methods
    public int getMaxStudents(){
        return maxStudents;
    }
    public void setMaxStudents(int maxStudents){
        this.maxStudents = maxStudents;
    }
    public int getCode(){
        return code;
    }
    public void setCode(int code){
        this.code = code;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRoomNumber(String roomNumber){
        this.roomNumber = roomNumber;
    }
    public String getRoomNumber(){
        return roomNumber;
    }


    //creating a method to return the ITEC info
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents, String classRoomNumber){
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<>();
        this.maxStudents = courseMaxStudents;
        this.roomNumber = classRoomNumber;
    }

    //creating a method to add students
    public void addStudent(String studentName){
        if(students.size() == maxStudents){
            System.out.println("Course is full - can't add " + studentName);
            System.out.println("The maximum number of students is " + maxStudents);
        }
        else {
            students.add(studentName);
        }
    }

    //creating a method to print all the course info
    void writeCourseInfo(){
        System.out.println("Course Name; " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Students enrolled;");
        for (String student : students){
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this course is " + maxStudents);
    }

    //creating a method to print the course info in one line that is more organized
    void printCourseInfo(){
        System.out.println();
        System.out.print("Name: " + name + ","+ " Course Code: " + code + "," + " Max Students: " + maxStudents +"," +
                " Room Number: " + roomNumber + "," + " Enroll: ");
        int count = 0;
        //for loop to organize the students and place a . at the end of the last student
        for (String student : students){
            count = count + 1;
            if(count == students.size()){
                System.out.println(student + ".");
                break;
            }
            System.out.print(student + ", ");
        }
    }
    //getting the number of students
    int getNumberOfStudents(){
        return this.students.size();
    }

    //method to remove student
    void removeStudent(String studentName){
        if (students.contains(studentName)){
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + this.name);
        }
        else{
            System.out.println(studentName + " was not found in " + this.name);
        }
    }

    //creating a method to calculate the open spots of each course
    public int freeSpots(){
        int counter = 0;
        for(int i = 0 ; i < students.size() ; i++){
            counter = counter + 1;
        }
        return maxStudents - counter;

    }

}
