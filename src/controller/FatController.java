package controller;

import br.com.leandrocolevati.pilhalong.*;

public class FatController {

	public FatController() {
		super();
	}

	public long fatorial(int valor) throws Exception {
		long result = 1;
		long valorpilha = 0;

		Pilha p = new Pilha();
		p.push(1);
		for (int i=1;i<=valor;i++) {
			valorpilha = p.pop();
			result = i * valorpilha;
			p.push(result);
		}
			
		return result;
	}
}
