


fun main(){

}


// უდიდესი საერთო გამყოფი
fun usg(n1: Int, n2: Int){
    // val n1 = 9
    //val n2 = 6
    var gcd = 1

    var i = 1
    while (i <= n1 && i <= n2) {

        if (n1 % i == 0 && n2 % i == 0)
            gcd = i
        ++i
    }

    println("G.C.D of $n1 and $n2 is $gcd")
}

//უმცირესი საერთო ჯერადი
fun usj(n1: Int, n2: Int){
    var lcm: Int

    lcm = if (n1 > n2) n1 else n2

    while (true) {
        if (lcm % n1 == 0 && lcm % n2 == 0) {
            println("The LCM of $n1 and $n2 is $lcm.")
            break
        }
        ++lcm
    }
}

fun stringRet(n1: String){
    if (n1 == "$"){
        println("This feature contains a \$ symbol")
    }else{
        println("This feature does not contain a \$ character")
    }
}




fun resNumbers(num: Int) {
    var num = 1234
    var reversed = 0

    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }

    println("Reversed Number: $reversed")
}



//პოლინდრომი
fun palString(){
    print("Enter your string : ")
    val userInput = readLine()
    var s1:String
    var reverse:String=""
    s1=userInput.toString()
    var l:Int=s1.length-1

    while(l!=-1) {
        reverse+=s1[l--];
    }
    if(s1==reverse)println("Palindrome String");
    else println("Not a Palindrome String");
}
