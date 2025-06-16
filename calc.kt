fun main() {
    println("Enter marks:")
    val mark = readLine()!!.toInt()

    when {
        mark >= 80 -> println("Grade: A")
        mark >= 60 -> println("Grade: B")
        mark >= 40 -> println("Grade: C")
        else -> println("Grade: F")
    }
}
