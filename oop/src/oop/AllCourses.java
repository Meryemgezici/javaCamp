package oop;

public class AllCourses {
     String courseName;
     String information;
     int percentageOfCompletion;
     
     public AllCourses() {
    	this.courseName=" ";  
  		this.information=" ";
  		this.percentageOfCompletion=0;
     }
     
     public AllCourses(String courseName,String information,int percentageOfCompletion) {
        this.courseName=courseName;  
 		this.information=information;
 		this.percentageOfCompletion=percentageOfCompletion;
 		
      }
}
