/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.junk;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextProvider implements ApplicationContextAware {

    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        System.out.println(" chris aaaaaa IN ApplicationContextProvider CTX = " + ctx );
        AppContext.setApplicationContext(ctx);
    }
}
