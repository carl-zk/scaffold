package moc.oreh.account.common;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppLifeCycle implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("app starting...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("app stopping...");
    }
}
