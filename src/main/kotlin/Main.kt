
fun main(args: Array<String>) {
println(height(heights = listOf(1.5,1.7,1.9,1.6,1.8,1.65)))
even()
    people()
    println(car())
}
//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc (2 points)
fun even():List<String>{
    val names = mutableListOf("Rediet","Zeray","Hadera","Kidane","Engda","Tekle","Silas","Shalom","Chap","Millie")
    val even= names.filterIndexed{index,_->index%2==0}
    println(even)
    return even
}
//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun height(heights:List<Double>):List<Double>{
val averageheight= heights.average()
    val totalHeight= heights.sum()
    var avgandheight= listOf(averageheight, totalHeight)
    return avgandheight

}

//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age (2 points)
data class Person (var name:String, var age:Int, var height:Double, var weight:Double )
fun people(){
    val me = Person("Rediet", 22, 1.58, 52.5)
    val paps = Person("Hadera" ,60, 1.63, 67.8)
    val dad = Person("Zeray", 59, 1.87, 68.1)
    val k = listOf(me,paps,dad)
    var sorted=k.sortedByDescending { person1->person1.age }
    println(sorted)
}
//5.Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(var registration:String, var mileages:Double)
fun car():Double{
    val mercedes = Car("KDB23", 22.5)
    val bugatti = Car("KFS74", 17.0)
    val rangeRover=Car("KGT65", 15.5)
    val Cars = listOf(mercedes,bugatti,rangeRover)
    val total = listOf(mercedes,bugatti,rangeRover)
    var totalmilleage=total.sumOf { mileage->mileage.mileages }
    var averageMilleage=totalmilleage/total.size
    return averageMilleage
}