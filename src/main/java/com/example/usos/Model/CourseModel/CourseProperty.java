package com.example.usos.Model.CourseModel;

import java.io.Serializable;

public class CourseProperty implements Serializable {
    private String propertyName;
    private String description;

    public CourseProperty(String propertyName, String description)
    {
        this.propertyName = propertyName;
        this.description = description;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
