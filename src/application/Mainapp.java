package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Mainapp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas aulas tem o curso? ");
		int n = Integer.parseInt(sc.nextLine());
		int soma = 0;
		ArrayList<Lesson> lista = new ArrayList<Lesson>();
		
		for(int i=0; i<n; i++) {
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char res = sc.next().charAt(0);
			sc.nextLine();
			if(res == 'c') {
				System.out.print("Titulo: ");
				String titulo = sc.nextLine();
				System.out.print("URL do vídeo: ");
				String url = sc.nextLine();
				System.out.print("Duração em segundos: ");
				int sec = Integer.parseInt(sc.nextLine());
				
				lista.add(new Video(titulo, url, sec));
				soma += lista.get(i).duration();
				
			}else {
				System.out.print("Titulo: ");
				String titulo = sc.nextLine();
				System.out.print("Descrição: ");
				String desc = sc.nextLine();
				System.out.print("Quantidade de questões: ");
				int quest = Integer.parseInt(sc.nextLine());
				
				lista.add(new Task(titulo, desc, quest));
				
				soma += lista.get(i).duration();
			}
			
		}
		
		System.out.println("DURAÇÃO TOTAL DO CURSO = "+soma+" segundos");
		
		sc.close();
		
	}

}
