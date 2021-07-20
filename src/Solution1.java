import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Register {
    
    private static Register register = null;
    /*
     * Complete the 'getTotalBill' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts MAP itemDetails as parameter.
     */
     public static Register getInstance(){
    	 if (register == null) 
    		 register = new Register(); 
   
         return register; 
     }

    public String getTotalBill(Map<String,Integer> itemDetails) {
        System.out.println("------------s");
        double total1=0;
        Map<String,Double> items = new HashMap<String,Double>();
        items.put("apple",2.0);
        items.put("orange",1.5);
        items.put("mango",1.2);
        items.put("grape",1.0);
        
        for (Map.Entry<String,Integer> entry : itemDetails.entrySet())  { 
            double itemValue=items.get(entry.getKey());
            total1+=itemValue*entry.getValue();   
        }   
        return Double.toString(total1) ;

    }

}

class Solution1 {
    public static void main(String[] args) throws IOException {
        
        Scanner readInput = new Scanner(System.in);        
        String[] input=readInput.nextLine().split(" ");                
        Map<String,Integer> myItems=new HashMap<String,Integer>();
        for(int i=0;i<input.length;i+=2){
          myItems.put(input[i],Integer.parseInt(input[i+1]));	
        }
        for (Map.Entry<String,Integer> entry : myItems.entrySet())  {
            System.out.println("Key = " + entry.getKey() + 
                          ", Value = " + entry.getValue()); }
        Register regObj = Register.getInstance(); 
        System.out.println(regObj.getTotalBill(myItems));
          readInput.close();
    }
    //apple 30 orange 10 mango 20
}