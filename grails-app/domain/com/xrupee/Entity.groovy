package com.xrupee

class Entity
 {
	 String name;
	 List<ExchangeRate> rates;

    static constraints =
	 {
		 name(blank:false)
	 }
    }
