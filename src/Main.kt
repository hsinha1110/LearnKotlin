class Student {
    var name = "Himanshu"
    var rollNumber = "11"

    fun introduce() {
        println("Student name is $name and Student roll is $rollNumber")
    }
}

fun main() {

    var student = Student()
    student.introduce()

}