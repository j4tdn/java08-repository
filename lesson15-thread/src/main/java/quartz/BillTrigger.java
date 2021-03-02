package quartz;

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
		
		//job detail: chua thong tin job nao, co id, ten gi
		JobDetail jobDetail = JobBuilder.newJob(BillJob.class)
										.withIdentity("billId", "group")
										.build();
		
		//trigger: congig time cho job chay, map dua vao id
		Trigger trigger = TriggerBuilder.newTrigger()
										.withIdentity("billId", "group")
										.withSchedule(CronScheduleBuilder.cronSchedule("59 56 20 ? * *")) //20h54m40s
										.build(); 
		
		//job listener
		BillJobListener listener = new BillJobListener();
		
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		
		scheduler.getListenerManager().addJobListener(listener); //trong sche da cos job listener
		
		scheduler.scheduleJob(jobDetail, trigger); //thuc thi job trong khoang thoi gian do
		
		scheduler.start();
	}
}

//cv: cronJob
