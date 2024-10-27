import java.util.Scanner;

public class Contador  {
    public static void main(String[] args) {
     //Objeto criado
     Scanner scanner = new Scanner(System.in);
     
        
     System.out.println("Digite o primeiro parametro ");   
     int parametroUm = scanner.nextInt();
     
     System.out.println("Digite o segundo parametro ");   
     int parametroDois = scanner.nextInt();
     
    
    try {
        //chamando o metodo contendo a logica de contagem
        contar(parametroUm, parametroDois);

    } catch ( ParametrosInvalidosException e) {
        System.out.println("O segundo parametro deve ser maior  que o primeiro");
    } 

        
}
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
    // validar se parametroUm e maior que parametroDois
    if (parametroUm > parametroDois) {
        throw new ParametrosInvalidosException();
    }
     
    int contagem = parametroDois - parametroUm;
    //realizar o for para imprimir os numeros com base na variavel contagem

    for (int valor = 0; valor <= contagem; valor ++ ) {
        System.out.println("Contando: valor " + valor);

            }
    
        }    
    
   }
