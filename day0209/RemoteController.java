package day0209;

public abstract class RemoteController {
	private boolean power;
	private boolean sleep;
	
	public boolean isPower() {
		return power;
	}


	public void setPower(boolean power) {
		this.power = power;
	}


	public boolean isSleep() {
		return sleep;
	}


	public void setSleep(boolean sleep) {
		this.sleep = sleep;
	}

	public void powerBtn() {
		if(isPower()) {
			setPower(false);
			System.out.println("Power Off!");
		}
		else {
			setPower(true);
			System.out.println("Power On!");			
		}
	}
	
	public void sleepBtn() {
		if(isSleep()) {
			setSleep(false);
			System.out.println("Sleep Mode Off");
		}
		else {
			setSleep(true);
			System.out.println("Sleep Mode On");			
		}
	}

	public abstract void upBtn();
	public abstract void downBtn();
}
