import scala.io.StdIn.readDouble
object Q1{
    def main(args: Array[String]): Unit = {
        print("Enter the amount:")
        var amount=readDouble()     //get the amount as user input
        println("The interest is:"+interest(amount))  //calling the function
    }
    def interest(amount:Double):Double=amount match{
        case x if x<0 => 0
        case x if x<20000 =>0.02 * x
        case x if x<200000 =>0.04 * x
        case x if x<2000000 =>0.035 * x
        case x if x>=2000000 =>0.065 * x
    }
}
