package oop;
/*�zellik nesnesi: T�m kurslar�m ve E�itmenler class*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // System.out.println("hello");
      AllCourses allCourse1=new AllCourses("Java","2 ay surecek.",37);
      AllCourses allCourse2=new AllCourses("C#","1 ay surecek.",10);
      AllCourses allCourse3=new AllCourses("C","3 ay surecek.",40);
      AllCourses[] allCourses= {allCourse1,allCourse2, allCourse3};
      
      for( AllCourses allCourse:allCourses ) {
    	  System.out.println(allCourse.courseName+"     "+allCourse.information+"     "+allCourse.percentageOfCompletion+"\n");
      }
      
      Instructors instructor1=new Instructors("ENG�N DEM�ROG :)");
      Instructors instructor2=new Instructors("ENG�N");
      Instructors instructor3=new Instructors("DEM�ROG");
      Instructors[]  instructors= {instructor1,instructor2,instructor3};
      
      for(Instructors instructor:instructors ) {
    	  System.out.println(instructor.name);
      }
      
	}

}
