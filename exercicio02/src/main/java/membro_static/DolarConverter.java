
package membro_static;


public class DolarConverter {
    public static final double IOF = 0.06;
    
    public static double calcConvert(double priceReal, double qtdDolar){
        double total = qtdDolar * priceReal;
        return total * (IOF + 1);
        
    }
}
