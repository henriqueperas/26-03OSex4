package view;

import controller.Threads;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int idTransa = 0; idTransa < 20; idTransa++) {
			Thread tTransa = new Threads(idTransa);
			tTransa.start();
		}
	}
	
}
