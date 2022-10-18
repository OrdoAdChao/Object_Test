class Herbivores(
    denomination: String,
    family: String,
    food: String, midlifespan: String, var dangerous: Boolean, var insectivorous: Boolean
) : Animal(denomination, family, food, midlifespan) {
    override fun toString(): String {
        return "Animal(denomination: '$denomination', family '$family', food - '$food', midlifespan - '$midlifespan', dangerous - '$dangerous', insectivorous - '$insectivorous')"
    }
}

