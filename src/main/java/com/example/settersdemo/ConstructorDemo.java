package com.example.settersdemo;

import com.example.settersdemo.config.JacksonConfig;
import com.example.settersdemo.model.AssignmentGroupedActivitiesResource;
import com.example.settersdemo.model.ProductivityGroupResource;
import com.example.settersdemo.model.UserActivitiesGroupingResource;

import java.util.Arrays;

public class ConstructorDemo {

    public static void main(String[] args) throws Exception {
        AssignmentGroupedActivitiesResource resource = create();

        System.out.println(JacksonConfig.createObjectMapper().writeValueAsString(resource));
    }

    private static AssignmentGroupedActivitiesResource create() {
        return new AssignmentGroupedActivitiesResource(
                new UserActivitiesGroupingResource(
                        1,
                        0,
                        Arrays.asList(
                                new ProductivityGroupResource(
                                        "Development",
                                        "#2196f3",
                                        5L
                                ),
                                new ProductivityGroupResource(
                                        "Chat",
                                        "#E502FA",
                                        1L
                                )
                        ),
                        10L,
                        7L,
                        2
                )
        );
    }
}
