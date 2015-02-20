/*Lista de primos.

---------------------------------------------
Crea una clase llamada Primos.

Atributo:
 - listaPrimos: matriz de enteros.

Métodos:
 - generaPrimos(int num): calcula todos los números primos menores que el número 
pasado como parámetro, crea una nueva matriz para guardarlos y guarda dicha matriz
en el atributo listaPrimos.
 - constructor(int num): llama al método generaPrimos pasándole num como argumento.
 - getLista(): devuelve la matriz listaPrimos.

Nota: En el método generaPrimos, es conveniente calcular dos veces los números primos. 
Una para saber cuántos son (sin guardarlos) y así poder crear una matriz del tamaño 
adecuado. La siguiente vez ya se pueden ir guardando.


 */
package listaprimos;
public class Primos {
    int[] listaPrimos;
    public Primos(int num){
        generaPrimos(num);
    }
    public void generaPrimos(int num){
        int contar = 0;
        int contarEspacios=0;
        for(int i = 2; i < num;i++){
            boolean noPrimo = false;
            for(int j = 2; j < i; j++){
                if(i%j == 0)noPrimo = true;
            }
            if(!noPrimo)contar++;
        }
       listaPrimos= new int[contar];
        for (int i = 2; i < num; i++) {
            boolean noPrimo = false;
            for(int j = 2; j < i; j++){
                if(i%j == 0)noPrimo = true;
            }
            if(!noPrimo){
                listaPrimos[contarEspacios]= i;
                contarEspacios++;
            }
        }
        
    }
    public int[] getLista(){
        return listaPrimos;
    }
}
