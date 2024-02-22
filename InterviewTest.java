/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyengiaithuat;

/**
 *
 * @author nkhai
 */
public class InterviewTest {
    public static void main(String[] args) {
        String input = "hfdawhwhcoomdd";
        int count = countVietnameseCharacters(input);
        System.out.println("Number of Vietnamese characters: " + count);
    }

    private static int countVietnameseCharacters(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            String d;
            if(i != input.length()-1){ 
                d =""+c+input.charAt(i+1);  
                
            }else
                d ="";
            System.out.println("c :" + c);
            System.out.println("d :" + d);
            if (c == 'w') {
                count++;      
            }
            if("aw".equals(d) || "aa".equals(d) || "dd".equals(d) || "ee".equals(d) || "oo".equals(d) || "ow".equals(d)){ 
                count ++;
            }
        }
        return count;
    }
    
}
