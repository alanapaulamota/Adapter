package com.alana.ps.adapter;

import org.graalvm.compiler.code.DataSection.Data;

public class DataAdapter extends Data {
		
		public Data(int dia, int mes, int ano){
	    	super.setDia(dia);
	    	super.setMes(mes);
	    	super.setAno(ano);
	    }

		public void setDia(int dia){
	        super.setDia(dia);
		}

		public void setMes(int mes){
		    super.setMes(mes);
		}

		public void setAno(int ano){
		    super.setAno(ano);
		}

		public byte getDia(){
		    return super.getDia;
		}

		public byte getMes(){
		    return super.getMes;
		}

		public short getAno(){
		    return super.getAno;
		}

		public String toString(){
		    return super.getAno + "/" + super.getMes + "/" + super.getDia;
		}
	}

}
