fun main() {

    var greeting = "wagwan my g"
    var firstname = "yvl"
    var lastname = "ishmael"

    //String concatenation
    println(firstname + " " + lastname)
    println(firstname.plus(lastname))

    //Accessing a character in a string
    println(greeting[3])

    //Determining the index position of an element
    println(greeting.indexOf('m'))
    println(greeting.indexOf("wagwan"))

    //Determining the size of a string
    println(greeting.length)

    //Modifying a string
    println(greeting.uppercase())

    //String Interpolation
    println("Wagwan, my name is $firstname $lastname")


}