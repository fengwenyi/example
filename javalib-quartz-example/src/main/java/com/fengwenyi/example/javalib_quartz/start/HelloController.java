package com.fengwenyi.example.javalib_quartz.start;

import com.fengwenyi.javalib.quartz.ScheduleBean;
import com.fengwenyi.javalib.quartz.TimeTypeEnum;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author Wenyi Feng
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private Scheduler scheduler;

    @Autowired
    private HelloTask helloTask;

    @RequestMapping("/job")
    public boolean job() {
        String jobName = "JOB";
        String triggerName = "TRIGGER";
        ScheduleBean scheduleBean = new ScheduleBean(scheduler, HelloJob.class, jobName, triggerName);
        scheduleBean.setTimeType(TimeTypeEnum.AT_TIME);
        scheduleBean.setAtTime(System.currentTimeMillis() + 1000 * 10); // 10s之后运行
        boolean rs = false;
        try {
            rs = helloTask.start(scheduleBean);
            System.out.println("cTime : " + new Date());
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        return rs;
    }

}
