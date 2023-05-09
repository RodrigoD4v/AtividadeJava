package Exame;

import java.util.Scanner;

public class AppExame {

	static Exame exames[] = new Exame[4];
	static Scanner input = new Scanner(System.in);
	static int contExames = 0; 
	
	public static void main(String[] args) {
		
		int opcao = 0;
		
		do {
			System.out.println("\n*** Seletor de Opções ***");
			System.out.println();
			System.out.println("1 - Cadastrar Exame");
			System.out.println("2 - Consultar Exame");
			System.out.println("3 - Alterar Exame");
			System.out.println("4 - Excluir Exame");
			System.out.println("5 - Listar Exame");
			System.out.println("0 - Finalizar");
			
			System.out.print("\nOpção: ");
			opcao = input.nextInt();
			
			switch (opcao) {
			case 1:
				cadastraExame();
				break;
			case 2:
				consultaExame();
				break;
			case 3:
				alteraExame();
				break;
			case 4:
				excluiExame();
				break;
			case 5:
				listaExames();
				break;
			case 0:
				System.out.println("\n--- PROGRAMA FINALIZADO");
				break;
			default:
				System.out.println("\nOpção incorreta");
				
			}
			
		} while (opcao !=0);
		input.close();
	
	}
	
	public static int pesquisaExamePorCodigo(int idExame) {
		for (int i = 0; i < exames.length; i++) {
			if (exames[i] != null && idExame == exames[i].getIdExame()) {
				return i;
			}
		}
		return -1;
	}
	
	public static void cadastraExame() {
		System.out.println("\n*** Cadastro do Exame ***\n");
		
		if (contExames == exames.length) {
			System.out.println("Vetor cheio");
			return;
		}
		
		System.out.printf("\nCódigo do exame: ");
		int idExame = input.nextInt();
		if (pesquisaExamePorCodigo(idExame) != -1) {
			System.out.println("\n-- Código já cadastrado --\n");
			return;
		}	
		input.nextLine();
		System.out.printf("\nNome do Paciente: ");
		String nomePaciente = input.nextLine();
		System.out.printf("\nNivel de glicose do exame: ");
		int nivelGlicose = input.nextInt();
		
		

		for (int i = 0; i < exames.length; i++) {
			if (exames[i] == null) {
				exames[i]= new Exame(idExame, nomePaciente, nivelGlicose);
				contExames++;
				System.out.println("\n-- Cadastro efetuado --\n");
				return;
			}
		}
		System.out.println("Não tem mais posição vazia para cadastro");		
	}
	
	public static void consultaExame() {
		System.out.println("\n*** Consulta de Exame ***\n");
		if (contExames ==0) {
			System.out.println("Vetor vazio");
			return;
		}
		
		System.out.printf("\nCódigo do exame: ");
		int idExame = input.nextInt();
		
		int posicaoEncontrada = pesquisaExamePorCodigo(idExame);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}			
		
		System.out.printf("\nCódigo...............: %d\n", exames[posicaoEncontrada].getIdExame());
		System.out.printf("nome do paciente....: %s\n", exames[posicaoEncontrada].getNomePaciente());
		System.out.printf("Nivel de glicose: %d\n", exames[posicaoEncontrada].getNivelGlicose());				
		System.out.printf("estado do paciente.....: %s\n", exames[posicaoEncontrada].obterDiagnostico());
	}
	
	public static void alteraExame() {
		System.out.println("\n*** Alteração do Exame ***\n");
		if (contExames ==0) {
			System.out.println("Vetor vazio");
			return;
		}
		System.out.printf("\nCódigo do exame: ");
		int idExame = input.nextInt();
		
		int posicaoEncontrada = pesquisaExamePorCodigo(idExame);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}
		
		System.out.printf("\nCódigo...............: %d\n", exames[posicaoEncontrada].getIdExame());
		System.out.printf("nome do paciente....: %s\n", exames[posicaoEncontrada].getNomePaciente());
		System.out.printf("Nivel de glicose: %d\n", exames[posicaoEncontrada].getNivelGlicose());				
		System.out.printf("estado do paciente.....: %s\n", exames[posicaoEncontrada].obterDiagnostico());
	
		System.out.println("\nNovo nome: ");
		String novoNome = input.next();
		exames[posicaoEncontrada].setNomePaciente(novoNome);
		input.nextLine();
		
		System.out.println("\nNovo nivel de glicose: ");
		int novoNivelGlicose = input.nextInt();
		exames[posicaoEncontrada].setNivelGlicose(novoNivelGlicose);
		System.out.println("Nome do paciente alterado");
		System.out.println("Nivel de glicose do paciente alterado");
	}
	
	public static void excluiExame() {
		System.out.println("\n*** Exclusão de Exame ***\n");
		if (contExames ==0) {
			System.out.println("Vetor vazio");
			return;
		}
		
		System.out.printf("\nCódigo do exame: ");
		int idExame = input.nextInt();
		
		int posicaoEncontrada = pesquisaExamePorCodigo(idExame);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n-- Código não cadastrado --\n");
			return;
		}			
		
		System.out.printf("\nCódigo...............: %d\n", exames[posicaoEncontrada].getIdExame());
		System.out.printf("nome do paciente....: %s\n", exames[posicaoEncontrada].getNomePaciente());
		System.out.printf("Nivel de glicose: %d\n", exames[posicaoEncontrada].getNivelGlicose());				
		System.out.printf("estado do paciente.....: %s\n", exames[posicaoEncontrada].obterDiagnostico());				
		
		char confirma;
		do {
			System.out.printf("\nConfirma exclusão [S/N]: ");
			input.nextLine();
			confirma = input.nextLine().charAt(0);
			confirma = Character.toUpperCase(confirma);
			if(confirma!='S' && confirma!='N') {
				continue;
			}
			break;
		} while (true);
		if (confirma=='S') {
		
			if(posicaoEncontrada == exames.length-1) {
				exames[posicaoEncontrada] = null;
				System.out.println("-- Exclusão efetuada");	
				contExames--;
				return;
			}
			for(int i=posicaoEncontrada; i<exames.length-1;i++) {
				exames[i] = exames[i + 1];	
			}
			exames[exames.length-1]=null;
			System.out.println("-- Exclusão efetuada");	
			contExames--;
		}
		else {
			System.out.println("-- Exclusão cancelada");
		}		
	}
	
	public static void listaExames() {
		System.out.println("\n*** Listagem de Exames ***\n");
		
		if (contExames ==0) {
			System.out.println("Vetor vazio");
			return;
		}
		
		System.out.println("----------------------------------------------------");;
		System.out.println("Codigo | nome     |     glicose | Diagnostico       ");
		System.out.println("----------------------------------------------------");

		for (int i = 0; i < exames.length; i++) {
			if (exames[i] != null) {
				System.out.printf("%-6d %7s %12d %17s\n", 
				  		  exames[i].getIdExame(),
						  exames[i].getNomePaciente(),
						  exames[i].getNivelGlicose(),
						  exames[i].obterDiagnostico());				
			}
			else {
				System.out.println("----------------------------------------------------");
				System.out.printf("%dº Elemento nulo\n", i);
				System.out.println("----------------------------------------------------");
			}
		}
		System.out.println("----------------------------------------------------");
	}
}