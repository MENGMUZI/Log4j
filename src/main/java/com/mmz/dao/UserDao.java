package com.mmz.dao;

import org.apache.log4j.Logger;

/**
 * @author : mengmuzi
 * create at:  2019-07-06  16:38
 * @description:
 */
public class UserDao {

    private static final Logger logger = Logger.getLogger(UserDao.class);//log4j

    //private Logger logger = LoggerFactory.getLogger(this.getClass()); //slf4j

    public static void main(String[] args) {

        //logger.debug("hello world!!!---debug");
        //logger.info("hello world!!!---info");
        //logger.warn("hello world!!!---warn");
        //logger.error("hello world!!!---error");

        int age = 5;
        try{
            logger.debug("111111111");
            age = 10/5;
            logger.debug("222222222");
        }catch(Exception e){
            e.printStackTrace();
            logger.error(e.getMessage(),e.getCause());
        }

    }

}
