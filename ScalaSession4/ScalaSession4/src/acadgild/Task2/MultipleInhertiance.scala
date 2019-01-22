package acadgild.Task2

object MultipleInheritance {
	def main(args: Array[String]): Unit= {

    trait Mammal {
      var mammalName: String = _
      def action = {
        println(mammalName + " is a mammal")
      }
    }

    trait WingedAnimal {
      var animalName: String = _
      def action = {
        println(animalName + " is a winged animal")
      }
    }

    class Bat extends Mammal with WingedAnimal {
     mammalName = "Bat";
     animalName = "Bat";
     override def action = {
      super[Mammal].action
      super[WingedAnimal].action
     }
    }

    var ab = new Bat
    ab.action
  }
}