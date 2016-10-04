package com.jeremy;

import java.util.ArrayList;

public class ITECCourseManager {

    public static void main(String[] args) {
        ArrayList<ITECCourse> itecArrayList = new ArrayList<ITECCourse>();
        //calling the method to set the info for Microcomputer class
        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20, null);

        //adding students to the class
        maintenanceCourse.addStudent("Jeremy");
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");

        //printing the info for the class
        maintenanceCourse.writeCourseInfo();

        //calling the method to set the info for the Data Com class
        ITECCourse datacommCourse = new ITECCourse("Data Communications", 1425, 30, null);

        //adding students to the class
        datacommCourse.addStudent("Dave");
        datacommCourse.addStudent("Ed");

        //print the info
        datacommCourse.writeCourseInfo();

        //calling the method to set the info for the Java programming class
        ITECCourse java = new ITECCourse("Java Programming", 2545, 24, null);

        //adding students
        java.addStudent("Gus");
        java.addStudent("Harry");
        java.addStudent("Lzzy");

        //print the info
        java.writeCourseInfo();

        //calling the method to set the info for the small class test
        ITECCourse smallCourse = new ITECCourse("Test small class", 1234 , 3, null);
        smallCourse.addStudent("Garry");
        smallCourse.addStudent("Roger");
        smallCourse.addStudent("Bryan");
        smallCourse.addStudent("Steve");

        //print the info
        smallCourse.writeCourseInfo();

        //calling the method to set the info for the info tech concepts class
        ITECCourse infoTechConcepts = new ITECCourse("Info Tech Concepts", 1100, 30, "T3050");

        //adding students
        infoTechConcepts.addStudent("Nancy");
        infoTechConcepts.addStudent("Orson");

        //printing the info
        infoTechConcepts.writeCourseInfo();

        //print the info for the classes to show all the info on one line and all together
        maintenanceCourse.printCourseInfo();
        datacommCourse.printCourseInfo();
        java.printCourseInfo();
        infoTechConcepts.printCourseInfo();
        System.out.println();

        //adding elements to the arraylist
        itecArrayList.add(maintenanceCourse);
        itecArrayList.add(datacommCourse);
        itecArrayList.add(java);
        itecArrayList.add(infoTechConcepts);


        //printing out the names, and open spots of each course
        for(int i = 0 ; i < itecArrayList.size() ; i++){
            System.out.println("Name: " + itecArrayList.get(i).getName() + ", " + "Open Spots: " + itecArrayList.get(i).freeSpots() + "\n");
        }
    }
}
