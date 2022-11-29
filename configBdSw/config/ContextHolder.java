package com.empresa.configBdSw.config;

public abstract class ContextHolder {
    
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    public static void setClient(String context) {
        contextHolder.set(context);
    }
    
    public static String getClient() {
        return contextHolder.get();
    }

}
