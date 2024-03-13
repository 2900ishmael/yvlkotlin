fun main() {

    //while loop
    var number = 200
    while (number <= 205){
        println("Number is $number")
        number++
    }

    //decrement
    var x = 100
    while (x >= 95){
        println("Counter is $x")
        x--
    }
    //Do...while loop
    var num = 20
    do{
        println(num)
        num++
    }while (num <= 25)


    //for loop
    var devices = arrayOf("Laptop","Phone","Xbox")
    for (device in devices){
        println("Device is $device")
    }

    var marks = arrayOf(90,54,78,20)
    for (mark in marks){
        println("Scored a $mark")
    }

    for(mynumber in 50..60){
        println(mynumber)
    }
    for(myletter in 'a'..'d'){
        println(myletter)
    }
}