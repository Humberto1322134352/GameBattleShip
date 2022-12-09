package battleship;
import java.util.Scanner;
public class BATTLESHIP {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String nomuno, nomdos;
        int n, m, f, c, barcosuno, barcosdos;
        boolean turno;
        
        System.out.println("**********Bievenido a Battle ship**********");
        
        //definir nombres
        System.out.print("Dime tu nombre jugador 1: ");
        nomuno = leer.nextLine();
        
        System.out.print("Dime tu nombre jugador 2: ");
        nomdos = leer.nextLine();
        
        //definir los tablero (matrices)
        System.out.println("\nPerfecto jugadores, ahora diganme las dimensiones de su campo de batalla?");
        System.out.println("ingresas un numero y automaticamente sera n x n");
        n = leer.nextInt() + 1;
        m = n;
        
        //Tableros (matrices) que ven los jugadores
            int tablerojugadoruno[][] = new int [n][m];
            int tablerojugadordos[][]= new int [n][m];
            
        //Tableros (matrices) que contienen los barcos
            int tablerouno[][] = new int [n][m];
            int tablerodos[][] = new int [n][m];
        
        //Definir los barcos(vectores)
        System.out.println("\nEstamos ajustando los preparativos, pero... Cuantos barcos iran a la batalla?");
        System.out.println("puedes escoger desde 1 a 4");
        System.out.println("el primer barco siempre sera de 4 espacios sin importar el numero de barcos que haya escogido");
        System.out.println("Ademas, el numero de barcos que escojan sera para ambos jugadores");
        barcosuno = leer.nextInt();
        barcosdos = barcosuno;
        
        int p = 1;
        
        //Agregar los barcos al jugador 1
        while(barcosuno > 0){
        
        System.out.println("\nMuy bien. Ahora " + nomuno + ", que orientacion tomara el barco: " + p);
            System.out.println("Ingrese el numero correspondiente");
            System.out.println("1 = vertical           2 = horizontal");
            int o = leer.nextInt();
            
            //orientacion vertical
            if(o == 1){
                int [] barco = new int[1];
                barco[0] = 1;
                
            System.out.println("Muy bien. Que posicion tomara este barco");
            
            String tabla = "";
            
                for (int i = 0; i < tablerojugadoruno.length; i++) {
                    for (int j = 0; j < tablerojugadoruno.length; j++) {
                        tabla = tabla + "|" + tablerojugadoruno[i][j];
                    }
                    tabla = tabla + "|\n";
                }
                System.out.println(tabla);
        
            System.out.println("Primero la fila");
            f = leer.nextInt();
            System.out.println("y luego la columna");
            c = leer.nextInt();
            
                System.out.println("");
                
            int suma = 0;
                for (int i = 0; i <= barcosuno; i++) {
                    tablerojugadoruno[f + suma][c] = barco[0];
                    suma++;
                }
                
                System.out.println("");
                
                for (int i = 0; i < tablerojugadoruno.length; i++) {
                    for (int j = 0; j < tablerojugadoruno.length; j++) {
                        tabla = tabla + "|" + tablerojugadoruno[i][j];
                    }
                    tabla = tabla + "|\n";
                }
                System.out.println(tabla);
            }
            
            System.out.println("");
            
            //orientacion horizontal
            if(o == 2){
                int [] barco = new int [1];
                barco[0] = 1;
                
        System.out.println("Muy bien. Ahora, que posicion tomara el barco");
        
            String tabla = "";
            
                for (int i = 0; i < tablerojugadoruno.length; i++) {
                    for (int j = 0; j < tablerojugadoruno.length; j++) {
                        tabla = tabla + ("|" + tablerojugadoruno[i][j]);
                    }
                    tabla = tabla + "|\n";
                }
                System.out.println(tabla);
        
            System.out.println("Primero la fila");
            f = leer.nextInt();
            System.out.println("y luego la columna");
            c = leer.nextInt();
            
            int suma = 0;
                for (int i = 0; i <= barcosuno; i++) {
                    tablerojugadoruno[f][c + suma] = barco[0];
                    suma++;
                }
                
                
                for (int i = 0; i < tablerojugadoruno.length; i++) {
                    for (int j = 0; j < tablerojugadoruno.length; j++) {
                        tabla = tabla + "|" + tablerojugadoruno[i][j];
                    }
                    tabla = tabla + "|\n";
                }
                System.out.println(tabla);
            }
        
        barcosuno--;
        p++;
        }
        
        int d = 1;
        
