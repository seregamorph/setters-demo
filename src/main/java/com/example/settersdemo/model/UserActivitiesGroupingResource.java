package com.example.settersdemo.model;

import lombok.Data;

import java.util.List;

@Data
public class UserActivitiesGroupingResource {
    private int alignmentScore;
    private int focusScore;
    private List<ProductivityGroupResource> advancedGroups;
    private long periodLong;
    private long totalTrackedTime;
    private int intensityScore;
}
