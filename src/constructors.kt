class Employee(var firstname:String,var age :Int,var gender:String,var position:String,var salary:Double){

    fun role(task:String){
        println("The role is $task")
    }


}
fun main() {
    var employee1=Employee("Faith",32,"Female","Managing Director",560000.00)
    var employee2 = Employee("Mark",21,"Male","Marketing Director",467000.00)

    println(employee1.firstname)
}