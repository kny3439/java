package anomymous.basic;

public class Tv {

	private int sound;
	private RemoteControl remote;
	
	public Tv() {
		remote=new RemoteControl() {
			
			@Override
			public void volumeUp() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void volumeDown() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
}
