package com.example.lab2

data class Student(
    val id: Int,
    val name: String,
    val major: String
)

val sampleStudents = listOf(
    Student(1, "Nguyễn Văn An", "Công nghệ thông tin"),
    Student(2, "Trần Thị Bình", "Kỹ thuật phần mềm"),
    Student(3, "Lê Minh Cường", "An toàn thông tin"),
    Student(4, "Phạm Thu Dung", "Khoa học dữ liệu")
)
