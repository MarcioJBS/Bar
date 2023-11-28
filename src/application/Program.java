package application;

import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
	
	Bill Bill = new Bill();
		
	Scanner sc = new Scanner(System.in);

	System.out.println("Sexo: ");
	Bill.gender = sc.next().charAt(0);

	System.out.println("Quantidade de cervejas: ");
    Bill.beer = sc.nextInt();
	
	System.out.println("Quantidade de refrigerantes: ");
	Bill.softDrink = sc.nextInt();
	
	System.out.println("Quantidade de espetinhos: ");
	Bill.barbecue = sc.nextInt();
	
	System.out.println("RELATÓRIO:");
	
	System.out.println("Consumo = R$" + Bill.feeding());

	System.out.println("Couvert = " + Bill.cover());
	
	System.out.println("Ingresso = R$" + Bill.ticket());
	
	System.out.println("Valor a pagar = " + Bill.total());
	
	sc.close();
	}
}
