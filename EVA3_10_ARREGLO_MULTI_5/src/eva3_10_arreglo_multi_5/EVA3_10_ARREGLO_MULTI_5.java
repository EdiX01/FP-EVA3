/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_arreglo_multi_5;

/**
 *
 * @author EdiX
 */
public class EVA3_10_ARREGLO_MULTI_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][][][][] Quinta = new int [5][5][5][5][5];
        
        for (int i = 0; i < Quinta.length; i++) {
            for (int j = 0; j < Quinta[i].length; j++) {
                for (int k = 0; k < Quinta[i][j].length; k++) {
                    for (int l = 0; l < Quinta[i][j][k].length; l++) {
                        for (int m = 0; m < Quinta[i][j][k][l].length; m++) {
                            Quinta[i][j][k][l][m] = (int)(Math.random() * 100);
                        }
                    }
                }
            }
            
        }
        for (int i = 0; i < Quinta.length; i++) {
            for (int j = 0; j < Quinta[i].length; j++) {
                for (int k = 0; k < Quinta[i][j].length; k++) {
                    for (int l = 0; l < Quinta[i][j][k].length; l++) {
                        for (int m = 0; m < Quinta[i][j][k][l].length; m++) {
                            System.out.println(Quinta[i][j][k][l][m]);
                            
                        }
                        
                    }
                    
                }
                
            }
            
        }
    }
    
}
