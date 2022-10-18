open class Animal constructor(
    var denomination: String,
    var family: String, var food: String, var midlifespan: String
) {
    override fun toString(): String {
        return "Animal(denomination: '$denomination', family - '$family', food - '$food', midlifespan - '$midlifespan')"
    }
}


