
package membro_static;

public class Calculadora {
    public static final double PI = 3.14;
    
    public static double calcVolume(double raio){
        return 2.0 * PI * raio;
    }
    
    public static double calcCirc(double raio){
        return 4.0 * PI * Math.pow(raio, 3) / 3;
    }
    
}
