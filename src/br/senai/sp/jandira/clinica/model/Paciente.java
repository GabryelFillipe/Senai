/*
 * PROGRAMADOR: Gabryel 
 * DATA: 26/02/2025
 * EMPRESA: Senai
 */

package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {

	private String nome;
	public LocalDate dataNascimento;
	public int peso;
	private double altura;
	public String telefone;
	private double imc;
	
	public void setNome(String nome) {

		if(nome.length() >= 3) {
			// True, caso o nome esteja dentro da regra definida, ter trés caracteres ou mais
			this.nome = nome.toUpperCase();
		} else {
			// False, caso o nome não esteja dentro da regra definide, ter trés caracteres ou mais
			System.out.println("\nO nome " + nome + ", não é válido!\nO nome deve conter pelo menos 3 caracteres!\n");
		}
		
	}
	public void setAltura(double altura) {
		if(altura>= 0) {
			// True, caso a altura esteja preenchida corretamente
			this.altura =altura;
		}else {
			// False, caso a altura seja negativa
			System.out.println("\nA altura do(a) paciente " + nome + ":\nA Altura " + altura+ ", não é válida :(\nA altura deve ser um número positivo");
		}
	}

	
	public void calcularIdade() {
		
	}
	
	private double calcularImc() {
		imc =peso / Math.pow(altura, 2);
		return imc ;
		// Calculando Imc dos pacientes
	}
	
	public void classificarImc() {
		
	}
	
	public void mostrarFichaDoPaciente() {
		System.out.println("======================");
		System.out.println("DADOS DO PACIENTE");
		System.out.println("======================");
		System.out.println("Nome:" +nome);
		System.out.println("Peso:" +peso);
		System.out.println("Altura:" +altura);
		System.out.println("IMC:" + String.format("%.1f", calcularImc()) );
		System.out.println("Data de Nascimento:" +dataNascimento);
		System.out.println("Telefone: " +telefone);
		System.out.println("======================");
		System.out.println();
		
	}
}
