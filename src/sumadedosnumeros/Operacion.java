
package sumadedosnumeros;

import javax.swing.JOptionPane;


public class Operacion {
        public int num1;
        public int num2;
        public int suma;
        
        public void Operacion(){
            
        }
        
        public void Operacion(int num1, int num2){
            this.num1=num1;
            this.num2=num2;
        }
        
        public void PonerNum1(int num1){
            this.num1=num1;
        }
        
        public int ObtenerNum1(){
            return num1;
        }
        
        public void PedirNum2(int num2){
            this.num2=num2;
        }
        
        public int ObtenerNum2(){
            return num2;
        }
        
        public void PedirNumeros(){
            num1=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
            num2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));
        }
        
        public void Sumar(){
            suma=num1+num2;
        }
        
        public void MostrarResultados(){
            JOptionPane.showMessageDialog(null,"El resultado de la suma es="+suma);
        }
}

