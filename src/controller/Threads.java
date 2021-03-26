package controller;

public class Threads extends Thread {

	private int idTransa;
	private int tipo;
	private int codConta;
	private int saldo;
	private int valorTransa;

	public Threads(int idTransa) {
		this.idTransa = idTransa;
	}

	public void run() {
		
		transacao();
		
	}

	private void transacao() {
		// TODO Auto-generated method stub
		tipo = (int)((Math.random() * 2) + 1);
		codConta = (int)((Math.random() * 501) + 1);
		saldo = (int)((Math.random() * 381) + 580);
		valorTransa = (int)((Math.random() * 156) + 415);
		if(tipo == 1) {
			saldo = saldo - valorTransa;
			System.out.println("#" + idTransa + " " + codConta + " terminou de sacar o saldo agora é " + saldo);
		}else {
			saldo = saldo + valorTransa;
			System.out.println("#" + idTransa + " " + codConta + " terminou de sacar o deposito agora é " + saldo);
		}
		
	}

}
