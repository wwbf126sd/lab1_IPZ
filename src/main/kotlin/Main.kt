fun main(args: Array<String>) {
    println(fibonacci(args[0].toInt()))
}

fun fibonacci (n: Int) : String{
    tailrec fun fib(n : Int, str: String, one: Int, two: Int) : String{
        return if (n == 0) str else fib(n-1, str +  ", " + "${one + two}", two, one + two)
    }
    if(n == 0) return ""
    if(n == 1) return "0"
    return fib(n - 2, "0, 1", 0, 1)
}

