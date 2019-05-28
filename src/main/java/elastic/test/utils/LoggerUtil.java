package elastic.test.utils;

import org.apache.log4j.Logger;

/**
 * 日志工具类
 * LoggerUtil.debug(this, "debug message");       //调试信息
 * LoggerUtil.info(this, "info message");         //日志信息
 * LoggerUtil.warn(this, "warn message");         //无异常警告信息
 * LoggerUtil.warn(this, "warn message", e);      //有异常警告信息
 * LoggerUtil.error(this, "error message");       //无异常错误信息
 * LoggerUtil.error(this, "error message", e);    //有异常错误信息
 * @author zhengyangjun
 */
public class LoggerUtil {

    public static void error(Object obj, String message) {
        error(obj.getClass(), message, null);
    }

    public static void error(Class clz, String message) {
        error(clz, message, null);
    }

    public static void error(Object obj, String message, Throwable t) {
        error(obj.getClass(), message, t);
    }

    public static void error(Class clazz, String message, Throwable t) {
        Logger logger = Logger.getLogger(clazz);
        logger.error(message, t);
    }

    public static void warn(Object obj, String message) {
        warn(obj.getClass(), message, null);
    }

    public static void warn(Class clazz, String message) {
        warn(clazz, message);
    }

    public static void warn(Object obj, String message, Throwable t) {
        warn(obj.getClass(), message, t);
    }

    public static void warn(Class clazz, String message, Throwable t) {
        Logger logger = Logger.getLogger(clazz);
        logger.warn(message, t);
    }

    public static void info(Object obj, String message) {
        info(obj.getClass(), message);
    }

    public static void info(Class clazz, String message) {
        Logger logger = Logger.getLogger(clazz);
        logger.info(message);
    }

    public static void debug(Object obj, String message) {
        debug(obj.getClass(), message);
    }

    public static void debug(Class clazz, String message) {
        Logger logger = Logger.getLogger(clazz);
        logger.debug(message);
    }
}
