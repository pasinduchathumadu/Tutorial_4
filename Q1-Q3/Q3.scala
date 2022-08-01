object Q3{
    def main(args: Array[String]): Unit = {
        println(format_name("Benny")(-1)(toUpper(_)))
        println(format_name("Niroshan")(1)(toUpper(_)))
        println(format_name("Saman")(0)(toLower(_)))
        println(format_name("Kumara")(5)(toUpper(_)))
    }
    def toUpper(name:String):String={
        return name.toUpperCase()
    }
    def toLower(name:String):String={
        return name.toLowerCase()
    }
    def format_name(name:String)(id:Int)(func:String=>String):String={  //function calling with parameters
        if(id== -1){
            func(name) //calling relevant function
        }
        else{
            var num=name.length()    //get the length of the string
            var temp=""
            var i=0
            while(i<num){
                if(i==id){
                    temp=temp+func(name.charAt(i).toString)
                }
                else{
                    temp=temp+name.charAt(i).toString
                }
                i=i+1
            }
            return temp
        }

    }
}
