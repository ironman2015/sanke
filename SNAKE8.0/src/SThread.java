import java.applet.*;
import java.awt.Frame;
import java.net.MalformedURLException;

import javax.swing.*;

public class SThread extends Thread {
	java.net.URL eatmusicURL = Frame.class.getResource("/eat.wav");
	java.net.URL overmusicURL = Frame.class.getResource("/gameover.wav");
	private AudioClip eataudioClip = Applet.newAudioClip(eatmusicURL);
	private AudioClip overaudioClip = Applet.newAudioClip(overmusicURL);
	GraphicsUpdate gu = new GraphicsUpdate();
	public void run() {
		while (true) {
			if (!CS.zhantin && !CS.WinLose) {
				if (CS.fangxiang == 39) {
					CS.snaketou[0]++;
				} else if (CS.fangxiang == 38) {
					CS.snaketou[1]--;
				} else if (CS.fangxiang == 37) {
					CS.snaketou[0]--;
				} else if (CS.fangxiang == 40) {
					CS.snaketou[1]++;
				} else {

				}

				if (CS.snaketou[0] >= 0 && CS.snaketou[1] >= 0
						&& CS.snaketou[0] < 30 && CS.snaketou[1] < 30
						&& !CS.position[CS.snaketou[0]][CS.snaketou[1]]) {
					if (CS.snaketou[0] == CS.foodx
							&& CS.snaketou[1] == CS.foody) {
						CS.snakelong++;
						CS.snakes[CS.snakelong] = new Snake(new Graphic(true),CS.snaketou[0],CS.snaketou[1]);
						CS.snakesno[CS.snakelong] = CS.snakelong;
						CS.position[CS.snaketou[0]][CS.snaketou[1]] = true;
						Gameinterface.c.add(CS.snakes[CS.snakelong]);
						
						gu.getfoodupdate();

						Randomfood.changess();

						Gameinterface.jf.setTitle("贪吃蛇    (空格键暂停)           "
								+ (CS.snakelong - 5) * 100 + "（分） "
								+ (CS.snakelong - 5) + "(个食物)");

						if (CS.shudu1 > 200)
							CS.shudu1 = CS.shudu1 - 10;
						
						try {
							eataudioClip.play();//播放效果音
						} catch (Exception e1) {
							e1.printStackTrace();
						}

					} else {
						CS.snakes[CS.snakesno[0]].setLocation(CS.snaketou[0] * 20, CS.snaketou[1] * 20);

						CS.position[CS.snaketou[0]][CS.snaketou[1]] = true;
						CS.position[CS.snakes[CS.snakesno[0]].sx][CS.snakes[CS.snakesno[0]].sy] = false;

						CS.snakes[CS.snakesno[0]].sx = CS.snaketou[0];
						CS.snakes[CS.snakesno[0]].sy = CS.snaketou[1];

						int e = CS.snakesno[0];
						for (int i = 0; i < CS.snakelong; i++) {
							CS.snakesno[i] = CS.snakesno[i + 1];
						}
						CS.snakesno[CS.snakelong] = e;

						
						/*for (int i = 0; i < CS.position.length; i++) {//打印位置信息
							for (int t = 0; t < CS.position[i].length; t++) {
								System.out.print(CS.position[t][i] ? " " : 0);
							}
							System.out.println();
						}*/
					}
					gu.update();
				} else {
					Gameinterface.jf.setTitle("贪吃蛇   " + (CS.snakelong - 5)
							* 100 + "（分） " + (CS.snakelong - 5)
							+ "(个食物)  撞墙了，你输了！   （回车键继续）");
					CS.WinLose = true;
					try {
						overaudioClip.play();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				CS.anle = true;
			}
			try {
				Thread.sleep(CS.shudu);
			} catch (InterruptedException t) {
				t.printStackTrace();
			}
		}
	}
}
