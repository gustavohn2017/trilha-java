// Criar um exemplo de uma classe para representar uma SmartTV onde:
// 1 - Ela tenha caracteristicas : Ligada (boolean), Canal (int) e Volume (int)
// 2 - Nossa TV poderá ligar e desligar e assim mudar o estado Ligada
// 3 - Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
// 4 - Nossa TV poderá mudar de canal de 1 em 1 ou definindo o numero correspondente
// IMPORTS 
import java.util.Scanner;

public class SmartTV {
   
        Scanner sc = new Scanner(System.in);

        boolean Ligada = true;
        int Volume = 3;
        int Canal = 1;

        public void ligar(){
            Ligada=true;
        }
        public void desligar(){
            Ligada=false;
        }

        public void Aumentar(){
            Volume++;
        }
        public void Diminuir(){
            Volume--;
        }

        public void mudarCanal(){
            Canal = sc.nextInt();
        }
        public void aumentarCanal(){
            Canal++;
        }
        public void diminuirCanal(){
            Canal --;
        }




    }
