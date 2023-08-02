package filas;

public class FilaString {

	
	public final int N = 3;
	String dados[] = new String[N];
	int ini, fim, count;

	public void Init() {
		ini = fim = count = 0;
	}

	public boolean IsEmpty() {
		if (count == 0)
			return true;
		else
			return false;
	}

	public boolean IsFull() {
		if (count == N)
			return true;
		else
			return false;
	}

	public void Enqueue(String i) {
		if (IsFull()) {
			System.out.println("Enqueue overflow");
		} else {
			dados[fim] = i;
			fim = (fim + 1) % N;
			count++;
		}
	}

	public String Dequeue() {
		if(!IsEmpty()){
		String elem = dados[ini];
		ini = (ini + 1) % N;
		count--;
		return elem;
		}
		return "";
	}

	public void Clean() {
		if (!IsEmpty()) {
			ini = 0;
			fim = 0;
			count = 0;
		}
	}

	public int Size() {
		return count;
	}

	public String first() {		
		return dados[ini];
	}
	
}
