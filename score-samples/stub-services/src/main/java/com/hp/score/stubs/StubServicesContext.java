package com.hp.score.stubs;

import org.springframework.context.annotation.Bean;

/**
 * User: stoneo
 * Date: 14/07/2014
 * Time: 11:53
 */
public class StubServicesContext {

    @Bean
    StubPauseResumeServiceImpl pauseResumeService(){
        return new StubPauseResumeServiceImpl();
    }

    @Bean
    StubWorkerConfigurationService workerConfigurationService(){
        return new StubWorkerConfigurationService();
    }

    @Bean
    StubRuntimeValueService runtimeValueService() {
        return new StubRuntimeValueService();
    }

    @Bean
    StubParallelPersistenceServiceImpl parallelPersistenceService() {
       return new StubParallelPersistenceServiceImpl();
    }
}
