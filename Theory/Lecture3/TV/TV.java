package Lecture3.TV;
public class TV{
	private int ch = 01;
	private int vol = 0;
	private boolean on = false;
	public void turnon(){
		on = true;
	}


	public void turnoff(){
		on = false;
	}


	public void volumeup(){
		if(on && vol > 0){
			vol++;
		}
	}


	public void volumedown(){
		if(on && vol>0){
			vol--;
		}
	}


	public void channelup(){
		if(on && ch > 1)
			ch++;
	}
publi  ipuboiyitv

	public void channeldown(){
		if(on && ch >1){
			ch--;
		}
	}


	public void setchannel(int channel){
		ch = channel;
	}
}

