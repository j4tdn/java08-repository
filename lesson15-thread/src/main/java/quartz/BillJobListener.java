package quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

public class BillJobListener implements JobListener {

	@Override
	public String getName() {
		return BillJobListener.class.getName();
	}

	@Override
	public void jobToBeExecuted(JobExecutionContext context) {
		//job nao duoc thuc thi, truoc khi thuc thi
		System.out.println("Job to be executed: " + context.getJobDetail().getKey().toString());
	}

	@Override
	public void jobExecutionVetoed(JobExecutionContext context) { //bi loi thi xuong day
		System.out.println("Job to be vetoed: " + context.getJobDetail().getKey().toString());
	}

	@Override
	public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
		System.out.println("Job was executed: " + context.getJobDetail().getKey().toString());
	}

}
