package de.kba.demo2.demo2.entity

class Currency(name: String, currencyFactorMap: HashMap<String, Double>) {

    val name: String? = name
    private val currencyFactorMap: HashMap<String, Double>? = currencyFactorMap


    fun calculateExchangeCurrencyValue(toCurrencyName: String, value: Double): Double? {
        val currencyFactor = currencyFactorMap?.get(toCurrencyName) ?: return null
        return currencyFactor*value
    }
}