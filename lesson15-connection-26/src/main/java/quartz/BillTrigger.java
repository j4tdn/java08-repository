package quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class BillTrigger {
    public static void main(String[] args) throws SchedulerException {


        // job detail ( taks, job )

        String name = "bill id";
        JobKey jobkey = new JobKey(name);



        JobDetail jobDetail = JobBuilder.newJob(BillJob.class)
                    .withIdentity("bill id","group")
                    .build();



        // trigger ( time config ... )
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("bill id","group")
                .withSchedule(CronScheduleBuilder.cronSchedule("10 55 20 ? * *"))
                .build();


        // job listener
        BillJobListener listener = new BillJobListener();

        Scheduler scheduler = new StdSchedulerFactory().getScheduler();

        scheduler.getListenerManager().addJobListener(listener);

        scheduler.scheduleJob(jobDetail,trigger);

        scheduler.start();
    }
}
