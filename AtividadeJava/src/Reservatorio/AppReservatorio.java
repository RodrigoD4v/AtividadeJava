package Reservatorio;

public class AppReservatorio {
	
	public static void main(String[] args) {
		
		
		Reservatorio reservatorio = new Reservatorio(1,"Recife",10000000,10000000, "maximo");
		System.out.println("\no id do reservatorio �: "+reservatorio.getId());
		System.out.println("A cidade local do reservatorio �: "+reservatorio.getCidade());
		System.out.printf("A capacidade maxima do reservatorio �: %.2f\n",reservatorio.getCapacidadeMaxima());
		System.out.printf("A capacidade atual do reservatorio �: %.2f\n",reservatorio.getCapacidadeAtual());
		System.out.printf("A situa��o atual do reservatorio �: %s",reservatorio.getSituacao());
		System.out.println("\n===================================================================================");
		
		System.out.println("houve uma vaz�o de nivel 1 pro 60 minutos");
		reservatorio.sangrar("1",60);
		System.out.println("o id do reservatorio �: "+reservatorio.getId());
		System.out.printf("A capacidade atual do reservatorio �: %.2f\n",reservatorio.getCapacidadeAtual());
		System.out.printf("A situa��o atual do reservatorio �: %s",reservatorio.getSituacao());
		System.out.println("\n===================================================================================");
		
		System.out.println("hoube uma vaz�o de nivel 2 por 30 minutos");
		reservatorio.sangrar("2",30);
		System.out.println("o id do reservatorio �: "+reservatorio.getId());
		System.out.printf("A capacidade atual do reservatorio �: %.2f\n",reservatorio.getCapacidadeAtual());
		System.out.printf("A situa��o atual do reservatorio �: %s",reservatorio.getSituacao());
		System.out.println("\n===================================================================================");
		
		System.out.println("houve um abastecimento");
		System.out.println("ocorreu um abasteicomentode: " + reservatorio.abastecer(50000));
		System.out.printf("A capacidade atual do reservatorio �: %.2f\n",reservatorio.getCapacidadeAtual());
		System.out.printf("A situa��o atual do reservatorio �: %s",reservatorio.getSituacao());
		System.out.println("\n===================================================================================");
	}

}
