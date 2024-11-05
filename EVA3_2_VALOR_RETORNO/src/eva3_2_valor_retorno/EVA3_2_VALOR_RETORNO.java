/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_valor_retorno;

/**
 *
 * @author EdiX
 */
public class EVA3_2_VALOR_RETORNO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Res;
        Res = sumarNumeros(100, 200);
        System.out.println(Res);
        System.out.println("R = "+sumarNumeros(100, 200));
        
        sumarNumeros(100, 200);
    }
    
    public static int sumarNumeros(int Num1, int Num2){
        return Num1 + Num2;
    }
    
}
