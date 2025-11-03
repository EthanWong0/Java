class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
  System.out.println(swapCharacter("Hungry", "u", "e"));
  System.out.println(encryption2("Meow"));
  System.out.println(encryption3("Blargh"));
  }

  // reverse function for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);

    return bld;
  }

  /*
  Problem 1:
  Write a function swapCharacter() that accepts a string to modify, a string(one character) to find, and a string(one character) to replace. The function returns a string with the 'find' strings replaced by the 'replace' string.
  Example: swapCharacter("the seen","e","%")  ==> "th% s%%n"
  */
  String swapCharacter(String s, String f, String r){
    String build = "";
    for(int x = 0; x <= s.length()-1; x ++){
      if(s.substring(x,x+1).equals(f))
       build += r;
      else
       build += s.substring(x,x+1);
    }
   return build;
  }

  /*
  Problem 2:
  Write a function encryption2() that accepts a string and returns the string where the orginal string is split in half and each letter from each half is used to create a new string.
  Example:
  encryption2("abcdefgh") ==> "aebfcgdh"
    process:  "abcdefgh" -> "abcd" "efgh"  -> "aebfcgdh"

  encryption2("abcdefghi")==> "aebfcgdhi"
   process:  "abcdefghi" -> "abcd" "efghi"  -> "aebfcgdhi"
  */
  String encryption2(String s){
   String build = "";
   String half1 = s.substring(0,s.length()/2);
   String half2 = s.substring(s.length()/2);
   
   for(int i = 0; i <= half1.length()-1; i++)
    build += half1.substring(i,i+1) + half2.substring(i,i+1);
   
   if(s.length()%2 == 1)
    build += half2.substring(half2.length()-1);
   return build;
  }
  
  /*
  Problem 3:
  Write a function encryption3() that accepts a string and returns the string that rearranges the characters of the original string in the order: 1st,last,2nd,last-1,3rd,last-2,...   and so on.
  Example:
  encryption3("abcdef")==> "afbecd"
  encryption3("abcde")==> "aebdc"
  */
  String encryption3(String s){
    String build = "";
    String half1 = s.substring(0, s.length()/2);
    String half2 = s.substring(s.length()/2);
    String reverseS = reverse(half2);

    for(int i = 0; i <= half1.length()-1; i++)
     build += half1.substring(i, i+1) + reverseS.substring(i, i+1);
    if(s.length()%2 == 1)
     build += reverseS.substring(reverseS.length()-1);

  return build;
}
}