package com.fengwenyi.example.javalib_quartz.job;

import org.quartz.*;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author Wenyi Feng
 */
public class HelloJob extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        // 获取jobDetail相关
        JobKey jobKey = context.getJobDetail().getKey();
        jobKey.getName();
        jobKey.getGroup();
        jobKey.getClass().getName();
        // 获取trigger相关
        TriggerKey triggerKey = context.getTrigger().getKey();
        triggerKey.getName();
        triggerKey.getGroup();

        // 获取自己的参数
        JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
        jobDataMap.getInt("");
        jobDataMap.getString("");
        jobDataMap.getFloat("");
        jobDataMap.getDouble("");
        JobDataMap triggerDataMap =  context.getTrigger().getJobDataMap();

        // 合并
        // 如果job和trigger的key相同，trigger会覆盖job的值
        JobDataMap dataMap = context.getMergedJobDataMap();

        // 方法二：也可以定义与key的属性，并提供setter方法

    }
}
