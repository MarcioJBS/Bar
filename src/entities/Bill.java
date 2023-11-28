package entities;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	public double cover;
	public double feeding;
	public double ticket;
	public double total;
	
	public double ticket() {
		if (gender == 'f') {
			ticket = 8;
		} else {
			ticket = 10;
		}
		return ticket;
	}

	public double feeding() {
		beer = beer * 5;
		softDrink = softDrink * 3;
		barbecue = barbecue * 7;
		return feeding += beer + softDrink + barbecue;
	}

	public double cover() {
		if (feeding >= 30) {
			cover = 0;
		} else {
			cover += 4;
		}
		return cover;
	}

	public double total() {
		return total = feeding + cover + ticket;
	}

}
