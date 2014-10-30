import java.awt.event.*;

public class MyKeyListener extends KeyAdapter {
	public void keyPressed(KeyEvent e) {
		if (CS.bianbie != e.getKeyCode()
				&& !CS.zhantin
				&& (e.getKeyCode() == 37 || e.getKeyCode() == 38
						|| e.getKeyCode() == 39 || e.getKeyCode() == 40)
				&& CS.anle) {
			CS.fangxiang = e.getKeyCode();
			if (e.getKeyCode() == 39) {
				CS.bianbie = 37;
			} else if (e.getKeyCode() == 38) {
				CS.bianbie = 40;
			} else if (e.getKeyCode() == 37) {
				CS.bianbie = 39;
			} else if (e.getKeyCode() == 40) {
				CS.bianbie = 38;
			} else {

			}
			CS.anle = false;
			CS.shudu = 100;
		} else if (e.getKeyCode() == 32 && !CS.WinLose) {
			CS.zhantin = !CS.zhantin;
		} else if (e.getKeyCode() == 10 && CS.WinLose) {
			for(int i =0;i<=CS.snakelong;i++){
				Gameinterface.c.remove(CS.snakes[i]);
			}
			Gameinterface.c.repaint();//Ë¢ÐÂÈÝÆ÷
			CS.foodx = 15;
			CS.foody = 15;
			CS.snakelong =5;
			CS.xe=0;
			CS.ye=29;
			CS.fangxiang = 39;
			CS.bianbie = 37;
			CS.shudu = 800;
			CS.shudu1 = 800;
			new Initial();
			CS.WinLose = false;
		}
	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == 37 || e.getKeyCode() == 38
				|| e.getKeyCode() == 39 || e.getKeyCode() == 40) {
			CS.shudu = CS.shudu1;
		}
	}
}
