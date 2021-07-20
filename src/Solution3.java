import java.util.Scanner;
class Parent{
    public static int startElement;
    public static int endElement;

public String filter(){
    return null;
}
}
class Child1 extends Parent{
    public String filter(){
        int i, j, flag;
        String result="";
        for (i = Parent.startElement; i <= Parent.endElement; i++) {
 
            // Skip 0 and 1 as they are
            // niether prime nor composite
            if (i == 1 || i == 0)
                continue;
 
            // flag variable to tell
            // if i is prime or not
            flag = 1;
 
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
 
            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            
            if (flag == 1){
                result+=String.valueOf(i)+" ";
            }
                
        }
        return result;
    }
    
}

class Child2 extends Parent{
    public String filter(){
        String result="";
        for(int i=Parent.startElement;i<=Parent.endElement;i++)
       {
        int num=i,sum=0,rem;
         while(sum!=1 && sum!=4)
           {
          sum=0;
          while(num!=0)
          {
              rem=num%10;
              sum+=(rem*rem);
              num/=10;
          }
          num=sum;
          }
      if(sum==1){
           result+=String.valueOf(i)+" ";
      }
       }
       return result;
        
    }
    
}


public class Solution3 {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner(System.in); 
        Parent.startElement=input.nextInt();
        System.out.println();
        Parent.endElement=input.nextInt();
        System.out.println();
        Child1 ch1=new Child1();
        Child2 ch2=new Child2();        
    System.out.println(ch1.filter());
    System.out.println(ch2.filter());
    
    }
}