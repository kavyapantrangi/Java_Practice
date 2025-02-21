package calculator;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class Calculator implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // Create and configure Spring application context
        XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
        webApplicationContext.setConfigLocation("classpath:hi.xml");  // Ensure this file exists in src/main/resources

        // Create DispatcherServlet
        DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

        // Register DispatcherServlet
        ServletRegistration.Dynamic myServletContext = servletContext.addServlet("dispatcher", dispatcherServlet);

        myServletContext.setLoadOnStartup(1);
        myServletContext.addMapping("/mywebsite.com/*");  // Change this to a valid pattern
    }
}
