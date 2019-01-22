package acadgild.Task1

object Inheritance {
  def main(args: Array[String]){
    val vehicle1 = new Car(150)
    println(vehicle1.mph)
    vehicle1.race()
    
    val vehicle2 = new Bike(100)
    println(vehicle2.mph)
    vehicle2.race()
  }
  class Vehicle(speed:Int){
    val mph: Int = speed
    def race() = println("Racing")
  }
  class Car(speed:Int) extends Vehicle(speed){
    override val mph:Int = speed
    override def race() = println("Racing Car")
  }
  class Bike(speed:Int) extends Vehicle(speed){
    override val mph:Int = speed
    override def race() = println("Racing Bike")
  }
}