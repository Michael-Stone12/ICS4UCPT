/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chequetest;

/**
 *
 * @author stonem7478
 */
public class ChequeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(convert(7654321));
    }
    
    final private  static String[] units = {"Zero","One","Two","Three","Four",
    "Five","Six","Seven","Eight","Nine","Ten",
    "Eleven","Twelve","Thirteen","Fourteen","Fifteen",
    "Sixteen","Seventeen","Eighteen","Nineteen"};
    
    final private static String[] tens = {"","","Twenty","Thirty","Forty","Fifty",
    "Sixty","Seventy","Eighty","Ninety"};

    public static String convert(Integer i) {
        if( i < 20)  return units[i];
        if( i < 100) return tens[i/10] + ((i % 10 > 0)? " " + convert(i % 10):"");
        if( i < 1000) return units[i/100] + " Hundred" + ((i % 100 > 0)?" and " + convert(i % 100):"");
        if( i < 1000000) return convert(i / 1000) + " Thousand" + ((i % 1000 > 0)? " " + convert(i % 1000):"") ;
        return convert(i / 1000000) + " Million" + ((i % 1000000 > 0)? " " + convert(i % 1000000):"") ;
    }
}
