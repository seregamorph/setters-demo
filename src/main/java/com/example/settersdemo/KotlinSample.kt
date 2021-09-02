package com.example.settersdemo

// snippet is commented, because it's not compilable when kotlin code is in the same module with lombok-generated classes,
// but it's still valid :)
/*
private fun create(): AssignmentGroupedActivitiesResource {
    return AssignmentGroupedActivitiesResource().apply {
        grouping = UserActivitiesGroupingResource().apply {
            alignmentScore = 1
            focusScore = 0
            advancedGroups = listOf(
                    ProductivityGroupResource().apply {
                        sectionName = "Development"
                        color = "#2196f3"
                        spentTime = 5L
                    },
                    ProductivityGroupResource().apply {
                        sectionName = "Chat"
                        color = "#E502FA"
                        spentTime = 1L
                    })
            periodLong = 10L
            totalTrackedTime = 7L
            intensityScore = 2
        }
    }
}
*/
