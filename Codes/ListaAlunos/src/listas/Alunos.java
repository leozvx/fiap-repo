package listas;

import entidades.Aluno;

public class Alunos {

	private class NO {
		Aluno dado;
		NO prox;
	}

	private NO lista = null;

	public void insere(Aluno elem) {
		NO novo = new NO();
		novo.dado = elem;
		if (lista == null) {
			novo.prox = null;
			lista = novo;
		} else {
			if (novo.dado.getRm() < lista.dado.getRm()) {
				// o novo nó vai se tornar o 1o da lista
				novo.prox = lista;
				lista = novo;
			} else {
				// o novo nó será inserido em posições intermediárias da lista ou no final
				NO aux = lista;
				boolean achou = false;
				while (aux.prox != null && !achou) {
					if (aux.prox.dado.getRm() < novo.dado.getRm())
						aux = aux.prox;
					else
						achou = true;
				}
				novo.prox = aux.prox;
				aux.prox = novo;
			}
		}
	}

	public boolean remove(int rm) {
		boolean achou = false;
		if (lista.dado.getRm() == rm) {
			achou = true;
			lista = lista.prox;
		} else {
			NO aux = lista;
			while (aux.prox != null && !achou) {
				if (aux.prox.dado.getRm() != rm)
					aux = aux.prox;
				else {
					achou = true;
					aux.prox = aux.prox.prox;
				}
			}
		}
		return achou;
	}

	public void apresenta() {
		NO aux = lista;
		System.out.println("\n\n ******  Lista *****");
		while (aux != null) {
			System.out.println("\t " + aux.dado);
			aux = aux.prox;
		}
	}
	
}
