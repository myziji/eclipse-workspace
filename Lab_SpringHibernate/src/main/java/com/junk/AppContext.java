/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.junk;

/**
 *
 * @author ODJRES1
 * */
import org.springframework.context.ApplicationContext;

public class AppContext {
    private static ApplicationContext ctx;

    public static void setApplicationContext(ApplicationContext applicationContext)
    {
         System.out.println(" IN AppContext CTX = " + applicationContext );
        ctx = applicationContext;       }

    public static ApplicationContext getApplicationContext() {
         System.out.println(" IN AppContext GET CTX = " + ctx );
        return ctx;       }   }
