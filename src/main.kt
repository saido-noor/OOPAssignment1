fun main() {
    var student = Human("Saido",20,30)
    student.eat(35)
    println(student.weight)
    student.speak("Hello, beautifull lady")
    println(student)
    student.birthday()
    println(student)
    var person = User("Shanaya","Avinash","shanaya20@gmail.com",769377160,"shanaya")
    println(person.firstName)
    println(person.phoneNumber)
    println(person.email)
}

class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int):Int{
        println("I am eating $foodWeight kgs of food ")
        weight+=foodWeight
        return weight
    }

    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        println(age+1)


    }
}


data class User(var firstName:String,var lastName:String, var email:String,var phoneNumber:Int,var password:String)










