/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_arreglos_multi;

/**
 *
 * @author EdiX
 */
public class EVA3_9_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] Bille = {20, 50, 100, 200, 500, 1000};
        String[][] Ciu = {{"Aguascalientes", "Calvillo", "Jesus Maria",},
                          {"Ensenada", "Mexicali", "Tecate", "Tijuana"},
                          {"La Paz", "Cabo San Lucas", "San Jose Del Cabo"}};
        for (int i = 0; i < Ciu.length; i++) {
            for (int j = 0; j < Ciu[i].length; j++) {
                System.out.println(Ciu[i][j]);
                
            }
            
        }
    }
    
}
