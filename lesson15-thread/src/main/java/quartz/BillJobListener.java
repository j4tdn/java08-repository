package quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

public class BillJobListener implements JobListener {

	@Override
	public String getName() {
		return BillJobListener.class.getTypeName();
	}

	@Override
	public void jobToBeExecuted(JobExecutionContext context) {
		System.out.println("Job to be executed: " + context.getJobDetail().getKey().toString());
		
	}

	@Override
	public void jobExecutionVetoed(JobExecutionContext context) {
		System.out.println("Job to be vetoed: " + context.getJobDetail().getKey().toString());
	}

	@Override
	public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
		System.out.println("Job was exercuted: " + context.getJobDetail().getKey().toString());
		
	}

	
}
