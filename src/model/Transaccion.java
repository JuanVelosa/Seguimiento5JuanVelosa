package model;

import java.util.Date;

public class Transaccion {
	private double monto;
	private String desc;
	private Type tipo;
	private Date fecha;
	
	public Transaccion(double monto, String desc, Type tipo, Date fecha) {
		this.monto = monto;
		this.desc = desc;
		this.tipo = tipo;
		this.fecha = fecha;
	}
	
	
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Type getTipo() {
		return tipo;
	}
	public void setTipo(Type tipo) {
		this.tipo = tipo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
