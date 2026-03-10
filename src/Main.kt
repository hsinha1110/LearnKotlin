//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//var → mutable variable (value can change).
//val → read-only variable (cannot be reassigned).

// var age = 18
//  println(age)
//  age = 15
//  println(age)

//  val age = 18
//  println(age)
//  age = 15
//  println(age)

// Data Types

//    var age = 18f
//    age = 14f;
//     var name = "Himanshu"
//    val name: String = "Himanshu"
//    val age: Int = 18
//    val marks: Float = 75f
//    val temp: Double = 23.54
//    val isLogin: Boolean = false
//    val char: Char = 'A'
//
//    println(name)
//    println(age)
//    println(marks)
//    println(temp)
//    println(isLogin)
//    println(char)
//
//// Arithmetic Operators
//    val a = 10
//    val b = 5
//
//    val add = a + b;
//    val subs = a - b;
//    val multi = a * b;
//    val divide = a / b;
//    val modulo = a % b
//
//    println("Addition of $a + $b is $add")
//    println("Substraction of $a + $b is $subs")
//    println("Multiplication of $a * $b is $multi")
//    println("Division of $a / $b is $divide")
//    println("Modulus of $a % $b is $modulo")
//
//    // Logical / Comparison Operators
//    val x = 10
//    val y = 30
//
//    println("$x is equal to $y : ${x == y}")
//    println("$x is not equal to $y : ${x != y}")
//    println("$x is greater than $y : ${x > y}")
//    println("$x is less than to $y : ${x < y}")
//    println("$x is greater than or equal to $y : ${x >= y}")
//    println("$x is less than or equal to $y : ${x <= y}")
//
//    // Logical Opeartors
//
//    val j = 10
//    val k = 30
//    val isLoggedIn = true
//
//    println("$j is less than 12 AND $k is greater than 20 : ${j < 12 && k > 20}")
//    println("$j is less than 12 OR $k is greater than 20 : ${j < 12 || k >= 20}")
//    println(!isLoggedIn)
//
//    val hasTicket = true
//    val hasFriends = false
//
//    println(hasTicket && hasFriends)
//    println(hasTicket || hasFriends)

//    val age = 15
//    val votersAge = 19

//    if (votersAge >= 18) {
//        println("voter is eligible")
//    } else {
//        println("voter is not eligible")
//
//    }
//
//    while loop
//    var battery = 5
//    while (battery > 0) {
//        println("Scrolling Instagram Battery left $battery")
//        battery--
//    }
//    println("Battery Dead")
//
//    // do while -> first
//    val hasTime = false
//
//    do {
//        println("Game Played")
//    } while (hasTime)
//
//    val number = 5
//
//    do {
//        println("Number is $number")
//    } while (number < 3)
//
//    var attempt = 1
//
//    do {
//        println("Attempt is $attempt")
//        attempt++
//    } while (attempt <= 3)
//
//    // for loop -> no of iterations known
//    val myName = "Himanshu"
//    for (i in 1..20) {
//        println("My name is $myName - $i")
//    }
//
//    calculateMarks(math = 90, english = 80, hindi = 70)
//    orderItem(item = "Iphone 17", quantity = 1)
//    orderItem(item = "Samsung Galaxy s26", quantity = 2)
//    calculatePercentage(84, 100)
//    greet()
//    greet("Himanshu")
//    greet("Himanshu", lastName = "Sinha")
//    add(11)
//    add(num1 = 11, num2 = 12)

// while loop → Condition pehle check hoti hai, agar true ho to loop chalta hai.
// do-while loop → Loop pehle ek baar chalta hai, condition baad me check hoti hai.
// for loop → Jab iterations ki exact count pata ho tab use hota hai.

// function
// parameters -> like placeholder
// arguments -> actual values
//fun calculateMarks(math: Int, english: Int, hindi: Int) {
//    val total = math + english + hindi
//
//    println("Total is $total")
//}
//
//
//fun orderItem(item: String, quantity: Int) {
//    println("Item is $item Quantity is $quantity")
//}
//
//fun calculatePercentage(marks: Int, totalMarks: Int): Float {
//    return (marks.toFloat() / totalMarks.toFloat())
//}
//
//// function overloading -> same name different parameter
//fun greet() {
//    println("Hello")
//}
//
//fun greet(firstName: String) {
//    println("Hello firstName is $firstName")
//}
//
//fun greet(firstName: String, lastName: String) {
//    println("Hello  firstName is $firstName and lastName is  $lastName")
//}
//
//fun add(num1: Int) {
//    println("The add is $num1")
//}
//
//fun add(num1: Int, num2: Int) {
//    println("The add is $num1 and $num2")
//}

    // Arrays
//    var marks = arrayOf(85, 90, 75, 64, 66)
//    println("${marks[0]}")
//    println("${marks[1]}")
//    println("${marks[2]}")
//
//    var menu = arrayOf("John", "Peter", "Mary")
//
//    for (i in menu) {
//        println(i)
//    }
//
//    for(j in marks){
//        println(j)
//    }
    StudentInfo()
    // oops
}

class Student {
    var name = ""
    var rollNo = ""
}

fun StudentInfo() {
    var student1 = Student()
    var student2 = Student()

    student1.name = "John"
    student1.rollNo = "1"

    student2.name = "Peter"
    student2.rollNo = "2"

    println("Student name: ${student1.name}")
    println("Student rollno: ${student1.rollNo}")

    println("Student name: ${student2.name}")
    println("Student rollno: ${student2.rollNo}")
}

class Car {
    var color = ""
    var model = ""
    var price = ""

    fun Horn() {
        println("${model} says beep beep ")
    }
}

fun Color(col: String) {
    println("${col} green")
}

