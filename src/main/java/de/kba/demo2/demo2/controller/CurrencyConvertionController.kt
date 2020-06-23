package de.kba.demo2.demo2.controller

import de.kba.demo2.demo2.entity.SampleData
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CurrencyConvertionController {
    @RequestMapping(
            method = [RequestMethod.GET],
            path = ["/convertion"])
    fun calculateCurrency(@RequestParam fromCurrency: String, @RequestParam toCurrency: String, @RequestParam value: Double): String {
        val currencyFrom = SampleData.currencyList.firstOrNull {
            it.name == fromCurrency
        } ?: return "No corresponding currency found in datasource."
        val calculatedCurrency = currencyFrom.calculateExchangeCurrencyValue(toCurrency, value) ?: return "No corresponding convertion currency found in datasource."
        return "$value $fromCurrency are $calculatedCurrency $toCurrency"
    }
}