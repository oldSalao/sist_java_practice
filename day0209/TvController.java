package day0209;

public class TvController extends RemoteController {
	private int chn;
	
	
	public int getChn() {
		return chn;
	}

	public void setChn(int chn) {
		this.chn = chn;
	}
	
	public void numBtn(int num) {
		if((num>-1)&&(num<10)) {
			System.out.println(num+" Btn Pushed!");
		}
		else {
			System.out.println("Btn Error!");
		}
	}
	
	@Override
	public void upBtn() {
		if(getChn()<999) {
		setChn(getChn()+1);
		System.out.println("chn : "+getChn());
		}
		else {
			System.out.println("it doesn't work.");
		}
	}

	@Override
	public void downBtn() {
		if(getChn()>0) {
		setChn(getChn()-1);
		System.out.println("chn : "+getChn());
		}
		else {
			System.out.println("it doesn't work.");
		}
	}

}
