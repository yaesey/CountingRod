package CountingRod.core;

import CountingRod.core.module.Module;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Accept command and launch gui
 *
 * 接受命令和启动gui
 */
@Module(moduleName = CountingRodInfo.NAME,moduleID = CountingRodInfo.ID,version = CountingRodInfo.VERSION)
public class CountingRod {
    private static final Logger LOGGER = LogManager.getLogger(CountingRod.class);

    public static void main(String[] commands) {
        LOGGER.info("Thanks to build/run CountingRod.");
        LOGGER.info("We are loading modules :");
        LOGGER.info("Loading :");
    }
}
