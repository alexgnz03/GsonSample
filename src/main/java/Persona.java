import com.google.gson.annotations.SerializedName;

public class Persona {

		//Variables (@SerializedName asigna el nombre de variable que se mostrará en el json)
		@SerializedName("nombre")
		private String Nombre;
		@SerializedName("apellidos")
		private String Apellidos;
		@SerializedName("edad")
		private int Edad;
		
		
		//Sets and Gets
		
		//Nombre
		public String getNombre() {
			return Nombre;
		}
		
		public void setNombre(String Nombre) {
			this.Nombre = Nombre;
		}
		
		//Apellidos
		public String getApellidos() {
			return Apellidos;
		}
		
		public void setApellidos(String Apellidos) {
			this.Apellidos = Apellidos;
		}
		
		//Edad
		public int getEdad() {
			return Edad;
		}
		
		public void setEdad(int Edad) {
			this.Edad = Edad;
		}
		
	
}
