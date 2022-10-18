class Carnivores(
    denomination: String,
    family: String,
    food: String, midlifespan: String, var apexPredator: Boolean, var omnivorous: Boolean
) : Animal(denomination, family, food, midlifespan) {
    override fun toString(): String {
        return "Animal(denomination: '$denomination', family - '$family', food - '$food', midlifespan - '$midlifespan', apexPredator - '$apexPredator', omnivorous - '$omnivorous')"
    }
}