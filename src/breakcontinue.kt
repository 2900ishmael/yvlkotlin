fun main() {
    //Break statement

    for (number in 30..40){
        if (number == 35){
            break
        }
        println(number)
    }

    //Continue statement
    for (letter in 'a'..'h'){
        if (letter == 'd'){
            continue
        }
        println("Letter is $letter")
    }
}