package quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

public class BillJobListener implements JobListener {

	@Override
	public String getName() {
		return BillJobListener.class.getSimpleName();
	}

	@Override
	public void jobToBeExecuted(JobExecutionContext context) {
		System.out.println("job to be executed: " + context.getJobDetail().getKey().toString());
	}

	@Override
	public void jobExecutionVetoed(JobExecutionContext context) {
		System.out.println("job to be vetoed: " + context.getJobDetail().getKey().toString());
	}

	@Override
	public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
		System.out.println("job was executed: " + context.getJobDetail().getKey().toString());
	}

}
