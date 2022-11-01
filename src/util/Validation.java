
package util;

import java.util.regex.Pattern;


public class Validation {
   
   public boolean StringIsEmpty(String s){
   if(null==s){
       return true;
   }
   else if("".equals(s)){
       return true;
   }
   
   else{
       return false;
   }
   }
   
   
  public  boolean stringAreAllNumber(String s){

        String pattern="^[0-9]*$";
        return Pattern.matches(pattern, s);

    }

    public  boolean stringAreAllLetter(String s){
        String pattern = "^[A-Za-z]+$";
        return Pattern.matches(pattern, s);

    }

    public boolean stringAreAllLetterAndNumber(String s){
        String pattern = "^[A-Za-z0-9]+$";
        return Pattern.matches(pattern, s);
    }


    public boolean checkIsDate(String s){
        String pattern = "^\\d{1,2}-\\d{1,2}-\\d{4}";
        return Pattern.matches(pattern, s);
    }
    
    
    public boolean check12month(String s){
        String pattern = "^(0?[1-9]|1[0-2])$";
        return Pattern.matches(pattern, s);
    }
    
    public boolean check31day(String s){
        String pattern = "^((0?[1-9])|((1|2)[0-9])|30|31)$";
        return Pattern.matches(pattern, s);
    }
    
    
    
     public boolean checkHttp(String s){
        String pattern = "[a-zA-z]+://[^\\s]*";
        return Pattern.matches(pattern, s);
    }
            
            
    
    
}
