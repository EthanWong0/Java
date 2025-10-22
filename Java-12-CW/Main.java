class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
  System.out.println(collegeCredit("MKUFCE1"));
  System.out.println(collegeCredit("MKUFC1"));

  System.out.println(getCounselor("1D0"));
  System.out.println(getCounselor("D10"));
  System.out.println(getCounselor("1F0"));
  System.out.println(getCounselor("1C0"));
  System.out.println(getCounselor("1G0"));
  System.out.println(getCounselor("X10"));
 
  System.out.println(imageType("firstQuarter.png"));
  System.out.println(imageType("documentX.pdf"));
  System.out.println(imageType("pic1.JPEG"));
  System.out.println(imageType("pic2.jpg"));
  System.out.println(imageType("ironman.gif"));

    
  }
  
/*
Problem 1:
Write a function collegeCredit() that accepts a course code and if a course gets college credit return true otherwise return false. If the 6th letter of the course code is "E" or "M" then it is a college credit course.
*/
 boolean collegeCredit(String courseCode){
  if(courseCode.substring(5).equals("M") || courseCode.substring(5).equals ("E"))
   return true;
  else return false;
 }


/*
Problem 2:
Write a function getCounselor() that accepts a student's official class code and returns their guidance counselor based on the either the first or the middle character of the official class code being:
B-Berrouet
C-Chu
D-Dinn
E-Eyzengart
F-Flores
G-Gibson
*/
 String getCounselor(String classCode){
  if(classCode.substring(0,1).equals("B") || classCode.substring(1,2).equals("B")){
    return "Berrouet";
  }else if(classCode.substring(0,1).equals("C") || classCode.substring(1,2).equals("C")){
   return "Chu";
  }else if(classCode.substring(0,1).equals("D") || classCode.substring(1,2).equals("D")){
   return "Dinn";
  }else if(classCode.substring(0,1).equals("E") || classCode.substring(1,2).equals("E")){
   return "Eyzengart";
  }else if(classCode.substring(0,1).equals("F") || classCode.substring(1,2).equals("F")){
   return "Flores";
  }else if(classCode.substring(0,1).equals("G") || classCode.substring(1,2).equals("G")){
   return "Gibson";
  }else return "N/A";
  }
/*  
Problem 3:
Write a function imageType() that accepts an image filename and returns the image type based on the file extension.

JPEG or JPG - Joint Photographic Experts Group
PNG - Portable Network Graphics
GIF - Graphics Interchange Format
PDF - Portable Document Format(not an image type)
*/ 
 String imageType(String fileName){
  int pos = fileName.indexOf(".");
  if(fileName.substring(pos+1).equalsIgnoreCase("jpeg") || fileName.substring(pos+1).equalsIgnoreCase("jpg")){
    return "Joint Photographic Experts Group";
  }else if(fileName.substring(pos+1).equalsIgnoreCase("png")){
    return "Portable Network Graphics";
  }else if(fileName.substring(pos+1).equalsIgnoreCase("gif")){
   return "Graphics Interchange Format";
  }else if(fileName.substring(pos+1).equalsIgnoreCase("jpeg")){
   return "Portable Document Format";
  }else return "N/A";
 }
}