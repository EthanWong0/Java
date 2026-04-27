
import java.io.IOException;
import java.sql.*;
// To Compile on the Replit shell use: (same as for mac)
// javac -cp sqlite-jdbc-3.23.1.jar: Main.java

// To compile in Windows use:
// javac -cp sqlite-jdbc-3.23.1.jar

// To execute(run) use:
// java -cp sqlite-jdbc-3.23.1.jar: Main
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {
    // Use the students database. To minimize errors, first use a SELECT statement to make sure you are starting out with the correct records.
    String sql = "";
    String queryResult = "";
    // setup appropriate DB object to students.db
    Database db = new Database("jdbc:sqlite:students.db");
    
    // Challenge 1:
    // For student with ID of STUDENT1001, change room to 122 for period 3 class.
    sql = "UPDATE cr101" + "SET room = 122" + "WHERE StudentID = 'STUDENT1001' AND period = 3";
    db.runSQL(sql);
    
    // Challenge 2:
    // Remove course “ZQCTEDA” for student with id STUDENT1200 
    sql = "DELETE FROM cr101" + "WHERE studentID = 'STUDENT1200' AND course = 'ZQCTEDA'";
    db.runSQL(sql);
    
    // Challenge 3:
    // Change the room number of teacher1 DOYLE for periods 4 and 5 to room 213.
    sql = "UPDATE cr101" + "SET teacher1 = 'DOYLE'" + "WHERE (period = 4 or period = 5) AND room = 213";
    db.runSQL(sql);
    // Challenge 4:
    // Mr. ROFFLER will be replacing Mr. ARCHETTI for course “MQF44QGF” section 1. Update all records to reflect this change.
    sql = "UPDATE cr101" + "SET teacher 1 = 'ROFFLER'" + "WHERE course = 'MQF44QGF' AND WHERE teacher1 = 'ARCHETTI' AND section = 1";
    db.runSQL(sql);

    // Challenge 5:
    // Change the grade for STUDENT999 to 11 and the students offcclass to a junior status.
    sql = "UPDATE cr101" + "SET grade = 11" + "WHERE StudentID = 'STUDENT999'";
    db.runSQL(sql);

    // Challenge 6:
    // Add a course MKUFTC6 with a section 1. CASTRO R will be teaching this course period 9 in room 322 for student1231.

    sql = "INSERT INTO cr101 (course,section,teacher1,period,room,StudentID)" + "VALUES('MKUFTC6',1,'CASTRO R',9,322,'STUDENT1231')";
    db.runSQL(sql);
  }    
}