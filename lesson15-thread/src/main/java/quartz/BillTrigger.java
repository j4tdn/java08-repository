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
		JobDetail jobdetail = JobBuilder.newJob(BillJob.class).withIdentity("BillId","group").build();

		// trigger
		Trigger trigger = TriggerBuilder.newTrigger().withIdentity("BillId","group")
				.withSchedule(CronScheduleBuilder.cronSchedule("21 57 20 ?  * * ")).build();

		// job listener
		BillJobListener listener = new BillJobListener();
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();

		scheduler.getListenerManager().addJobListener(listener);

		scheduler.scheduleJob(jobdetail, trigger);
		scheduler.start();

	}
}
