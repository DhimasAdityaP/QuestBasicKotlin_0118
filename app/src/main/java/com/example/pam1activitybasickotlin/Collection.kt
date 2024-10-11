package com.example.pam1activitybasickotlin

// List adalah kumpulan data yang disusun secara berurutan dari:
// List bersifat ordered, artinya data yang dimasukkan akan memiliki posisi sesuai urutan
// List bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// MutableList yang menggunakan mutableListOf

fun ContohList() {
    println("---- List ----")
    val readonly = listOf("A", "B", "C")
    println(readonly)

    // List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam List Mutable
    shape.add("Oval")
    println(shape)

    // Menghapus data dari List Mutable
    shape.remove("Circle")
    println(shape)

    // Mengakses data di dalam List Mutable
    val shapeLocked: List<String> = shape
    println(shapeLocked)
}

// Set adalah kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik
// Set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Set bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// MutableSet yang menggunakan mutableSetOf

fun ContohSet() {
    println("---- Set ----")
    val readonly = setOf("A", "B", "C")
    println(readonly)

    // Set Mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam Set Mutable
    shape.add("Rectangle")
    println(shape)

    // Menghapus data dari Set Mutable
    shape.remove("Circle")
    println(shape)

    // Mengubah data di dalam Set Mutable
    shape.add("Square")
    println(shape)

    val shapeLocked: Set<String> = shape
    println(shapeLocked)
}

// Map adalah kumpulan data yang disusun dalam pasangan key-value
// Map bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Map bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// MutableMap yang menggunakan mutableMapOf

fun ContohMap() {
    println("---- Map ----")
    val readonly = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readonly)

    // Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    // Menambahkan data ke dalam Map Mutable
    shape["Rectangle"] = 4
    println(shape)

    // Menghapus data dari Map Mutable
    shape.remove("Circle")
    println(shape)

    // Mengubah data di dalam Map Mutable
    shape["Square"] = 5
    println(shape)

    val shapeLocked: Map<String, Int> = shape
    println(shapeLocked)
}

fun main() {
    ContohList()
    ContohSet()
    ContohMap()
}