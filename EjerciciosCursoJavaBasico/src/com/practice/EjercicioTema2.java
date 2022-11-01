
package com.practice;


public class EjercicioTema2 {
    public static void main(String[] args) {
        double PrecioTotal = PrecioConIVA(125000);
        System.out.println("PrecioTotal = " + PrecioTotal);
        
    }
    
    static double PrecioConIVA(double PrecioSinIva){
        final double IVA = 1.16;
        double PrecioTotal = PrecioSinIva * IVA;
        return PrecioTotal;
    }
       
}
