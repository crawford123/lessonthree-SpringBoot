package com.paul.properties;

import org.springframework.beans.factory.annotation.Value;

public class PaulProperties {
    @Value("${com.paul.title}")
    private  String title;
    @Value("${com.Paul.description}")
    private  String description;
    //省略getter settet方法

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
