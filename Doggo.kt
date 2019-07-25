fun main() {
    class Doggo(val name: String, var weight: Int, val breed: String) {
        fun bark() {
            println(if (weight < 20) "Yip" else "Woof")
        }
    }

    var pupper = Doggo("Koromaru", 20, "Shiba Inu")
    var wolf = Doggo("Biggy", 70, "Mega Doggo")

    println(pupper.name)
    println(pupper.weight)
    println(pupper.breed)
    pupper.bark()
}