package com.simtech.sim.workingnodes.config.quartz;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.AdaptableJobFactory;

@Configuration
public class CustomJobFactory extends AdaptableJobFactory {
    @Autowired
    private AutowireCapableBeanFactory autowireCapableBeanFactory;

    /**
     * Create the job instance, populating it with property values taken
     * from the scheduler context, job data map and trigger data map.
     *
     * @param bundle
     */
    @Override
    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
        Object jobInstance = super.createJobInstance(bundle);
        autowireCapableBeanFactory.autowireBean(jobInstance);
        return jobInstance;
    }
}