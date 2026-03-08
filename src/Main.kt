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

    val age = 15
    val votersAge = 19

//    if (votersAge >= 18) {
//        println("voter is eligible")
//    } else {
//        println("voter is not eligible")
//
//    }
//
//    while loop
    var battery = 5
    while (battery > 0) {
        println("Scrolling Instagram Battery left $battery")
        battery--
    }
    println("Battery Dead")

    // do while -> first
    val hasTime = false

    do {
        println("Game Played")
    } while (hasTime)

    val number = 5

    do {
        println("Number is $number")
    } while (number < 3)

    var attempt = 1

    do {
        println("Attempt is $attempt")
        attempt++
    } while (attempt <= 3)

    // for loop -> no of iterations known
    val myName = "Himanshu"
    for (i in 1..20) {
        println("My name is $myName - $i")
    }

}
// while loop → Condition pehle check hoti hai, agar true ho to loop chalta hai.
// do-while loop → Loop pehle ek baar chalta hai, condition baad me check hoti hai.
// for loop → Jab iterations ki exact count pata ho tab use hota hai.