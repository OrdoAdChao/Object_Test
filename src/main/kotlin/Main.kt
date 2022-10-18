fun main() {

    val lion = Carnivores("Lion", "Feline", "Carnivore", "8-16 years", apexPredator = true, omnivorous = false)
    val wolf = Carnivores("Wolf", "Canine", "Carnivore", "13-15 years", apexPredator = false, omnivorous = true)
    val gorilla = Herbivores("Gorilla", "Primate", "Herbivore", "35-40 years", dangerous = true, insectivorous = true)
    val mouse = Herbivores("Mouse", "Murinae", "Herbivore", "2-3 years", dangerous = false, insectivorous = true)
    println()
    println(lion)
    println()
    println(wolf)
    println()
    println(gorilla)
    println()
    println(mouse)


}