
public class Encrypter{
    static String encryptMessage(String name) throws InvalidMessageException{
        boolean result=Validator.validate(name);

        if(result){
            //System.out.println(name);
             StringBuilder input1 = new StringBuilder();
             input1.append(name);
             input1.reverse().toString(); 
             
            StringBuffer newStr=new StringBuffer(input1);    
            
        for(int i = 0; i < input1.length(); i++) {    
                 
            if(Character.isUpperCase(input1.charAt(i))) {    
                //Convert it into upper case using toLowerCase() function    
                newStr.setCharAt(i, Character.toLowerCase(input1.charAt(i)));    
            }    
            
        }       
        return newStr.toString();     
        }else{
        	
            throw new InvalidMessageException();
        }
    }
    
}
