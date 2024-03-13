fun main() {
    var langues = arrayOf("Kotlin","Python","Javascript","PHP",)
    langues[1] = "C++"
    println(langues[1])

   //Reassigning a value
    langues[1] = "C++"
    println(langues[1])



    //Accessing elements
    for (x in langues){
        println(x)
    }

}