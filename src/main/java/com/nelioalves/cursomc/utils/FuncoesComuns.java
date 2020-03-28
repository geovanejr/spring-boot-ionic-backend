package com.nelioalves.cursomc.utils;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FuncoesComuns {

	public String formataValor(Double valor) {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		
		return nf.format(valor);
	}
	
	public String formataData(Date data) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		
		return sdf.format(data);
	}
}
