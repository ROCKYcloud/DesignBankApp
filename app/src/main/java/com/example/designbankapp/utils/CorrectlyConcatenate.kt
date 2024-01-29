package com.example.designbankapp.utils

import java.text.DecimalFormat

fun currencyBalance(typeCurrency:String, currency:Double):String{
    val sb = StringBuilder()
    sb.append(typeCurrency).append(formatCurrency(currency))
    return sb.toString()
}

fun formatCurrency(amount:Double):String{
    val numberFormat = DecimalFormat("#,###.00")
    return numberFormat.format(amount)
}

