package com.xrupee

class ExchangeRate 
{
	String amount;
	BigDecimal rate;

    static constraints = {
		amount(blank:false)
		rate(blank:false)
    }
}
