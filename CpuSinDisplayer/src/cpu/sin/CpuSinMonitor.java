package cpu.sin;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CpuSinMonitor {

	public static void main(String[] args) {
		//获取系统CPU的核数ddd
		int cpuNum = Runtime.getRuntime().availableProcessors();
		
		ExecutorService threadPool = Executors.newFixedThreadPool(cpuNum);
		for(int i =0;i<cpuNum;i++)
		{
			threadPool.execute(new DemoTask("Task-"+i));
		}
	}

}
