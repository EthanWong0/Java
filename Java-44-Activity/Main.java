import java.io.IOException;
import java.sql.*;
/*
Use the chinook database to write the SQL statements to produce the info asked (using chinookDBdiagram.jpg to decide which tables contain the required info and their relationships)
*/
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {

    String sql = "";
    String result ="";     
		Database db = new Database("jdbc:sqlite:chinook.db");	

    // Problem 1:
    // For the first 30 tracks, get the name of the track and the album name that it belongs to.
    sql  = " Select tracks.name AND albums.Title from tracks ";
    sql += " Inner Join albums ";
    sql += " On albums.albumID = tracks.albumID ";
    sql += " Inner Join tracks";
    sql += " On tracks.albumID = albums.albumID ";
    sql += " Limit 30 ";
    
    result = db.runSQL(sql,"table-auto");

    // Problem 2:
    // // For every Invoice in April 2012, retrieve the customer's first name & last name, invoice id, and invoice date.  (Invoice date format: YYYY-MM-DD)


    // Problem 3:
    // For the first 20 invoices, get the customer id, invoice id, track name, unit price and quantity. (Hint: information is across 3 tables)


    // Problem 4:
    // What is the list of customer names whose merchandise is being shipped either to the USA, Germany or Poland? (Hint: use BillingCountry in invoices table). (REMOVE DUPLICATES)


    // Problem 5:
    // List the first 20 song(track) names that are “Latin” music (genre)?


    // Problem 6:
    // List all the “Jazz” album titles. 'Jazz' is a genre. (REMOVE DUPLICATES)


    // Problem 7:
    // List all the Pop Artist names. 'Pop' is a genre. (REMOVE DUPLICATES)
  
      
  }    
}