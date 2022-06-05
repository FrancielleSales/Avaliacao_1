/*
 * @author Francielle Eliete Sales
 */

package validacaoBonificacoes;

import java.util.Scanner;

public class ValidacaoBonificacoes {
	public static void main(String[] args) {
		
        //Inicialização do scanner
        Scanner scanner = new Scanner(System.in);
        
      //-------------------------------------------------------------------------------------------------------------------------
        //Mostra o nome do programinha
        System.out.println("Calculadora de bonificações, descontos e salários líquidos\n");
        
		//Recebe a quantidade de funcionários
        System.out.println("Digite a quantidade de funcionários: ");
        int quantidadeFuncionarios = scanner.nextInt();
        
        //Recebe os nomes dos funcionários
        System.out.println("\nDigite o nome dos funcionários: ");
        String [] nomesFuncionarios = new String [quantidadeFuncionarios];
        
	    for (int i = 0; i < nomesFuncionarios.length; i++) {
    	   System.out.println("Digite o nome do " + (i + 1) + "° funcionário:");
    	   nomesFuncionarios[i] = scanner.next();
	    }

	    //Recebe os salários dos funcionários
       System.out.println("\nDigite o salário dos funcionários: ");
       float [] salariosFuncionarios = new float [quantidadeFuncionarios];
           
   		for (int i = 0; i < salariosFuncionarios.length; i++) {
       	   System.out.println("Digite o salario do(a) " + nomesFuncionarios[i] + ":");
       	   salariosFuncionarios[i] = scanner.nextFloat();
   		}
   		scanner.close();
   		
   		//Recebe o salário com bonificação ou desconto:
   		float [] salariosFuncionariosLiquido = new float [quantidadeFuncionarios];
   		
   		//Recebe a bonificação ou desconto:
   		float [] bonificacaoOuDesconto = new float [quantidadeFuncionarios]; 		
   		
   	//-------------------------------------------------------------------------------------------------------------------------
		
   		//Calcula as bonificações
   		for (int i = 0; i < salariosFuncionarios.length; i++) {
   			if (salariosFuncionarios[i] <= 1000) {
   				salariosFuncionariosLiquido[i] =  (float) (salariosFuncionarios[i] * 1.20);
   				bonificacaoOuDesconto[i] = (float) (salariosFuncionarios[i] * 0.20);
   			}else if (salariosFuncionarios[i] > 1000 && salariosFuncionarios[i] <= 2000) {
   				salariosFuncionariosLiquido[i] = (float) (salariosFuncionarios[i] * 1.10);
   				bonificacaoOuDesconto[i] = (float) (salariosFuncionarios[i] * 0.10);
   			}else {
   				salariosFuncionariosLiquido[i] = (float) (salariosFuncionarios[i] * 0.90);
   				bonificacaoOuDesconto[i] = (float) (salariosFuncionarios[i] * 0.10);
   			}
   		}
   	
   	//-------------------------------------------------------------------------------------------------------------------------	
   		
   		//Mostra os nomes, salários, bônus ou desconto e salário com bônus ou desconto
   		for (int i = 0; i < salariosFuncionarios.length; i++) {
   			if (salariosFuncionarios[i] <= 2000) {
	   			System.out.println("\nFuncionário " + nomesFuncionarios[i]);
	        	System.out.println("Salário: " + salariosFuncionarios[i]);
	   			System.out.println("Bonificação: " + bonificacaoOuDesconto[i]);
	        	System.out.println("Salário líquido: " + salariosFuncionariosLiquido[i]);
   			}else {
   		   			System.out.println("\nFuncionário " + nomesFuncionarios[i]);
   		        	System.out.println("Salário: " + salariosFuncionarios[i]);
   		   			System.out.println("Desconto: " + bonificacaoOuDesconto[i]);
   		        	System.out.println("Salário líquido: " + salariosFuncionariosLiquido[i]);
   			}
   		}
   		
	}
}