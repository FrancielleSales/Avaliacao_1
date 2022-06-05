/*
 * @author Francielle Eliete Sales
 */

package validacaoUsuario;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class validacaoUsuario {
	public static void main(String[] args) {
		
        //Inicialização do scanner
        Scanner scanner = new Scanner(System.in);
        
        //Array com os usuários cadastrados
        String [] usuarios = {"diego", "yago", "alvaro", "carolina", "paulo", "reginaldo", "andre", "yasmin"};
        
        //Array com as senhas cadastradas
        String [] senhas = {"diego_123", "yago_123", "alvaro_123", "carolina_123", "paulo_123", "reginaldo_123", "andre_123", "yasmin_123"};
        
    //-------------------------------------------------------------------------------------------------------------------------
        
        //Recebe entrada de usuário e senha
        System.out.println("Digite seu usuário: ");
        String usuario = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();
        scanner.close();

    //-------------------------------------------------------------------------------------------------------------------------
        
        //Pega a hora e converte em int
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("H");
        String dataFormatada = formatar.format(data);       
        int intHoraAtual = Integer.parseInt(dataFormatada);
        
        //Variáveis para o teste do turno do dia
        int inicioMadrugada = 00;
        int inicioManha = 6;
        int inicioTarde = 12;
        int inicioNoite = 18;
        
    //------------------------------------------------------------------------------------------------------------------------- 
        
        //Verifição usuário e senha
        
        boolean confereUsuario = false; 
        
        for(int i =0; i < usuarios.length; i++) {
        	if(usuario.equals(usuarios[i])) {
        		confereUsuario = true;
        	}
        }
        
        boolean confereSenha = false;
        for(int i =0; i < senhas.length; i++) {
        	if(senha.equals(senhas[i])) {
        		confereSenha = true;
        	}
        }
        
        if(confereUsuario && confereSenha) {
            if(inicioMadrugada <= intHoraAtual && intHoraAtual < inicioManha) {
            	System.out.println("Boa madrugada, você se logou ao nosso sistema.");
            }else if(inicioManha <= intHoraAtual && intHoraAtual < inicioTarde){
            	System.out.println("Bom dia, você se logou ao nosso sistema.");
	        }else if(inicioTarde <= intHoraAtual && intHoraAtual < inicioNoite){
	        	System.out.println("Boa tarde, você se logou ao nosso sistema.");
	        }else {
	        	System.out.println("Boa noite, você se logou ao nosso sistema.");
	        }
        }else {
            System.out.println("Usuário e/ou senha incorretos.");
        }
	}
}