package io.github.bxo.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HelloTask {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Scheduled(initialDelay=1000, fixedDelay = 5000)
    public void run(){
        logger.info("Task run!");
        throw new RuntimeException("exception during task.");
    }

}
