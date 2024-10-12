package com.example.pam1activitybasickotlin

fun nullSafety() {
    // neverNull has String type
    var neverNull: String = "This can't be null"

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"
    nullable = null

    // Check for null in conditions
    if (neverNull == null) {
        println("inferredNonNull is null")
    } else {
        println("inferredNonNull is not null")
    }

    // Safe call operator
    println(neverNull.length) // 18
    println(nullable?.length) // null
}
