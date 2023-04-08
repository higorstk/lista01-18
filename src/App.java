import java.util.Scanner;
class Main{
public static void main(String[] args){
//Passo1:Mostrar variável
  double tamanhodoarquivo;
  double velocidadenet;
  double tempodownload;
  //Passo2:Entrada de dados
Scanner teclado = new Scanner(System.in);
  System.out.println("Informe o tamanho do arquivo para download (em MB):");
tamanhodoarquivo = teclado.nextDouble();
  System.out.println("Informe a velocidade do link de Internet (em Mbps): ");
  velocidadenet = teclado.nextDouble();
  //calculo
  tempodownload = (tamanhodoarquivo / (velocidadenet / 8)) / 60;
//Passo3:Mostrar resultado
System.out.println("O tempo aproximado de download é de: " + tempodownload + " minutos.");
 }
}
