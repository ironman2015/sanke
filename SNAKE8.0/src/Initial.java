import javax.swing.*;


public class Initial {
	public Initial(){
		Gameinterface.jf.setTitle("Ì°³ÔÉß    (¿Õ¸ñ¼üÔÝÍ£)");
		
		for(int i = 0;i <=CS.position.length-1;i++){
			for(int t = 0;t <= CS.position[i].length-1;t++){
				CS.position[i][t] = false;
			}
		}
		
		for (int i = 0; i < 6; i++) {
			CS.snakes[i] = new Snake(new Graphic(true),CS.xe,CS.ye);
			CS.snakesno[i] = i;
			CS.position[CS.xe][CS.ye] = true;
			CS.snakes[i].setBounds(CS.xe * 20, CS.ye * 20, 20, 19);
			CS.xe++;
			Gameinterface.c.add(CS.snakes[i]);
		}

		CS.snakewei[0] = 0;
		CS.snakewei[1] = 29;
		CS.snaketou[0] = 5;
		CS.snaketou[1] = 29;

		Gameinterface.food.setBounds(15 * 20, 15 * 20, 19, 19);
	}
}
