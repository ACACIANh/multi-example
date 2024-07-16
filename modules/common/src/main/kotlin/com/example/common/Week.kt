package com.example.common

enum class Week {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    ;

    fun isWeekend(): Boolean {
        return this == SUNDAY || this == SATURDAY
    }
}