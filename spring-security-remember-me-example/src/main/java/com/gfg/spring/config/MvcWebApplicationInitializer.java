package com.gfg.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MvcWebApplicationInitializer 
      extends AbstractAnnotationConfigDispatcherServletInitializer {

  // Load database and spring security configuration
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class[] { ApplicationConfiguration.class, WebSecurityConfiguration.class };
  }

  // Load spring web configuration
  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class[] { WebConfiguration.class };
  }

  @Override
  protected String[] getServletMappings() {
    return new String[] { "/" };
  }

}
