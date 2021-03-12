package quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class BillJob implements Job{

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("== Ready ==");
		System.out.println("Query data from database");
		System.out.println("== Done ===");
		
	}

}
