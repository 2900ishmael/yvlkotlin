class  Dog(var name:String,var breed:String,){
    fun move(movement:String){
        println("The dog is $movement")
    }

}

fun main() {
    var dog1 = Dog("Benji","Doberman Pinscher",)
    var dog2 = Dog("El Diablo","German Shepherd")

    println(dog1.breed)
    dog2.move("running")

}