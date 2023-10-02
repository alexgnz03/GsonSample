//Imports
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//Main
public class Main {

	public static void main(String[] args) {

		//TODO: Creación de Persona y asignación de datos
		
		//Creamos nueva Persona
		Persona p = new Persona(); 
		
		//Creamos Scanner
		Scanner entrada = new Scanner(System.in);
		
		//Usamos Scanner para asignar los valores
		System.out.println("Introduzca Nombre: ");
		p.setNombre(entrada.nextLine());
		System.out.println("Introduzca Apellidos: ");
		p.setApellidos(entrada.nextLine());
		System.out.println("Introduzca Edad: ");
		p.setEdad(entrada.nextInt());
		
		
		//TODO: Convertir la Persona a JSON
		
		//Creamos un Gson con formato
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		//Creamos un String con los valores asignados a los datos de 'p'
		String jsonString = gson.toJson(p);
		
		//Imprimimos el String de 'p'
		System.out.println(jsonString);
		
		
		//TODO: Guardar el Json en fichero (No sabía si hacía falta así que lo hice por si acaso y para aprender)
		
		//Crear y escribir fichero
		try (PrintWriter pw = new PrintWriter(new File("persona.json"))){
			pw.write(jsonString); //Escribir los datos en el fichero
			pw.close(); //Mandar los datos al nuevo fichero y cerrar (.flush() hace lo mismo pero no cierra)
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
		//Cerramos Scanner
		entrada.close();
	}
	
}
