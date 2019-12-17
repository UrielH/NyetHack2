fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 89
    var isBlessed = true
    val isImmortal = false

    //aura
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    //Player Status
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)

    castFireBall()
}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String =
    when (healthPoints) {
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


private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    println(
        "(Aura: $auraColor) " +
                "(Blessed: ${if (isBlessed) "YES" else "NO"})"
    )
    println("$name $healthStatus")
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String {
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    return auraColor
}

private fun castFireBall(fireBalls: Int = 2) =
    println("A class of Fireball springs into existence. (x$fireBalls)")


