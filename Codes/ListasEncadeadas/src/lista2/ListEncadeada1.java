package lista2;

public class ListEncadeada1 {
		public static void main(String[] args) {
			No lista = new No();
			lista.dado = 1;
			lista.prox = null;
			
			No novo = new No();
			novo.dado = 2;
			novo.prox = null;
			lista.prox = novo;
			System.out.println("lista: " + lista);
			System.out.println("\t dado: " +lista.dado + "\t prox:" + lista.prox);
			System.out.println("lista: " + lista);
			System.out.println("\t dado: " +lista.dado + "\t prox:" + lista.prox);
			
		}
}
