package quartz;

import java.lang.reflect.Method;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;


public class BillTrigger {
	public static void main(String[] args) throws Exception {
		
		// job detail
		JobDetail jobDetail = JobBuilder.newJob(BillJob.class)
				.withIdentity("billId", "group")
				.build();
		
		// trigger
		Trigger trigger = TriggerBuilder.newTrigger()
				.withIdentity("billId", "group")
				.withSchedule(CronScheduleBuilder.cronSchedule("40 54 20 ? * *"))
				.build();
		
		// job listener
		BillJobListener listener = new BillJobListener();
		
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		scheduler.getListenerManager().addJobListener(listener);
		scheduler.scheduleJob(jobDetail, trigger);
		
		scheduler.start();
		
	}
}
