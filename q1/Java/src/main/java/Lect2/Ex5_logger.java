package Lect2;

import java.util.logging.*;

public class Ex5_logger {
    public static void main(String[] args) throws Exception {
        logSimpleormat();
        loggerXmlFormat();
    }

    static void logSimpleormat(){
        Logger logger = Logger.getLogger(Ex5_logger.class.getName());
        ConsoleHandler ch = new ConsoleHandler();

        logger.addHandler(ch);

        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);

        logger.log(Level.WARNING, "Test logging 1");
        logger.info("Test logging 2");
    }

    static void loggerXmlFormat(){
        Logger logger = Logger.getLogger(Ex5_logger.class.getName());
        ConsoleHandler ch = new ConsoleHandler();

        logger.addHandler(ch);

        XMLFormatter xml = new XMLFormatter();
        ch.setFormatter(xml);

        logger.log(Level.WARNING, "Test logging 1");
        logger.info("Test logging 2");
    }

    static void loggerFilHandler() throws Exception{
        Logger logger = Logger.getLogger(Ex5_logger.class.getName());
        FileHandler fh = new FileHandler("log.xml");

        logger.addHandler(fh);

        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        logger.log(Level.WARNING, "Test logging 1");
        logger.info("Test logging 2");
    }
}
