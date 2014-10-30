
public class GraphicsUpdate {
	public void update(){
		if(CS.snakes[CS.snakesno[CS.snakelong]].sx == CS.snakes[CS.snakesno[CS.snakelong-1]].sx){
			CS.snakes[CS.snakesno[CS.snakelong]].setSize(19,20);
		}else{
			CS.snakes[CS.snakesno[CS.snakelong]].setSize(20,19);
		}
		
		if(CS.snakes[CS.snakesno[CS.snakelong]].sx != CS.snakes[CS.snakesno[CS.snakelong-2]].sx
				&& CS.snakes[CS.snakesno[CS.snakelong]].sy != CS.snakes[CS.snakesno[CS.snakelong-2]].sy){
			
			if(CS.snakes[CS.snakesno[CS.snakelong]].sx>CS.snakes[CS.snakesno[CS.snakelong-2]].sx
					&& CS.snakes[CS.snakesno[CS.snakelong]].sy<CS.snakes[CS.snakesno[CS.snakelong-2]].sy
				    && CS.snakes[CS.snakesno[CS.snakelong]].sx==CS.snakes[CS.snakesno[CS.snakelong-1]].sx)
				CS.snakes[CS.snakesno[CS.snakelong-1]].setSize(19,19);
				
			else if(CS.snakes[CS.snakesno[CS.snakelong]].sx<CS.snakes[CS.snakesno[CS.snakelong-2]].sx
					&& CS.snakes[CS.snakesno[CS.snakelong]].sy>CS.snakes[CS.snakesno[CS.snakelong-2]].sy
					&& CS.snakes[CS.snakesno[CS.snakelong]].sx==CS.snakes[CS.snakesno[CS.snakelong-1]].sx)
				CS.snakes[CS.snakesno[CS.snakelong-1]].setSize(20,20);
			
			else if(CS.snakes[CS.snakesno[CS.snakelong]].sx>CS.snakes[CS.snakesno[CS.snakelong-2]].sx
					&& CS.snakes[CS.snakesno[CS.snakelong]].sy>CS.snakes[CS.snakesno[CS.snakelong-2]].sy
					&& CS.snakes[CS.snakesno[CS.snakelong]].sy==CS.snakes[CS.snakesno[CS.snakelong-1]].sy)
				CS.snakes[CS.snakesno[CS.snakelong-1]].setSize(20,19);
			
			else if(CS.snakes[CS.snakesno[CS.snakelong]].sx>CS.snakes[CS.snakesno[CS.snakelong-2]].sx
					&& CS.snakes[CS.snakesno[CS.snakelong]].sy>CS.snakes[CS.snakesno[CS.snakelong-2]].sy
					&& CS.snakes[CS.snakesno[CS.snakelong]].sx==CS.snakes[CS.snakesno[CS.snakelong-1]].sx)
				CS.snakes[CS.snakesno[CS.snakelong-1]].setSize(19,20);
			
			else if(CS.snakes[CS.snakesno[CS.snakelong]].sx<CS.snakes[CS.snakesno[CS.snakelong-2]].sx
					&& CS.snakes[CS.snakesno[CS.snakelong]].sy>CS.snakes[CS.snakesno[CS.snakelong-2]].sy
					&& CS.snakes[CS.snakesno[CS.snakelong]].sy==CS.snakes[CS.snakesno[CS.snakelong-1]].sy)
				CS.snakes[CS.snakesno[CS.snakelong-1]].setSize(19,19);
			
			else if(CS.snakes[CS.snakesno[CS.snakelong]].sx>CS.snakes[CS.snakesno[CS.snakelong-2]].sx
					&& CS.snakes[CS.snakesno[CS.snakelong]].sy<CS.snakes[CS.snakesno[CS.snakelong-2]].sy
					&& CS.snakes[CS.snakesno[CS.snakelong]].sy==CS.snakes[CS.snakesno[CS.snakelong-1]].sy)
				CS.snakes[CS.snakesno[CS.snakelong-1]].setSize(20,20);
		}
	}
	
	public void getfoodupdate(){
		if (CS.fangxiang == 39 || CS.fangxiang == 37) {
			CS.snakes[CS.snakelong].setBounds(
					CS.snaketou[0] * 20, CS.snaketou[1] * 20,
					20, 19);
		} else {
			CS.snakes[CS.snakelong].setBounds(
					CS.snaketou[0] * 20, CS.snaketou[1] * 20,
					19, 20);
		}
	}
}
