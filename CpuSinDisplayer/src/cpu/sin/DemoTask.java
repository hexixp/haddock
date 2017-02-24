package cpu.sin;

public class DemoTask implements Runnable {

	private String name;

	public DemoTask(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		double  j=0.0;
		//sin����С����Ϊ2��
		for(j=0.0;j<8*2*Math.PI;j+=0.1){
			//500����Ϊʱ����
			compute(500,Math.sin(j)/2+0.5);
		}
	}

	private void compute(int time, double percent) {
		long runTime = (long)(time*percent);
		long sleepTime = time - runTime;
		long startTime =System.currentTimeMillis();
		while(System.currentTimeMillis()-startTime<runTime)
		{
			;
		}
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
