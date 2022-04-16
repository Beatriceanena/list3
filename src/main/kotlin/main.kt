fun main(){
    listOfColors(listOf("red","white","purple","black","grey","yellow","blue"))

    var result =heights(listOf(3.4,8.5,9.3,2.3,6.5,26.76,9.8))
    println(result)

    var student1= People("sarah",23,34.0,32)
    var student2= People("jane",30,20.3,40)
    var student3= People("lucy",60,30.1,45)
    var sorted= mutableListOf(student1,student2,student3)
    println( sorted.sortedByDescending { x -> x.age})

    var student4= People("ann",20,90.0, 80)
    var student5=  People("Jmmy",14,60.0,30)
    var newlist=mutableListOf(student4,student5)
    println(newlist.plus(sorted))
 //question 1
}
fun  listOfColors(colors:List<String>): List<String>{
    colors.forEachIndexed{index,color->
        if(index%2 ==0){
            println(color)
        }
    }
    return colors
}
//question 2
fun heights(y:List<Double>):String{
    var totalsum  = y.sum()
    var average = y.average()
    var endresult = "$totalsum , $average"
    return endresult
}
//question 3
data class People(var name:String, var age:Int, var height:Double, var weight:Int){

}
//question 4
fun person(newstudents:List<Any>):List<Any>{
    return listOf()
}


//question 5
data class Car(var registration:String, var mileage:Double){
    fun averageMileage(car:List<Car>):Double{
        var sum=0.0
        car.forEach{ m->
            sum+=m.mileage
        }
        return  sum/car.count()
    }
}
