package de.kba.demo2.demo2.entity

object SampleData {
    val currencyList = ArrayList<Currency>()

    private val dollarCurrency: Currency
    get() {
        val name = "Dollar"
        val dollarHashmap = HashMap<String, Double>()
        dollarHashmap["Euro"] = 0.89
        dollarHashmap["Yen"] = 106.89
        return Currency(name, dollarHashmap)
    }

    private val euroCurrency: Currency
    get() {
        val name = "Euro"
        val euroHashmap = HashMap<String, Double>()
        euroHashmap["Dollar"] = 1.13
        euroHashmap["Yen"] = 120.41
        return Currency(name, euroHashmap)
    }

    private val yenCurrency: Currency
    get() {
        val name = "Yen"
        val yenHashmap = HashMap<String, Double>()
        yenHashmap["Dollar"] = 0.0094
        yenHashmap["Euro"] = 0.0083
        return Currency(name, yenHashmap)
    }

    init {
        currencyList.add(dollarCurrency)
        currencyList.add(euroCurrency)
        currencyList.add(yenCurrency)
    }

    fun getCurrencyByName(name: String): Currency? {
        return currencyList.firstOrNull {
            it.name == name
        }
    }
}