        //Agregar los barcos al jugaor 2
        while(barcosdos > 0){
        
        System.out.println("\nMuy bien. Ahora " + nomdos + ", que orientacion tomara el barco: " + d);
            System.out.println("Ingrese el numero correspondiente");
            System.out.println("1 = vertical           2 = horizontal");
            int o = leer.nextInt();
            
            //orientacion vertical
            if(o == 1){
                int [] barco = new int[1];
                barco[0] = 1;
                
            System.out.println("Muy bien. Que posicion tomara este barco");
            
            String tabla = "";
            
                for (int i = 0; i < tablerojugadordos.length; i++) {
                    for (int j = 0; j < tablerojugadordos.length; j++) {
                        tabla = tabla + "|" + tablerojugadordos[i][j];
                    }
                    tabla = tabla + "|\n";
                }
                System.out.println(tabla);
        
            System.out.println("Primero la fila");
            f = leer.nextInt();
            System.out.println("y luego la columna");
            c = leer.nextInt();
            
            int suma = 0;
                for (int i = 0; i <= barcosdos; i++) {
                    tablerojugadordos[f + suma][c] = barco[0];
                    suma++;
                }
            
                for (int i = 0; i < tablerojugadordos.length; i++) {
                    for (int j = 0; j < tablerojugadordos.length; j++) {
                        tabla = tabla + "|" + tablerojugadordos[i][j];
                    }
                    tabla = tabla + "|\n";
                }
                System.out.println(tabla);
            }
            
            //orientacion horizontal
            if(o == 2){
                int [] barco = new int [1];
                barco[0] = 1;
                
        System.out.println("Muy bien. Ahora, que posicion tomara el barco");
        
            String tabla = "";
            
                for (int i = 0; i < tablerojugadordos.length; i++) {
                    for (int j = 0; j < tablerojugadordos.length; j++) {
                        tabla = tabla + "|" + tablerojugadordos[i][j];
                    }
                    tabla = tabla + " |\n";
                }
                System.out.println(tabla);
        
            System.out.println("Primero la fila");
            f = leer.nextInt();
            System.out.println("y luego la columna");
            c = leer.nextInt();
            
            int suma = 0;
                for (int i = 0; i <= barcosdos; i++) {
                    tablerojugadordos[f][c + suma] = barco[0];
                    suma++;
                }
                
                for (int i = 0; i < tablerojugadordos.length; i++) {
                    for (int j = 0; j < tablerojugadordos.length; j++) {
                        tabla = tabla + "|" + tablerojugadordos[i][j];
                    }
                    tabla = tabla + "|\n";
                }
            }
        
        barcosdos--;
        d++;
        }
        
        int espacios = 0;
        
        for (int i = 0; i < tablerojugadoruno.length; i++) {
            for (int j = 0; j < tablerojugadoruno.length; j++) {
                if (tablerojugadoruno[i][j] == 1) {
                    espacios = espacios + 1;
                }   
            }
        }
        
        //Contadores de barcos
        int espaciosuno = espacios;
        int espaciosdos = espacios;
        int z = 0;
        
