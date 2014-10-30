public class Randomfood {
	public Randomfood() {

	}

	public static void changess() {
		int x, y;
		while (true) {
			x = (int) (Math.random() * 30);
			y = (int) (Math.random() * 30);
			if (!CS.position[x][y]) {
				break;
			}
		}
		CS.foodx = x;
		CS.foody = y;
		Gameinterface.food.setBounds(x*20, y*20, 19, 19);
	}
}
