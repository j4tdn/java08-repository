package quartz;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.TriggerBuilder;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

public class BillTrigger {
	public static void main(String[] args) throws Exception{
		
		//job detail
		
		JobDetail jobDetail = JobBuilder.newJob(BillJob.class)
				.withIdentity("billId", "group")
				.build();
		
		Trigger trigger = TriggerBuilder.newTrigger()
				.withIdentity("billId")
				.withSchedule(CronScheduleBuilder.cronSchedule("50 56 20 ? * * "))
				.build();
		//trigger
		
		//job listener
		BillJobListener listener = new BillJobListener();
		
		Scheduler schedule  = new StdSchedulerFactory().getScheduler();
		
		schedule.getListenerManager().addJobListener(listener);
		
		schedule.scheduleJob(jobDetail, trigger);
		
		schedule.start();
	}

}
