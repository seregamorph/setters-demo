package com.example.settersdemo;

import com.example.settersdemo.config.JacksonConfig;
import com.example.settersdemo.model.AssignmentGroupedActivitiesResource;
import com.example.settersdemo.model.ProductivityGroupResource;
import com.example.settersdemo.model.UserActivitiesGroupingResource;

import java.util.Arrays;

public class ClassicSettersDemo {

    public static void main(String[] args) throws Exception {
        AssignmentGroupedActivitiesResource resource = create();

        System.out.println(JacksonConfig.createObjectMapper().writeValueAsString(resource));
    }

    private static AssignmentGroupedActivitiesResource create() {
        ProductivityGroupResource group1 = new ProductivityGroupResource();
        group1.setSectionName("Development");
        group1.setColor("#2196f3");
        group1.setSpentTime(5L);

        ProductivityGroupResource group2 = new ProductivityGroupResource();
        group2.setSectionName("Chat");
        group2.setColor("#E502FA");
        group2.setSpentTime(1L);

        ProductivityGroupResource group3 = new ProductivityGroupResource();
        group3.setSectionName("Other");
        group3.setColor("#7D7878");
        group3.setSpentTime(1L);

        UserActivitiesGroupingResource grouping = new UserActivitiesGroupingResource();
        grouping.setAlignmentScore(1);
        grouping.setFocusScore(0);
        grouping.setAdvancedGroups(Arrays.asList(group1, group2, group3));
        grouping.setPeriodLong(10L);
        grouping.setTotalTrackedTime(7L);
        grouping.setIntensityScore(2);

        AssignmentGroupedActivitiesResource assignmentGroupedActivities = new AssignmentGroupedActivitiesResource();
        assignmentGroupedActivities.setGrouping(grouping);
        return assignmentGroupedActivities;
    }

}