        turno = true;
        //inicio de los turnos
            while(turno){
                
                //empiezan los ataques
                boolean turnoextra = true;
                
                //Turnos del jugador 1
                while(turnoextra){
                
                System.out.println("Hora de atacar");
                    
                String tabla = "";
                int t = 1;
                System.out.println("**********Turno " + t + "de: " + nomuno + "**********");
                for (int i = 0; i < tablerouno.length; i++) {
                    for (int j = 0; j < tablerouno.length; j++) {
                        tabla = tabla + "|" + tablerouno[i][j] ;
                    }
                    tabla = tabla + " |\n";
                }
                System.out.println(tabla);
                
                //Contador de barcos
                    if (barcosuno == 4) {
                        
                       if (espaciosuno >= 10 && espaciosuno <= 14) {
                            System.out.println("Quedan 4 barcos");
                        }
                        if (espaciosuno >= 6 && espaciosuno <= 9) {
                            System.out.println("Quedan 3 barcos");
                        }
                        if (espaciosuno >= 3 && espaciosuno <= 5) {
                            System.out.println("Quedan 2 barcos");
                        }
                        if (espaciosuno >= 2 && espaciosuno <= 1) {
                            System.out.println("Queda 1 barco");
                        }
                    }
                    
                    if (barcosuno == 3) {
                        if (espaciosuno >= 6 && espaciosuno <= 9) {
                            System.out.println("Quedan 3 barcos");
                        }
                        if (espaciosuno >= 3 && espaciosuno <= 5) {
                            System.out.println("Quedan 2 barcos");
                        }
                        if (espaciosuno >= 2 && espaciosuno <= 1) {
                            System.out.println("Queda 1 barco");
                        }
                    }
                    
                    if (barcosuno == 2) {
                        if (espaciosuno >= 3 && espaciosuno <= 5) {
                            System.out.println("Quedan 2 barcos");
                        }
                        if (espaciosuno >= 2 && espaciosuno <= 1) {
                            System.out.println("Queda 1 barco");
                        }
                    }
                    
                    if (barcosuno == 1) {
                        if (espaciosuno >= 2 && espaciosuno <= 1) {
                            System.out.println("Queda 1 barco");
                        }
                    }
                    
                    System.out.println("Escoja la fila:");
                    f = leer.nextInt();
                
                    System.out.println("Escoja la columna:");
                    c = leer.nextInt();
                
                    if(tablerojugadordos[f][c] == 1){
                        System.out.println("BINGOOO, encontraste un barco");
                        System.out.println("Tienes otro intento");
                        tablerouno[f][c] = 1;
                        t++;
                        espaciosuno = espaciosuno - slots(z);
                    } else{
                        System.out.println("No encontraste nada");
                        tablerouno[f][c] = 0;
                        turnoextra = false;
                        t++;
                    }
                    
                    if (espaciosuno == 0) {
                    System.out.println("Felidicades " + nomuno + "Ganaste");
                    turno = false;
                }
                }
                
                boolean turnoextrados = true;
                
                //Tablero del jugador 2
                while(turnoextrados){
                String tabla = "";
                int t = 1;
                System.out.println("**********Turno " + t + "de: " + nomdos + "**********");
                for (int i = 0; i < tablerodos.length; i++) {
                    for (int j = 0; j < tablerodos.length; j++) {
                        tabla = tabla + "|" + tablerodos[i][j];
                    }
                    tabla = tabla + " |\n";
                }
                System.out.println(tabla);
                }
                
                //Contador de barcos
                if (barcosdos == 4) {
                    
                
                    if (espaciosdos >= 10 && espaciosdos <= 14) {
                        System.out.println("Quedan 4 barcos");
                    }
                    if (espaciosdos >= 6 && espaciosdos <= 9) {
                        System.out.println("Quedan 3 barcos");
                    }
                    if (espaciosdos >= 3 && espaciosdos <= 5) {
                        System.out.println("Quedan 2 barcos");
                    }
                    if (espaciosdos >= 2 && espaciosdos <= 1) {
                        System.out.println("Queda 1 barco");
                    }
                }    
                    
                if (barcosuno == 3) {
                    if (espaciosuno >= 6 && espaciosuno <= 9) {
                        System.out.println("Quedan 3 barcos");
                    }
                    if (espaciosuno >= 3 && espaciosuno <= 5) {
                        System.out.println("Quedan 2 barcos");
                    }
                    if (espaciosuno >= 2 && espaciosuno <= 1) {
                        System.out.println("Queda 1 barco");
                    }
                }
                    
                if (barcosuno == 2) {
                    if (espaciosuno >= 3 && espaciosuno <= 5) {
                        System.out.println("Quedan 2 barcos");
                    }
                    if (espaciosuno >= 2 && espaciosuno <= 1) {
                        System.out.println("Queda 1 barco");
                    }
                }
                    
                if (barcosuno == 1) {
                    if (espaciosuno >= 2 && espaciosuno <= 1) {
                        System.out.println("Queda 1 barco");
                    }
                }
                    
                System.out.println("Escoja la fila:");
                f = leer.nextInt();
                
                System.out.println("Escoja la columna:");
                c = leer.nextInt();
                
                if (tablerojugadoruno[f][c] == 1) {
                    System.out.println("BINGOOO, encontraste un barco");
                    System.out.println("Tienes otro intento");
                    tablerodos[f][c] = 1;
                    d++;
                    espaciosdos = espaciosdos - slots(z);
                }else{
                    System.out.println("No encontraste nada");
                    tablerodos[f][c] = 0;
                    turnoextrados = false;
                    d++;
                }
                
                if (espaciosdos == 0) {
                    System.out.println("Felidicades " + nomdos + "Ganaste");
                    turno = false;
                }
                
                System.out.println("Gracias por jugar, que costomucho hacerlo");
                
            }
    }
    
    public static int slots(int z){
    z = z + 1;
    
    return z;
    }
}
