package com.entreprise.app;

import com.entreprise.app.persistence.HibernateUtils;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * Created by machu on 12/03/2016.
 */
public class Main {

    public static void main (String[] args){
        Server server = new Server(Integer.valueOf(8282));
        HibernateUtils.getSessionFactory().openSession();
        final WebAppContext root = new WebAppContext();
        root.setContextPath("/");
        root.setParentLoaderPriority(true);
        final String webappDirLocation = "src/main/webapp/";
        root.setDescriptor(webappDirLocation + "/WEB-INF/web.xml");
        root.setResourceBase(webappDirLocation);
        server.setHandler(root);
        try {
            server.start();
            server.join();

        } catch (InterruptedException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            server.destroy();
        }
    }
}
