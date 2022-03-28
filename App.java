import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

    
        // System.out.println("mi nombre es damian");
        // int edad = 25;
        // System.out.println("tengo " + edad +" años");
        // System.out.println("mi ciudad natal es santiago, chile");

        // int outInt; //podemos declarar la variable Sin establecer su valor
        
        // outInt = 400;

        // double pi = 3.1416;

        // boolean bool = true;
        
        // char unCaracter = 'a';

        // String multiplesCaracteres = "abcd";

        // //tipos de variables
        
        // Integer myInt = 5;
        
        // Double myDouble = 5.99;

        // Character myChar='a';
        // System.out.println(myInt);
        // System.out.println(myDouble);
        // System.out.println(myChar);

        // String myString = myInt.toString();
        // System.out.println(myString.length());

        // //Cadenas o Strings
        // String cadena= "buenos dias a todos mis companeros";
        // int length = cadena.length();
        // System.out.println("la longitud de mi cadena es de "+ length);

        // char letra = cadena.charAt(1);
        // System.out.println(letra);
    
        // int a = cadena.indexOf("buenos");
        // int b = cadena.indexOf("companeros");
        // int c = cadena.indexOf("hola");
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

        // System.out.println(cadena.toLowerCase());
        // System.out.println(cadena.toUpperCase());

        String str1 = "mi nombre es ";
        String str2 = "damian";
        String str3 = str1.concat(str2);
        System.out.println(str3);
        
        String x = "hola";
        String y = "hola";
        System.out.println( x == y);

        //arreglos arrays

        int[] myArray; //declaro mi arreglo
        myArray = new int[5];//inicializando
        myArray[0] = 4;
        myArray[1]=8;
        myArray[2]=3;
        myArray[3]= 5;
        myArray[4]=9;

        int[] myArray2 = {4,8,3,5,9};

        ArrayList<Integer> myArray3 = new ArrayList<Integer>();
        myArray3.add(10);
        
        boolean llueve =false;
        boolean soleado = true;

        if(llueve){
            System.out.println("lleva paraguas");

        }else if(soleado){
            System.out.println("ponte bloqueador");
        }else{
            System.out.println("disfruta tu dia");
        }

        llueve =true;
        if(llueve && soleado){
            System.out.println("busca un arco iris");
        }

        //bucles
        int i = 0;
        while(i<7){
            System.out.println(i);
            i++;
        }

        for(int j=0; j<7; j++){
            System.out.println("foo");
        }

        HelloWorld helloApp = new HelloWorld();
        System.out.println(helloApp.hola());
        System.out.println(helloApp.hola("damian "," cardenas"));

    }
}
