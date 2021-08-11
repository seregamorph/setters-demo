package com.example.settersdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor // just for BuildersDemo
@AllArgsConstructor // just for BuildersDemo
@Builder // just for BuildersDemo
@Data // only one you need
public class UserActivitiesGroupingResource {
    private int alignmentScore;
    private int focusScore;
    private List<ProductivityGroupResource> advancedGroups;
    private long periodLong;
    private long totalTrackedTime;
    private int intensityScore;
}
