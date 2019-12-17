fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 89
    var isBlessed = true
    val isImmortal = false

    //aura
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"

    //Player Status
    println("(Aura: $auraColor) " +
            "(Blessed: ${if(isBlessed) "YES" else "NO"})")

    val  healthStatus = when (healthPoints) {
        100 -> "is in excellent condition"
        in 90..99 -> "has few scratches."
        in 75..89 -> if (isBlessed) {
            "has minor wounds but is healing quite quickly!"
        } else {
            "has few scratches."
        }
        in 15..74 -> "looks pretty hurts"
        else -> "is in awful condition"


    }
    println("$name $healthStatus")
}