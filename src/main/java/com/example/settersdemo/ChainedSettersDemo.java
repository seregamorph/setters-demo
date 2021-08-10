package com.example.settersdemo;

import com.example.settersdemo.model.AssignmentGroupedActivitiesResource;
import com.example.settersdemo.model.UserActivitiesGroupingResource;
import lombok.Data;

import java.util.Arrays;

public class SettersDemoApplication {

    public static void main(String[] args) {
    }


    @Data
    public static class ProductivityGroupResource {
        private String sectionName;
        private String color;
        private long spentTime;
    }

    private static AssignmentGroupedActivitiesResource сreate() {
        return new AssignmentGroupedActivitiesResource()
                .setGrouping(new UserActivitiesGroupingResource()
                        .setAlignmentScore(1)
                        .setFocusScore(0)
                        .setAdvancedGroups(Arrays.asList(
                                new ProductivityGroupResource()
                                        .setSectionName("Development")
                                        .setColor("#2196f3")
                                        .setSpentTime(5L),
                                new ProductivityGroupResource()
                                        .setSectionName("Chat")
                                        .setColor("#E502FA")
                                        .setSpentTime(1L),
                                new ProductivityGroupResource()
                                        .setSectionName("Other")
                                        .setColor("#7D7878")
                                        .setSpentTime(1L)
                        ))
                        .setPeriodLong(10L)
                        .setTotalTrackedTime(7L)
                        .setIntensityScore(2));
    }



}
