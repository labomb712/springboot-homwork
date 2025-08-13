package com.rookies.MySpringbootLab.Component;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MyPropRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(MyPropRunner.class);

    @Value("${myprop.username}")
    private String userName;

    @Value("${myprop.port}")
    private int port;

    private final MypropProperties props;
    private final Environment env;


    public MyPropRunner(MypropProperties props, Environment env){
        this.props=props;
        this.env=env;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("userName: {}", userName);
        logger.info("port: {}", port);
        logger.info("Environment: {}", env);

    }
}
