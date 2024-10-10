
package desafiocontrolefluxo;

import java.util.Scanner;

public class Contador {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();
		
		try {
			
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			
                        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
                        
		}
		
	}
	
        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
                
                 if(parametroDois < parametroUm){
        	throw new ParametrosInvalidosException();
        }
		
		int contagem = parametroDois - parametroUm;
	
                
                for (int i = 0; i < contagem; i++) {
                    System.out.println("Imprimindo o numero " + i);
            }
	}

}
    
