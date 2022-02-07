/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author jvcki
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] v = {12,3,5,7,12,10,11,19,3,6,8,19};
        int n_maior = buscar_maior(v);
        int n_menor = buscar_menor(v);
               
        System.out.printf("O maior número está na posição: %d ", n_maior);
        System.out.printf("O menor número está na posição: %d ", n_menor);
        
    }

    private static int buscar_maior(int[] v) {
        int maior = 0;
        
        for (int i = 1; i < v.length; i++){
        if (v[i] > v[maior]){
            maior = i;
        }
        
    }
        return maior;
    }

    private static int buscar_menor(int[] v) {
        int menor = 0;
        
        for (int i = 1; i < v.length; i++){
        if (v[i] < v[menor]){
            menor = i;
        }
        
    }
        return menor;
    
}

}