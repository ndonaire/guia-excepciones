package edu.unlam.paradigmas.excepciones.ej07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		try (Scanner obj = new Scanner(new File("C:\\Users\\EDONAIRE\\Desktop\\archivo.txt"))) {
			String arch2 = obj.nextLine().toString();

			try (Scanner obj2 = new Scanner(new File("C:\\Users\\EDONAIRE\\Desktop\\" + arch2))) {
				while (obj2.hasNextLine())
					System.out.println(obj2.nextLine());

				System.out.println("Cerrando archivo 2...");
				obj2.close();
			} catch (FileNotFoundException e) {
				System.out.println("Archivo 2 no encontrado");
				e.printStackTrace();
			}
			System.out.println("Cerrando archivo 1...");
			obj.close();

		} catch (FileNotFoundException e) {
			System.out.println("Archivo 1 no encontrado");
			e.printStackTrace();
		}
	}
}
