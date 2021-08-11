package com.example.settersdemo;

import com.example.settersdemo.config.JacksonConfig;
import com.example.settersdemo.model.AssignmentGroupedActivitiesResource;
import com.example.settersdemo.model.ProductivityGroupResource;
import com.example.settersdemo.model.UserActivitiesGroupingResource;

import java.util.Arrays;

public class ChainedSettersDemo {

    public static void main(String[] args) throws Exception {
        AssignmentGroupedActivitiesResource resource = create();

        System.out.println(JacksonConfig.createObjectMapper().writeValueAsString(resource));
    }

    private static AssignmentGroupedActivitiesResource create() {
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
/*
{
  "grouping" : {
    "alignmentScore" : 1,
    "focusScore" : 0,
    "advancedGroups" : [ {
      "sectionName" : "Development",
      "color" : "#2196f3",
      "spentTime" : 5
    }, {
      "sectionName" : "Chat",
      "color" : "#E502FA",
      "spentTime" : 1
    }, {
      "sectionName" : "Other",
      "color" : "#7D7878",
      "spentTime" : 1
    } ],
    "periodLong" : 10,
    "totalTrackedTime" : 7,
    "intensityScore" : 2
  }
}
*/
}
