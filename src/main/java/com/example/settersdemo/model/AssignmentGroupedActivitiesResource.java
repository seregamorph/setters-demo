package com.example.settersdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor // just for BuildersDemo
@AllArgsConstructor // just for BuildersDemo
@Builder // just for BuildersDemo
@Data // only one you need
public class AssignmentGroupedActivitiesResource {
    private UserActivitiesGroupingResource grouping;
}
