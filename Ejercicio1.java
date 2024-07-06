package Arreglos;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        // variables
        String nombre; // nombre del colaborador
        String incidencia; // datos de la incidencia
        String NiveldeTicket; // nivel del ticket
        int Opcion; // opcion a elegir
        int RespuestadeAtencion;
        int NumeroDeTicket=104; // iniciando el ticket con 104
        int TicketAAnular; // Ticket a cerrar
        int BuscarNumeroDeTicket; // buscar numero de ticket
        boolean continuar = true; // boolean que indica que cantidad es verdadero.
        String Respuesta; // respuesta si continua el proceso o no.
        LocalTime horaInicial = LocalTime.of(13, 30); // Hora de inicio del nuevo ticket a crear : 13:30

        // Creacion de Listas
        List<Integer>ListaTicket = new ArrayList<>();
        List<String>ListaDatosColaborador = new ArrayList<>();
        List<String>ListaIncidencia = new ArrayList<>();
        List<String>ListaNivveldeIncidencia = new ArrayList<>();
        List<Integer>ListaTicketAnulados = new ArrayList<>();
        List<LocalTime>ListaHoraDeAtencion = new ArrayList<>();


        // Añadiendo datos a la lista de tickets
        ListaTicket.add(101);
        ListaTicket.add(102);
        ListaTicket.add(103);
        ListaTicket.add(104);

        // Añadiendo datos a la lista de colaboradores
        ListaDatosColaborador.add("Bryan Flores");
        ListaDatosColaborador.add("Jhon Rivera");
        ListaDatosColaborador.add("Cesar Zapata");
        ListaDatosColaborador.add("Ethan Tenorio");

        // Añadiendo datos a la lista de incidencias
        ListaIncidencia.add("Instalacion de programas");
        ListaIncidencia.add("Instalacion de programas");
        ListaIncidencia.add("Instalacion de programas");
        ListaIncidencia.add("Instalacion de programas");

        // Añadiendo Horas de atencion de tickets

        ListaHoraDeAtencion.add(LocalTime.of(9, 30)); // hora de inicio de ticket
        ListaHoraDeAtencion.add(LocalTime.of(10, 30));// hora de inicio de ticket
        ListaHoraDeAtencion.add(LocalTime.of(11, 30));// hora de inicio de ticket
        ListaHoraDeAtencion.add(LocalTime.of(12, 30));// hora de inicio de ticket

    while(continuar) { // Mientras que continuar sea True se dará el ciclo
        // Eligiendo opciones
        System.out.println("********BIENVENIDO USUARIO********");
        System.out.println("Ingrese opcion");
        System.out.println("1.Crear");
        System.out.println("2.Cerrar ticket");
        System.out.println("3.Tickets abiertos");
        System.out.println("4.Tickets cerrados");
        System.out.println("5.Buscar ticket");
        System.out.print("Ingrese respuesta: ");
        Opcion=entrada.nextInt();
        //Consumir el salto de línea pendiente después de nextInt()
        entrada.nextLine();
        switch (Opcion) { // Creamos un switch para las opciones
            case 1:// CREAR TICKETS DE INCIDENCIA
                NumeroDeTicket = NumeroDeTicket + 1; // Aumentar en 1 el valor del numero de ticket.
                ListaTicket.add(NumeroDeTicket);
                System.out.print("Ingrese nombre de colaborador: ");
                nombre = entrada.nextLine();
                ListaDatosColaborador.add(nombre);
                System.out.println("Marque el número según su tipo de incidencia: ");
                System.out.println("1: Instalacion de programas"); // 1: Rango de atencion de ticket.(intervalo 1 hora)
                System.out.println("2: Errores en programas instalados"); // 2: Rango de atencion de ticket.(intervalo 3 horas)
                System.out.println("3: Fallas en laptop/pc");// 3: Rango de atencion de ticket.(intervalo 3 horas)
                System.out.print("Digite respuesta: ");
                RespuestadeAtencion = entrada.nextInt();
                entrada.nextLine();
                if(RespuestadeAtencion==1){
                    System.out.println("******* TICKET *******");
                    System.out.println("Nombre de colaborador: " + nombre);
                    String detalleDeincidencia="Instalacion de programas";
                    ListaIncidencia.add(detalleDeincidencia);
                    System.out.println("Detalle de incidencia: " + detalleDeincidencia);
                    System.out.println("Se creó el ticket : " + NumeroDeTicket);
                    System.out.println("Hora de atención de Ticket: " + horaInicial);
                    System.out.println("******* ****** *******");
                    ListaHoraDeAtencion.add(horaInicial);
                    horaInicial=horaInicial.plusHours(1); // Hora que estaría para el sgte ticket.
                } else if (RespuestadeAtencion==2) {
                    System.out.println("******* TICKET *******");
                    System.out.println("Nombre de colaborador: " + nombre);
                    String detalleDeincidencia="Errores en programas instalados";
                    ListaIncidencia.add(detalleDeincidencia);
                    System.out.println("Detalle de incidencia: " + detalleDeincidencia);
                    System.out.println("Se creó el ticket : " + NumeroDeTicket);
                    System.out.println("Hora de atención de Ticket: " + horaInicial);
                    System.out.println("******* ****** *******");
                    ListaHoraDeAtencion.add(horaInicial);
                    horaInicial=horaInicial.plusHours(2);
                } else if (RespuestadeAtencion==3){
                    System.out.println("******* TICKET *******");
                    System.out.println("Nombre de colaborador: " + nombre);
                    String detalleDeincidencia="Fallas en laptops / PC ";
                    ListaIncidencia.add(detalleDeincidencia);
                    System.out.println("Detalle de incidencia: " + detalleDeincidencia);
                    System.out.println("Se creó el ticket : " + NumeroDeTicket);
                    System.out.println("Hora de atención de Ticket: " + horaInicial);
                    System.out.println("******* ****** *******");
                    ListaHoraDeAtencion.add(horaInicial);
                    horaInicial=horaInicial.plusHours(3);
                }else{
                    System.out.println("El numero digitado es incorrecto:");
                }
                break;
            case 2:// CERRAR UN TICKET DE SOLICITUD.
                System.out.print("Favor de digitar el N° de ticket a cerrar: ");
                TicketAAnular = entrada.nextInt();
                entrada.nextLine();
                int PalabraAnular=0;
                ListaTicketAnulados.add(TicketAAnular);
                for(int i=0;i<ListaTicket.size();i++){
                    if(ListaTicket.get(i)==TicketAAnular){
                        ListaTicket.set(i,PalabraAnular);
                    }
                }
                System.out.println("Ticket " + TicketAAnular + " anulado.");
                break;
            case 3: // Mostrar Lista de ticket abiertos
                System.out.println("Tickets pendientes: " + ListaTicket);
                break;
            case 4: // Mostrar lista de tickets cerrados
                System.out.println("Tickets cerrados: " + ListaTicketAnulados);
                break;
            case 5:// Buscar ticket y mostrar todos sus datos.
                System.out.print("Ingresar numero de ticket:");
                BuscarNumeroDeTicket=entrada.nextInt();
                entrada.nextLine();
                for(int j=0;j<ListaTicket.size();j++) { // Recorrer la lista de tickets
                    if (ListaTicket.get(j) == BuscarNumeroDeTicket) { // si el N° de ticket está dentro de la lista de tickets
                        System.out.println("****** DATOS DEL TICKET ******");
                        System.out.println("Ticket: " + ListaTicket.get(j));
                        System.out.println("Colaborador: " + ListaDatosColaborador.get(j));
                        System.out.println("Detalle de incidencia: " + ListaIncidencia.get(j));
                        System.out.println("Hora de atención de Ticket: " + ListaHoraDeAtencion.get(j));
                        System.out.println("*******************************");
                    }
                }
                break;
            default: // de elegir un numero no contenido dentro de las opciones.
                System.out.println("Opción no válida. Por favor ingresar otra opcion.");
                break;
        }
        // Preguntar si desea continuar
        System.out.print("¿Desea continuar? (si/no): ");
        Respuesta = entrada.nextLine();
        if (Respuesta.equals("no")) {
            continuar = false;
            System.out.println("Programa finalizado.");
            entrada.close();
        }
    }
    }
}
