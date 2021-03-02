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
		System.out.println("Job to be excuted: " + context.getJobDetail().getKey().toString());
	}

	@Override
	public void jobExecutionVetoed(JobExecutionContext context) {
		System.out.println("Job to be Vetoed: " + context.getJobDetail().getKey().toString());
	}

	@Override
	public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
		System.out.println("Job was Executed: " + context.getJobDetail().getKey().toString());
		
	}

}
