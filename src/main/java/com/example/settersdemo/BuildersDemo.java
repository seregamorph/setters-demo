package com.example.settersdemo;

import com.example.settersdemo.config.JacksonConfig;
import com.example.settersdemo.model.AssignmentGroupedActivitiesResource;
import com.example.settersdemo.model.ProductivityGroupResource;
import com.example.settersdemo.model.UserActivitiesGroupingResource;

import java.util.Arrays;

public class BuildersDemo {

    public static void main(String[] args) throws Exception {
        AssignmentGroupedActivitiesResource resource = create();

        System.out.println(JacksonConfig.createObjectMapper().writeValueAsString(resource));
    }

    private static AssignmentGroupedActivitiesResource create() {
        return AssignmentGroupedActivitiesResource.builder()
                .grouping(UserActivitiesGroupingResource.builder()
                        .alignmentScore(1)
                        .focusScore(0)
                        .advancedGroups(Arrays.asList(
                                ProductivityGroupResource.builder()
                                        .sectionName("Development")
                                        .color("#2196f3")
                                        .spentTime(5L)
                                        .build(),
                                ProductivityGroupResource.builder()
                                        .sectionName("Chat")
                                        .color("#E502FA")
                                        .spentTime(1L)
                                        .build(),
                                ProductivityGroupResource.builder()
                                        .sectionName("Other")
                                        .color("#7D7878")
                                        .spentTime(1L)
                                        .build()
                        ))
                        .periodLong(10L)
                        .totalTrackedTime(7L)
                        .intensityScore(2)
                        .build())
                .build();
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
