public class Cafe {
    public static void main(String[] args) throws Exception {
        // VARIABLES DE LA APP
        // Líneas de texto que aparecerán en la app 
        String saludoGeneral = "Bienvenido al Café Java, ";
        String mensajePendiente = ", tu pedido estará listo en breve";
        String mensajeListo = ", tu pedido está listo ";
        String mensajeMostrarTotal = "Tu total es $";
        
        // Variables de menú (agrega las tuyas a continuación)
        double precioFiltrado = 40.5;
        double precioCapuchino = 4.1;
        double precioCafeConLeche = 4.2;

    
        // Variables de nombre de cliente (agrega las tuyas a continuación)
        String cliente1 = "cindhuri";
        String cliente2 = "noah";
        String cliente3 = "sam";
        String cliente4 = "jimmy";

        // Finalizaciones de pedidos (agrega las tuyas a continuación)
        boolean estaListoOrden1 = false;
        boolean estaListoOrden2 = true;
        boolean estaListoOrden3 = true;
        boolean estaListoOrden4 = false;
    
        // SIMULACIÓN DE INTERACCIÓN DE APP(Agrega tu código para los desafíos a continuación)
        // Ejemplo:

        System.out.println(saludoGeneral + cliente1);
        if(estaListoOrden1 == false){
            System.out.println(cliente1 + mensajePendiente);
        }else if(estaListoOrden1 == true){
            System.out.println(cliente1 + mensajeListo + mensajeMostrarTotal + precioFiltrado);
        }

        System.out.println("-------------------------");

        System.out.println(saludoGeneral + cliente2);
        if(estaListoOrden2 == true){
            System.out.println(cliente2 + mensajeListo +mensajeMostrarTotal+ precioCapuchino);
        }else if(estaListoOrden2 == false){
            System.out.println(cliente2 + mensajePendiente);
        }

        System.out.println("-------------------------");

        double total= precioCafeConLeche + precioCafeConLeche;

        System.out.println(saludoGeneral + cliente3);
        if(estaListoOrden3 == true){
            System.out.println(cliente3 + mensajeListo + mensajeMostrarTotal +total );
        }else if(estaListoOrden3 == false){
            System.out.println(cliente3 + mensajePendiente);
        }

        System.out.println("-------------------------");
        double resta = precioFiltrado - precioCafeConLeche;

        System.out.println(mensajeMostrarTotal + resta);



        // if(estaListoOrden2 == false){
        //     System.out.println(cliente1 + mensajePendiente);

        // }else(estaListoOrden2 == true){
        //     System.out.println(cliente2 + mensajeListo);
        // }

        // if(estaListoOrden3 == false){
        //     System.out.println(cliente1 + mensajePendiente);

        // }else(estaListoOrden3 == true){
        //     System.out.println(cliente3 + mensajeListo);
        // }

         // Muestra "Bienvenido a Café Java, Cindhuri"
    	
        // ** Las sentencias print sobre las interacciones con el cliente irán aquí ** //
    
    }
}