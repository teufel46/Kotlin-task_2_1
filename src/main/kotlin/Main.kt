fun main(args: Array<String>) {

    val transferAmount = 8000_00
    val commissionPercentage = 0.0075
    val minCommission = 3500

    val commissionCalc = (transferAmount * commissionPercentage).toInt()
    val commission = if (commissionCalc < minCommission) minCommission else commissionCalc
    println("""Задача №1 - Денежные переводы
============================================
  Сумма перевода:  $transferAmount коп
  Размер комиссии: $commission коп
============================================
    """.trimIndent())


}