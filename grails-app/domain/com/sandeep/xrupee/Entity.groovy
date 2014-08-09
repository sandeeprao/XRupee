package com.sandeep.xrupee

class Entity
 {
	 String name;
	 List<ExchangeRate> rates;

    static constraints =
	 {
		 name(blank:false)
	 }
    }
