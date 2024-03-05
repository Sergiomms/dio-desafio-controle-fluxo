import java.util.Scanner;

public class Contador {

  public static void main(String[] args) throws Exception {
    
    Scanner terminal = new Scanner(System.in);

    System.out.println("Digite o primeiro parâmetro:");
    int parametroUm = terminal.nextInt();

    System.out.println("Digite o segundo parâmetro:");
    int parametroDois = terminal.nextInt();

    try {

      contar(parametroUm, parametroDois);

    } catch(ParametrosInvalidosException exception) {
      System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }

    terminal.close();

  }

  public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    if(parametroDois < parametroUm) {
      throw new ParametrosInvalidosException();
    }

    int contagem = parametroDois - parametroUm;

    for(int item = 1; item <= contagem; item++) {
      System.out.println("Imprimindo o número: " + item);
    } 
  }
}
