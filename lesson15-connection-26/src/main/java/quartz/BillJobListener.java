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
    public void jobToBeExecuted(JobExecutionContext jobExecutionContext) {
        System.out.println("job to be executed" + jobExecutionContext.getJobDetail().getKey().toString());
    }

    @Override
    public void jobExecutionVetoed(JobExecutionContext jobExecutionContext) {
        System.out.println("job to be vetoed" + jobExecutionContext.getJobDetail().getKey().toString());
    }

    @Override
    public void jobWasExecuted(JobExecutionContext jobExecutionContext, JobExecutionException e) {
        System.out.println("job was executed" + jobExecutionContext.getJobDetail().getKey().toString());
    }
}
