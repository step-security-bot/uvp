package org.opensourceway.uvp.schedule.constant;

import org.opensourceway.uvp.enums.QuartzJobEnum;

import java.util.Map;

public class QuartzConstant {
    public static final String QUARTZ_SCHEDULER = "quartzScheduler";

    public static final String CAPTURE_CRON_JOB_DETAIL_ID = "captureCronJobDetail";

    public static final String CAPTURE_CRON_TRIGGER_ID = "captureCronJobTrigger";

    public static final String DUMP_VULN_JOB_DETAIL_ID = "dumpVulnJobDetail";

    public static final String DUMP_VULN_JOB_TRIGGER_ID = "dumpVulnJobTrigger";

    public static final Map<QuartzJobEnum, String> JOB_TO_TRIGGER = Map.of(
            QuartzJobEnum.DUMP_VULN_JOB, DUMP_VULN_JOB_TRIGGER_ID,
            QuartzJobEnum.CAPTURE_CRON_JOB, CAPTURE_CRON_TRIGGER_ID
    );
}
