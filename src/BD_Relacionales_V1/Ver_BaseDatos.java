package BD_Relacionales_V1;

import java.sql.*;
import java.util.Scanner;

public class Ver_BaseDatos {

    // Creamos el objeto Connection, le ponemos un nombre y lo estableceremos como null.
    public static Connection conn = null;

    // Creamos un Scanner, en mi caso lo llamé sc, esto sirve para que el usuario pueda introducir datos
    static Scanner sc = new Scanner(System.in);

    //Creamos el Main
    public static void main(String[] args)  throws SQLException{

        // Creamos un int llamado "opcion", esto servirá para guardar la opcion que elija el usuario en el menu
            int opcion = 0;




       // Creamos un metodo que servirá para conectar la base de datos con el IntelliJ.
       // ---- ABAJO HAY UNA DESCRIPCION COMPLETA DE ESTE METODO ------
        establecer_conexion();

        /**
         * Hemos diseñado un menu donde el usuario podrá decidir que opcion elegir:
         * 1. Salir del programa.
         * 2. Mostrar 3 datos de la base de datos (Es lo que pedia el ejercicio 1).
         * 3. Mostrar lo mismo que antes pero añadiendo el "dnombre".
         * Hay que saber que para salir del programa solo vale pulsando 0, ya que hay un bucle que mostrara repetidamente el menu hasta pulsar 0.
         * Todo esto lo hacemos gracias a un Do While
         */


        // Creamos el menu de opciones
            do {
                System.out.println("0. Salir del programa");
                System.out.println("1. Mostrar emp_no, oficio y dept_no");
                System.out.println("2. Mostrar emp_no, oficio, dept_no y dnombre");
                System.out.println("3. Insertar datos");
                System.out.println("4. Actualizar datos");
                System.out.println("5. Eliminar datos de la tabla");

                // Pedimos al usuario que escoja una opcion y guardaremos su respuesta en la variable "opcion"
                System.out.println("Introduzca una opción por favor");
                opcion = sc.nextInt();


                // Creamos un switch que dependera de la variable "opcion", osea, dependera del numero de opcion que haya elegido el usuario
                switch (opcion) {

                    // Si el usuario selecciona la opcion 0, el programa le mostrara un mensaje y procederá a cerrarse.
                    case 0:
                        System.out.println("Gracias por usar el programa");
                        break;

                    // Si el usuario selecciona la opcion 1, llamaremos al metodo "mostrar_sin_d_nombre". Este sería el metodo para el primer ejercicio
                    case 1:
                        mostrar_sin_dnombre();  // ---- ABAJO HAY UNA DESCRIPCION COMPLETA DE ESTE METODO ------
                        break;

                    // Si el usuario selecciona la opcion 2, llamaremos al metodo "mostrar_con_d_nombre". Este sería el metodo para el segundo ejercicio
                    case 2:
                        mostrar_con_dnombre(); // ---- ABAJO HAY UNA DESCRIPCION COMPLETA DE ESTE METODO ------
                        break;

                    case 3:
                        insertar_datos_empleados();
                        break;

                    // Si el usuario selecciona una opcion que no esta entre las disponibles (0-2), le mostrara un mensaje
                    default:
                        System.out.println("ERROR, SELECCIONA UNA DE LAS OPCIONES DISPONIBLES POR FAVOR");
                        break;
                }

                // Ponemos opcion!=0, indica que el programa estara mientras la variable opcion no sea 0.
            }while (opcion!=0);
    }

    private static void insertar_datos_empleados() throws SQLException {

        asignar_bd();

        PreparedStatement ps = conn.prepareStatement("insert into empleados (apellido, oficio, dir, fecha_alt, salario, comision, dept_no) values (?,?,?,?,?,?)");

        System.out.println("Introduzca el apellido");
        String apellido = sc.next();

        System.out.println("Introduzca el oficio");
        String oficio = sc.next();

        System.out.println("Introduzca la direccion (CodigPostal)");
        int dir = sc.nextInt();

        System.out.println("Introduzca la fecha (AA-MM-DD)");
        String fecha = sc.next();

        System.out.println("Introduzca el salario");
        float salario = sc.nextFloat();

        System.out.println("Introduzca la comision");
        float comision = sc.nextFloat();

        System.out.println("Dime el numero de departamento");
        int numero_departamento = sc.nextInt();

        ps.setString(1,apellido);
        ps.setString(2, oficio);
        ps.setInt(3, dir);
        ps.setString(4, fecha);
        ps.setFloat(5, salario);
        ps.setInt(6,numero_departamento);

        ps.executeUpdate();
        System.out.println("Registro insertado correctamente");



    }

