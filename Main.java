/*    
 * NetBeans IDE 8.2
 * Universidad del Valle de Guatemala 04/02/17
 * Estructura de Datos:Hoja de trabajo 2
 *
 * Programa que recibe un texto.txt en postfix y devuelve el resultado de la operación
 * Haciendo uso de pila y listas 
*/
/*
 * @author Juan Carlos Solís Cruz-15564
 *         Jose Giovani- 
 */
public class Main {

   
    public static void main(String[] args) {
        
        
        Pila pila=new Pila();// creamos pila de tipo Pila
        Lista lista =  new Lista();// creamos lista de tipo lista 
        
        //+++++++++++++++++++++++Leemos el texto.text y lo guardamos en variable string+++++++++++++++++++++++++++++++///
        LeerTxt leer;
        leer = new LeerTxt();
	//Se agrega la direccion como parametro
	String expPostFix;
	expPostFix = leer.leerTxt("C:\\Users\\josgi\\Downloads\\HojaTrabajo_2\\Programa_NetBens\\src\\datos.txt");
	System.out.println("La expresión postFix ingresada es:" + expPostFix);

        
        
        
        //Ingresar la expresión posfija
        //String expPostFix="1 2 + 4 * 3 +";              //Variable que tiene el postFix 
        int longExp = expPostFix.length();     //Variable que contiene la longitud de el postFix
        int cima; //contiene el valor de la cima de la pila 
        
       String cadenaPila="";       //varable que obtiene los valores de pila, despues que cuentre unoperador aritmetico 
       int cuenta=0;
       
       
       
       
       
       
       
       
        char charPostFix;      
        int i=0;
        //Evaluamos todos los carateres de la expresion postfix
        while(i<longExp){
          // System.out.print(expPostFix.charAt(i));
           charPostFix=expPostFix.charAt(i);        //Guarda el carcater del index i en variable tipo char 
            //Verificamos que no sea un número, para luego convertirlo  string a número
            switch (charPostFix) {
                case '+':
                    //Sí es suma
                    //System.out.println("Más");
                    
                    int k=0;
                    int tamPilaAc=pila.tamanoPila(); //COntieen el tamano de la pila
                    int suma=0;
              
                    k=0;
                    while(k<(tamPilaAc)){
                        
                        //Guardamos los numeros que tiene la pila en un string
                        cadenaPila=Integer.toString(pila.cima()) +"," + cadenaPila; 
                        //Realizamos la suma 
                        suma=suma+ pila.sacar();
                        k++;
                    }
                    lista.agregarAlFinal(cadenaPila);  //agregamos a  la lista la cadena de la pila 
                    //cuenta =0;
                    cadenaPila="";
                    //Guardamos el resutlado de la suma en la pila
                    pila.empujar(suma);
                    lista.agregarAlFinal(Integer.toString(pila.cima())); //guardamos el valor de la pila actual a la fila 
                    
                    //System.out.println("\nLa suma es:" + suma );
                    
                  
                    break;
                    
                case '-':
                    //Sí es resta
                    //System.out.println("Operador menos");
                    k=0;
                    tamPilaAc=pila.tamanoPila(); //COntieen el tamano de la pila
                    int resta=0;
                    
                    while(k<(tamPilaAc)){
                       
                        resta=pila.sacar() - resta;
                        k++;
                    }
                    //Guardamos el resutlado de la suma en la pila
                    pila.empujar(resta);
                    //System.out.println("\nLa resta es:" + resta );
                    break;
                    
                case '*':
                    //Si es multiplicación
                    //System.out.println("Operador multiplicar");
                    k=0;
                    tamPilaAc=pila.tamanoPila(); //COntieen el tamano de la pila
                    int mul=1;
                    while(k<(tamPilaAc)){
                        //Guardamos los numeros que tiene la pila en un string
                        cadenaPila=Integer.toString(pila.cima()) +"," + cadenaPila;
                        mul=mul*pila.sacar();
                        k++;
                    }
                     lista.agregarAlFinal(cadenaPila);  //agregamos a  la lista la cadena de la pila 
                    //cuenta =0;
                    cadenaPila="";
                    //Guardamos el resutlado de la suma en la pila
                    pila.empujar(mul);
                    lista.agregarAlFinal(Integer.toString(pila.cima())); //guardamos el valor de la pila actual a la fila 
                    

                    //System.out.println("\nLa multiplicación es:" + mul );
                    break;
                    
                    
                case '/':
                    //SI es division
                   // System.out.println("Operador dividir");
                    int denominador = pila.sacar();
                    int numerador=pila.sacar();
                    int div= numerador/denominador;
                    //GUuardamos el resultado de la división a la pila
                    pila.empujar(div);
                    //System.out.println("\nLa división es:" + div);
                    break;
                    
                    
                case ' ':
                    //Si es espacio en blanco
                   // System.out.println("Espacio en blanco");
                    break;
                    
                default:
                    //De lo contrario significa que es un número ]
                    //System.out.println("Es un número ");
                    
                    //COnvertimos de numero char a int,para poder operar 
                    char numeroChar=charPostFix;            //numero caracter  a convertir
                    String stringNumero=Character.toString(numeroChar);
                    int numero=Integer.parseInt(stringNumero);
                    
                    
                    //Introducimos numero a la pila
                    pila.empujar(numero);
                    
                    
                    if (cuenta==0){
                        lista.agregarAlFinal(Integer.toString(pila.cima())); 
                        cuenta=1;
                    }
                    //
                    
                    
                    break;
                    
                    
                    
            }//Fin del switch
           i++;             //Aumentamos el contador
           }//Fin del while 
        
        //Mostramos los datos de la pila
        System.out.print("Resultado:");
        int j=0;
        int tamanoPila=pila.tamanoPila();
         while(j<tamanoPila){
            System.out.print(pila.sacar());
            j++;
        }
         
         
        // System.out.println("\nLa cadena es:" + cadenaPila);
         //Mostrar lista
         System.out.println("\nPILA:");
         lista.mostrarLista();
          
        
       
        
        
     
       
        
        
        
           
        }//fin de public main 
}//fin java class main

        
      
        
