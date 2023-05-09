package Reservatorio;

public class AppReservatorio {
	
	public static void main(String[] args) {
		
		
		Reservatorio reservatorio = new Reservatorio(1,"Recife",10000000,10000000, "maximo");
		System.out.println("\no id do reservatorio é: "+reservatorio.getId());
		System.out.println("A cidade local do reservatorio é: "+reservatorio.getCidade());
		System.out.printf("A capacidade maxima do reservatorio é: %.2f\n",reservatorio.getCapacidadeMaxima());
		System.out.printf("A capacidade atual do reservatorio é: %.2f\n",reservatorio.getCapacidadeAtual());
		System.out.printf("A situação atual do reservatorio é: %s",reservatorio.getSituacao());
		System.out.println("\n===================================================================================");
		
		System.out.println("houve uma vazão de nivel 1 pro 60 minutos");
		reservatorio.sangrar("1",60);
		System.out.println("o id do reservatorio é: "+reservatorio.getId());
		System.out.printf("A capacidade atual do reservatorio é: %.2f\n",reservatorio.getCapacidadeAtual());
		System.out.printf("A situação atual do reservatorio é: %s",reservatorio.getSituacao());
		System.out.println("\n===================================================================================");
		
		System.out.println("hoube uma vazão de nivel 2 por 30 minutos");
		reservatorio.sangrar("2",30);
		System.out.println("o id do reservatorio é: "+reservatorio.getId());
		System.out.printf("A capacidade atual do reservatorio é: %.2f\n",reservatorio.getCapacidadeAtual());
		System.out.printf("A situação atual do reservatorio é: %s",reservatorio.getSituacao());
		System.out.println("\n===================================================================================");
		
		System.out.println("houve um abastecimento");
		System.out.println("ocorreu um abasteicomentode: " + reservatorio.abastecer(50000));
		System.out.printf("A capacidade atual do reservatorio é: %.2f\n",reservatorio.getCapacidadeAtual());
		System.out.printf("A situação atual do reservatorio é: %s",reservatorio.getSituacao());
		System.out.println("\n===================================================================================");
	}

}
