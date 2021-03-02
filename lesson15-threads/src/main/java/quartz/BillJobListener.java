package quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

public class BillJobListener implements JobListener {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return BillJobListener.class.getSimpleName();
	}

	@Override
	public void jobToBeExecuted(JobExecutionContext context) {
		// TODO Auto-generated method stub
		System.out.println("job to be excuted: "+context.getJobDetail().getKey().toString());
		
	}

	@Override
	public void jobExecutionVetoed(JobExecutionContext context) {
		// TODO Auto-generated method stub
		System.out.println("job to be vetoed: "+context.getJobDetail().getKey().toString());
	}

	@Override
	public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
		// TODO Auto-generated method stub
		System.out.println("job was excuted: "+context.getJobDetail().getKey().toString());
		
	}

}
