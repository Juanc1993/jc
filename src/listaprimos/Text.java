/*Crea una clase Test con un método main que:

 - Cree un objeto Primos pasándo un valor aleatorio entre 1 y 1000 como valor al constructor.
 - Llame al método getLista para recuperar la lista de primos generada.
 - Recorra el array mostrando los números primos.

Desde el método main, 
 */
package listaprimos;
public class Text {
     public static void main(String[] args) {
         Primos primos = new Primos(30);
         
         for(int a:primos.getLista()){
         
             System.out.println(a);
         }
         
    }
}
