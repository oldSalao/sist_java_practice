package day0209;

public class AirController extends RemoteController {
	private int temperature;
	
	public AirController() {
		setTemperature(18);
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public void upBtn() {
		if(getTemperature()<30) {
			setTemperature(getTemperature()+1);
			System.out.println("Current Temperature : " + getTemperature());
		}
		else {
			System.out.println("it doesn't work.");
		}
	}

	@Override
	public void downBtn() {
		if(getTemperature()>18) {
			setTemperature(getTemperature()-1);
			System.out.println("Current Temperature : " + getTemperature());
		}
		else {
			System.out.println("it doesn't work.");
		}
	}
}