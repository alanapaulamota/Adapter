package com.alana.ps.adapter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasValidas {

	private byte dia;
	private byte mes;
	private short ano;

	Date hoje = new Date();
	String str = sdf.format(hoje);

	SimpleDateFormat A = new SimpleDateFormat("d");
	private byte diahj = (byte) Integer.parseInt(A.format(hoje));

	SimpleDateFormat B = new SimpleDateFormat("M");
	private byte meshj = (byte) Integer.parseInt(B.format(hoje));

	SimpleDateFormat C = new SimpleDateFormat("y");
	private short anohj = (short) Interger.parseInt(C.format(hoje));

	public Data(int dia, int mes, int ano){
    	setDia(dia);
    	setMes(mes);
    	setAno(ano);
    }

	public void setDia(int dia) {
		if (dia >= 1 && dia <= 31) {
			this.dia = (byte) dia;
		}
	}

	public void setMes(int mes) {
		if (mes >= 1 && mes <= 12) {
			switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (this.dia <= 31) {
					this.mes = (byte) mes;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (this.dia <= 30) {
					this.mes = (byte) mes;
				}
				break;
			case 2:
				if (this.anohj % 4 == 0 && this.anohj % 100 != 0 && this.dia <= 29) {
					this.mes = (byte) mes;

				} else if (thi.anohj % 4 != 0 && this.dia <= 28) {
					this.mes = (byte) mes;

				}
				break;
			}

		}
	}

	public void setAno(int ano) {
		if (ano >= 1900 && ano < this.anohj) {
			this.ano = (short) ano;
		} else if (ano == this.anohj) {
			if (this.mes == this.meshj && this.dia <= this.diahj) {
				this.ano = (short) ano;
			}

		}

	}

	public byte getDia() {
		return dia;
	}

	public byte getMes() {
		return mes;
	}

	public short getAno() {
		return ano;
	}

}
