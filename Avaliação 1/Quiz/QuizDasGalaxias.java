/*
 * @author Francielle Eliete Sales
 */

package quizDasGalaxias;

import java.util.Scanner;
public class QuizDasGalaxias {	    
    public static void main(String[] args) {

        //Inicialização do scanner
        Scanner scanner = new Scanner(System.in);
        
        //Separador
        String separador = "***********************************************************";
        	
        //Mostra o nome do jogo
        System.out.println(separador);
        System.out.println("*******************  Quiz das Galáxias  *******************");
        System.out.println(separador + "\n");

        //Pede e recebe o nome do usuário
        System.out.print("Bem vindo(a)! Digite o seu nome para iniciar: ");
        String nome = scanner.nextLine();
        System.out.print("Boa sorte, " + nome + "!" + "\n\n");
        System.out.println(separador + "\n");
               	
        //---------------------------------------------------------------------------------------
        
		//Variáveis para armazenar os acertos e erros do jogador
		int acertos = 0;
		int erros = 0;
        
        //Array com as perguntas do quiz
        String [] perguntasQuiz = { "Qual é o maior planeta do sistema solar?",
                                    "Qual é o satélite natural da Terra?",
        							"Em qual galáxia nós vivemos?",
        							"Qual é o maior satélite natural do sistema solar?", 
        							"Qual estrela listada abaixo tem o maior raio?"};
        
        //Array com as alternativas
        String [] alternativas = {"a. ", "b. ", "c. ", "d. "};
        
        //Arrays com as opcoes de resposta do quiz
        String [] opcoesQuizP1 = {"Urano", "Saturno", "Júpiter", "Netuno"};
        String [] opcoesQuizP2 = {"Marte", "Ganimedes", "Sol", "Lua"};
        String [] opcoesQuizP3 = {"Via Láctea", "Andrômeda", "Rodamoinho", "Sistema solar"};
        String [] opcoesQuizP4 = {"Calixto", "Ganimedes", "Sol", "Vy Majoris"};
        String [] opcoesQuizP5 = {"Vy Majoris", "Sol", "Betelgeuse", "UY Scuti"};
        
        //Array com o gabarito do quiz
        String [] gabaritoQuiz = {"c", "d", "a", "b", "d"};
        
        //Array para as entradas do(a) jogador(a)
        String [] respostasJogador = new String[5];
        	
        //---------------------------------------------------------------------------------------
        
        //Mostra o menu
        System.out.println("Digite a opção desejada: ");
        System.out.println("a. Iniciar	b. Sair");
        String opcao = scanner.nextLine();
        System.out.println(separador + "\n");

        //---------------------------------------------------------------------------------------
        
        //Funcionamento menu
        		
        switch (opcao) {
        	case "a":
                //Mostra a primeira pergunta
                System.out.println("1. " + perguntasQuiz[0]);        
                for(int i = 0; i <= 3; i++) {
                    System.out.println(alternativas[i] + opcoesQuizP1[i]);
                }

                //Pede a primeira resposta
                System.out.println("\n" + separador);
                System.out.print("\nDigite a letra correspondente a resposta correta: ");
                
                respostasJogador [0] = scanner.nextLine();
                
                //Confere se a primeira resposta está correta
                if (respostasJogador[0].equals(gabaritoQuiz[0])) {
                	System.out.println("Parabéns! Você acertou essa questão :)");
                    acertos = acertos + 1;
                }else {
                    System.out.println("Estude mais! Você errou essa questão :(");
                    erros = erros + 1;
                }
                System.out.println("\n" + separador + "\n");
                   	
	    //---------------------------------------------------------------------------------------
                   	
                //Mostra a segunda pergunta
                System.out.println("2. " + perguntasQuiz[1]);        
                for(int i = 0; i <= 3; i++) {
                    System.out.println(alternativas[i] + opcoesQuizP2[i]);
                }

                //Pede a segunda resposta
                System.out.println("\n" + separador);
                System.out.print("\nDigite a letra correspondente a resposta correta: ");
                    
                respostasJogador [1] = scanner.nextLine();
                    
                //Confere se a segunda resposta está correta
                if (respostasJogador[1].equals(gabaritoQuiz[1])) {
                	System.out.println("Parabéns! Você acertou essa questão :)");
                	acertos = acertos + 1;
                }else {
                    System.out.println("Estude mais! Você errou essa questão :(");
                    erros = erros + 1;
                }
                System.out.println("\n" + separador + "\n");
                
	    //---------------------------------------------------------------------------------------
                
                //Mostra a terceira pergunta
                System.out.println("3. " + perguntasQuiz[2]);        
                for(int i = 0; i <= 3; i++) {
                    System.out.println(alternativas[i] + opcoesQuizP3[i]);
                }

                //Pede a segunda resposta
                System.out.println("\n" + separador);
                System.out.print("\nDigite a letra correspondente a resposta correta: ");
                    
                respostasJogador [2] = scanner.nextLine();
                    
                //Confere se a segunda resposta está correta
                if (respostasJogador[2].equals(gabaritoQuiz[2])) {
                	System.out.println("Parabéns! Você acertou essa questão :)");
                	acertos = acertos + 1;
                }else {
                    System.out.println("Estude mais! Você errou essa questão :(");
                    erros = erros + 1;
                }
                    System.out.println("\n" + separador + "\n");
	    //---------------------------------------------------------------------------------------
                    
                //Mostra a quarta pergunta
                System.out.println("4. " + perguntasQuiz[3]);        
                for(int i = 0; i <= 3; i++) {
                    System.out.println(alternativas[i] + opcoesQuizP4[i]);
                }

                //Pede a segunda resposta
                System.out.println("\n" + separador);
                System.out.print("\nDigite a letra correspondente a resposta correta: ");
                        
                respostasJogador [3] = scanner.nextLine();
                        
                //Confere se a segunda resposta está correta
                if (respostasJogador[3].equals(gabaritoQuiz[3])) {
                	System.out.println("Parabéns! Você acertou essa questão :)");
                	acertos = acertos + 1;
                }else {
                    System.out.println("Estude mais! Você errou essa questão :(");
                    erros = erros + 1;
                }
                    System.out.println("\n" + separador + "\n\n");
                    
	    //---------------------------------------------------------------------------------------
                    
	            //Mostra a quinta pergunta
                System.out.println("5. " + perguntasQuiz[4]);        
                for(int i = 0; i <= 3; i++) {
                    System.out.println(alternativas[i] + opcoesQuizP5[i]);
                }

                //Pede a segunda resposta
                System.out.println("\n" + separador);
                System.out.print("\nDigite a letra correspondente a resposta correta: ");
                            
                respostasJogador [4] = scanner.nextLine();
                                           
                //Confere se a segunda resposta está correta
                if (respostasJogador[4].equals(gabaritoQuiz[4])) {
                	System.out.println("Parabéns! Você acertou essa questão :)");
                	acertos = acertos + 1;
                }else {
                	System.out.println("Estude mais! Você errou essa questão :(");
                	erros = erros + 1;
                }
                System.out.println("\n" + separador + "\n\n");

        //---------------------------------------------------------------------------------------
                
                //Mostra o resultado final do jogador
                System.out.println(nome + " seu resultado final foi: ");
                System.out.println("Acertos: " + acertos);
                System.out.println("Erros: " + erros);
                System.out.println("\n" + separador + "\n\n");
                scanner.close();
                
                break;    
                
        	case "b":
                System.out.println("Até logo!");
                break;
                
            default:
                System.out.println("Opção inválida!");
                break;
        }
        
	}
}