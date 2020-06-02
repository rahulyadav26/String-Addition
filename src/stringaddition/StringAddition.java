/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringaddition;

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
            for(int i=0;i<str.length();i++){
                String num="";
                while(i<str.length() && Character.isDigit(str.charAt(i))){
                    num+=str.charAt(i);
                    i++;
                }
                
                if(!num.isEmpty() && Integer.parseInt(num)<=1000){
                    sum+=Integer.parseInt(num);
                }
            }
            return sum;
        }
    }
}
