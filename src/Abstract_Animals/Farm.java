package Abstract_Animals;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Animal s = new Sheep();
		Animal p =new Pig();
		Animal d = new Donkey();
		Animal c = new Chicken();
		farm.add(s); farm.add(p); farm.add(d); farm.add(c);
		for(Animal a : farm) {
			a.makeNoise(); a.showColor();
		}
	}
}
