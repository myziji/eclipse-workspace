package com.avtech.j2ee;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.TagSupport;

public class HelloTag extends TagSupport {

	public int doStartTag() throws JspException {
		try {
			pageContext.getOut().print("This is my first tag!");
		} catch (IOException ioe) {
			throw new JspException("Error: IOException while writing to client" + ioe.getMessage());
		}
		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		return SKIP_PAGE;
	}

}
