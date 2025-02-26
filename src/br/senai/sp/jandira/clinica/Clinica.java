package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {

	public static void main(String[] args) {
		
		
		System.out.println("Clinica do Byel!\nSeja Bem-vindo :)");
		
		// Criando um obejto paciente
		
		Paciente p1 = new Paciente();
		p1 .setNome("jó Silva");
		p1 .setAltura(1.65);
		p1.peso = 90;
		p1.telefone = "(11)99999-8888";
		p1.dataNascimento = LocalDate.of(2003, 7, 15);
		
		
		Paciente p2 = new Paciente();
		p2 .setNome("Gabryel Fillipe");
		p2 .setAltura(1.75);
		p2.peso = 55;
		p2.telefone = "(11)4002-8922";
		p2.dataNascimento = LocalDate.of(2007, 4, 4);
		
		// exibindo a localizaçao dos objetos
		System.out.println(p1);
		System.out.println(p2);
		
		Paciente p3 = p1;
		
		System.out.println(p3);
		
		// exibindi os dados dos objetos
		
		p1.mostrarFichaDoPaciente();
		p2.mostrarFichaDoPaciente();
	}

}
