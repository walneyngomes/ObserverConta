package Observes;

import java.util.ArrayList;

public class Observador {
	ArrayList<Conta> conta=new ArrayList<Conta>();
	public Observador(Conta con){
		conta.add(con);
	}
	public void addValor(double valor){
		for(Conta c :conta){
			c.addValor(valor);
		}
	}
 
	

}
