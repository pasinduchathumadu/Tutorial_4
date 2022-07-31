import scala.io.StdIn.readInt
import scala.compiletime.ops.string
object Q2{
    def main(args: Array[String]): Unit = {
        print("Enter the number:")
        var num=readInt()
        if(checker(num)!=1){
            println(checker(num))  //this code line is printed except return value is one
        }
        if(num!=0){
            println(odd_even_check(num)) //zero value is not passing to this function.
        }
    }
    def checker(num:Int)= num match{
        case x if x==0 =>"zero"
        case x if x<0 =>"Negative"
        case _ =>1
    }
    def odd_even_check(num:Int)=(num%2) match{
        case 0 =>"Even number"
        case _ =>"Odd number"
    }
}