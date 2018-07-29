package com.fengwenyi.example.javalib_quartz;

import com.fengwenyi.example.javalib_quartz.start.HelloTask;
import com.fengwenyi.javalib.quartz.ScheduleBean;
import com.fengwenyi.javalib.quartz.TimeTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @author Wenyi Feng
 */
public class IndexController {

    @Autowired
    private HelloTask helloTask;

    public void index() {
        /*int time;
        ScheduleBean scheduleBean;
        scheduleBean.setTimeType(TimeTypeEnum.SIMPLE);
        scheduleBean.setTime(time);*/

        /*long atTime;
        ScheduleBean scheduleBean;
        scheduleBean.setTimeType(TimeTypeEnum.AT_TIME);
        scheduleBean.setAtTime(atTime);*/

        /*String cron;
        ScheduleBean scheduleBean;
        scheduleBean.setTimeType(TimeTypeEnum.CRON);
        scheduleBean.setCron(cron);*/

        /*// 将参数放到job中
        Map<String, Object> jobMap;
        ScheduleBean scheduleBean;
        scheduleBean.setParamJobMap(jobMap);

        // 将参数放到trigger中
        Map<String, Object> triggerMap;
        ScheduleBean scheduleBean;
        scheduleBean.setParamTriggerMap(triggerMap);*/
    }

}
