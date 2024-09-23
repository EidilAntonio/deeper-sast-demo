package com.dashboardmanager.utils;

import java.io.Serializable;

public class SessionHeader implements Serializable {
    private String username;
    private String sessionId;
    private String password;

    public SessionHeader(String username, String sessionId, String password) {
        this.username = username;
        this.sessionId = sessionId;
        this.password = password;
    }

    public String getUsername() { return this.username; }
    public void setUsername(String username) { this.username = username; }

    public String getSessionId() { return this.sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public String getPassword() { return this.password; }
    public void setPassword(String password) { this.password = password; }
    
}
