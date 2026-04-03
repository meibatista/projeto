package br.com.ucsal.olimpiadas;

import java.util.Arrays;

public class Questao {

	private long id;
	private long provaId;

	private String enunciado;
	private String[] alternativas;
	private char alternativaCorreta;

	private String fenInicial;

	public Questao() {
		this.alternativas = new String[5];
	}

	// ================= GETTERS / SETTERS =================

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getProvaId() {
		return provaId;
	}

	public void setProvaId(long provaId) {
		this.provaId = provaId;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String[] getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(String[] alternativas) {
		validarAlternativas(alternativas);
		this.alternativas = Arrays.copyOf(alternativas, 5);
	}

	public char getAlternativaCorreta() {
		return alternativaCorreta;
	}

	public void setAlternativaCorreta(char alternativaCorreta) {
		this.alternativaCorreta = normalizarAlternativa(alternativaCorreta);
	}

	public String getFenInicial() {
		return fenInicial;
	}

	public void setFenInicial(String fenInicial) {
		this.fenInicial = fenInicial;
	}

	// ================= REGRAS DE NEGÓCIO =================

	public boolean isRespostaCorreta(char resposta) {
		char alternativa = normalizarAlternativa(resposta);
		return alternativa == this.alternativaCorreta;
	}

	// ================= VALIDAÇÕES =================

	private void validarAlternativas(String[] alternativas) {
		if (alternativas == null || alternativas.length != 5) {
			throw new IllegalArgumentException("A questão deve ter 5 alternativas.");
		}
	}

	public static char normalizarAlternativa(char c) {
		char letra = Character.toUpperCase(c);

		if (letra < 'A' || letra > 'E') {
			throw new IllegalArgumentException("Alternativa inválida (use A até E)");
		}

		return letra;
	}
}