    private static void mostrar_con_dnombre() throws SQLException{

        // Llamamos al metodo "asignar_bd" para que usemos la base de datos indicada
        asignar_bd();

        // Creamos un PreparedeStatement y dentro estableceremos la Query para poder ver lo que nos pide, esta query debe ser examente igual a la que usariamos si ejecutarmos la query desde MYSQL
        PreparedStatement ps = conn.prepareStatement("select e.emp_no, e.oficio, d.dept_no, d.dnombre from empleados e inner join departamentos d on e.dept_no = d.dept_no;");

        // Guardamos en un ResultSet la query establecida anteriormente
        ResultSet rs = ps.executeQuery();

        // Con un while vamos a ir recorriendo el ResultSet
        while (rs.next()){

            // Con un Prinl escribiremos el nombre de la columna y
            // despues con "rs.getInt o rs.getString (esto varia segun el tipo de datos que sea) recogeremos
            // ese dato del rs y lo imprimiremos."
            System.out.println("EMP_NO: "+rs.getInt(1)+ " OFICIO: "+rs.getString(2)+ " DEPT_NO: "+rs.getInt(3)+ " DNOMBRE: "+rs.getString(4));
        }
    }

    private static void mostrar_sin_dnombre() throws SQLException{

        // Llamamos al metodo "asignar_bd" para que usemos la base de datos indicada
        asignar_bd();

        // Creamos un PreparedeStatement y dentro estableceremos la Query para poder ver lo que nos pide, esta query debe ser examente igual a la que usariamos si ejecutarmos la query desde MYSQL
        PreparedStatement ps = conn.prepareStatement("select e.emp_no, e.oficio, d.dept_no  from empleados e inner join departamentos d on e.dept_no = d.dept_no;");

        // Guardamos en un ResultSet la query establecida anteriormente
        ResultSet rs = ps.executeQuery();

        // Con un while vamos a ir recorriendo el ResultSet
        while (rs.next()){

            // Con un Prinl escribiremos el nombre de la columna y
            // despues con "rs.getInt o rs.getString (esto varia segun el tipo de datos que sea) recogeremos
            // ese dato del rs y lo imprimiremos."
            System.out.println("EMP_NO: "+rs.getInt(1)+
                    " OFICIO: "+rs.getString(2)+
                    " DEPT_NO: "+rs.getInt(3));
        }

    }

    private static void asignar_bd() throws SQLException{

        // Creamos una variable String con la query indicando el nombre de la base de datos para poder conectarlo.
        // NOTA IMPORTANTE: Esto tambien varia segun el usuario, si tienes otro nombre en la base de datos no funcionará

        String query = "use acceso_datos";

        //Creamos un Statement con "conn"
        Statement st = conn.createStatement();

        // Actualizamos para que que ejecute la query
        st.executeUpdate(query);
        System.out.println("Asignación realizada correctamente");
    }


    private static void establecer_conexion() throws SQLException {
        //conexión al sgbd

        // Creamos 3 variables Strings donde guardaremos la url, usuario y contraseña para conectar con mysql.
        // NOTA IMPORTANTE: Estas 3 variables varian segun cada usuario, uno puede tener otra url, nombre o contraseña.
        String url = "jdbc:mysql://localhost:3306/";
        String user ="root";
        String pwd="admin";

        // Realizamos la conexion entre "conn" y los strings que recientemente hemos creado
        conn = DriverManager.getConnection(url,user,pwd);
        System.out.println("conexión establecida");
    }


    }
