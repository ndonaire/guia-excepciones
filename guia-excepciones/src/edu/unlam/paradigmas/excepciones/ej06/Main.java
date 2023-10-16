package edu.unlam.paradigmas.excepciones.ej06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			File doc = new File("C:\\Users\\EDONAIRE\\Desktop\\archivo.txt");
			Scanner obj = new Scanner(doc);
			String arch2 = obj.nextLine().toString();
			try {
				File doc2 = new File("C:\\Users\\EDONAIRE\\Desktop\\" + arch2);
				Scanner obj2 = new Scanner(doc2);

				while (obj2.hasNextLine())
					System.out.println(obj2.nextLine());

				System.out.println("Cerrando archivo 2...");
				obj2.close();
			} catch (FileNotFoundException e) {
				System.out.println("Archivo 2 no encontrado");
			}

			System.out.println("Cerrando archivo 1...");
			obj.close();

		} catch (FileNotFoundException e) {
			System.out.println("Archivo 1 no encontrado");
		}
	}
}
