package Observes;

import java.util.ArrayList;

public class ContaJuridica implements Conta {

	private String nome;
	private double salario;
	private long cpf;

	@Override
	public void addValor(double valor) {
		this.salario=valor;
		System.out.print("VALOR MODIFICADO");
	}

}
