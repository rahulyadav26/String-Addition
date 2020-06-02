/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringaddition;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class StringAddition {
    public int sum(String str){
        if(str.isEmpty()){
            return 0;
        }
        else{
            int sum=0;
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<str.length();i++){
                String num="";
                boolean negative = false;
                if(Character.isDigit(str.charAt(i)) && i>0 && str.charAt(i-1)=='-'){
                    negative = true;
                    
                }
                
                while(i<str.length() && Character.isDigit(str.charAt(i))){
                    num+=str.charAt(i);
                    i++;
                }
                
                if(!num.isEmpty() && Integer.parseInt(num)<=1000 && !negative){
                    sum+=Integer.parseInt(num);
                }
                else if(!num.isEmpty() && negative){
                    list.add(Integer.parseInt(num)*-1);
                }
            }
            if(list.size()==0){
                return sum;
            }
            System.out.println("i was here");
            throw new RuntimeException("Negative numbers not allowed: " + list.toString());
        }
    }
    
}
