import java.awt.*;

import javax.swing.*;

public class Graphic implements Icon{
	private boolean leibie = false;
	public Graphic(boolean a){
		this.leibie = a;
	}
	public int getIconHeight(){
		return 20;
	}
	public int getIconWidth(){
		return 20;
	}
	public void paintIcon(Component arg0,Graphics arg1,int x,int y){
		if(leibie){
			arg1.fillRect(x, y,20,20);
		}else{
			arg1.setColor(Color.RED);
			arg1.fillOval(x, y,19, 19);
		}
	}
}

class Snake extends JLabel{
	public int sx,sy;
	public Snake(Graphic gh,int ssx,int ssy){
		super(gh);
		this.sx = ssx;
		this.sy = ssy;
	}
}