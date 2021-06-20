fun main(){
    var num: Int = 0
    while(num<100){
        num++
        if(num % 3 == 0 && num % 5 == 0){
            println("FizzBuzz")
            continue
        }
        if (num % 3 == 0){
            println("Fizz")
            continue
        }
        if(num % 5 == 0){
            println("Buzz")
            continue
        }
        println(num)
    }
}