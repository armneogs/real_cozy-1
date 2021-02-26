package com.realcozy.model;
// Generated Jun 9, 2020 1:26:19 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Formula generated by hbm2java
 */
@Entity
@Table(name = "formula", schema = "public")
public class Formula implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7972293139702749100L;
	private int formulaPk;
	private String formulaLatex;

	public Formula() {
	}

	public Formula(int formulaPk) {
		this.formulaPk = formulaPk;
	}

	public Formula(int formulaPk, String formulaLatex) {
		this.formulaPk = formulaPk;
		this.formulaLatex = formulaLatex;
	}

	@Id

	@Column(name = "formula_pk", unique = true, nullable = false)
	public int getFormulaPk() {
		return this.formulaPk;
	}

	public void setFormulaPk(int formulaPk) {
		this.formulaPk = formulaPk;
	}

	@Column(name = "formula_latex")
	public String getFormulaLatex() {
		return this.formulaLatex;
	}

	public void setFormulaLatex(String formulaLatex) {
		this.formulaLatex = formulaLatex;
	}

}
