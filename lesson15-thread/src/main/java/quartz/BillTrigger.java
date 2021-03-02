package quartz;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class BillTrigger {
	public static void main(String[] args) throws SchedulerException {
		
		// job detail
		// BillJob.class reflexible
		JobDetail jobDetail = JobBuilder.newJob(BillJob.class)
				.withIdentity("billId", "group")
				.build();
		
		// trigger: time execute job
		// jobDetail & trigger map with Identity
		Trigger trigger = TriggerBuilder.newTrigger()
				.withIdentity("billId", "group")
				.withSchedule(CronScheduleBuilder.cronSchedule("10 58 20 ? * * "))
				.build();
		
		// job listener
		BillJobListener listener = new BillJobListener();				
		Scheduler schedular = new StdSchedulerFactory().getScheduler();
		
		schedular.getListenerManager().addJobListener(listener);
		schedular.scheduleJob(jobDetail, trigger);
	
		schedular.start();
	}
}
