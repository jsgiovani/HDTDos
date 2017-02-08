import java.io.BufferedReader;
import java.io.FileReader;

import javax.annotation.processing.Messager;

public class LeerTxt {
	String texto= "";
	
	public String leerTxt(String direccion){  //Direccion donde esta hubicado el archivo txt
		try{
			BufferedReader bf = new BufferedReader(new FileReader(direccion));
			String temporal = "";
			String bfReader;
			//Se realiza el siclo mientras bfReader aun contiene datos
			while((bfReader=bf.readLine()) != null){
				temporal = temporal + bfReader;
			
			}
			texto = temporal;			
			
		} catch (Exception e){
			
			System.err.println("No se encontro el archivo txt solicitado");
		}
		return texto;
	}
}
