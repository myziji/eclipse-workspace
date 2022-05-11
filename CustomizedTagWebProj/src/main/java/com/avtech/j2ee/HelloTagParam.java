package com.avtech.j2ee;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.TagSupport;

public class HelloTagParam extends TagSupport {
   private String name;

   
   public void setName(String name) {
      this.name = name;
   }
   

   public int doStartTag() throws JspException {
      try {
         pageContext.getOut().print("Welcome to JSP Tag Programming, " +name);
      } catch (IOException ioe) {
         throw new JspException("Error: IOException while writing to client");
      }
      return SKIP_BODY;
   }

   public int doEndTag() throws JspException {
      return SKIP_PAGE;
   }
}

