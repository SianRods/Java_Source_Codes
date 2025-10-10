package com.rods;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws LifecycleException {

        System.out.println( "Hello World!" );
        // starting a tomcat server and telling it to wait for a response from the client
        // side
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.getConnector(); // create default connector ==> required for the newer versions

        // Mapping the Servlet to it's classes
        Context context = tomcat.addContext("",null);
        Tomcat.addServlet(context,"HelloServlet",new HelloServlet());
        context.addServletMappingDecoded("/hello","HelloServlet");

        tomcat.start();
        tomcat.getServer().await();



    }
}
