package com.example.studentlist.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "students")
public class ApplicationProperties {

    private boolean createOnStart;

    public boolean isCreateOnStart(){
        return createOnStart;
    }

    public void setCreateOnStart(boolean createOnStart) {
        this.createOnStart = createOnStart;
    }
}
