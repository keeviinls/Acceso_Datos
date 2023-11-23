package BD_Relacionales_V1;

import java.sql.*;
import java.util.Scanner;

public class Ver_BaseDatos {

    public static Connection conn = null;

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)  throws SQLException{
            int opcion = 0;

            do {
                System.out.println("0. Salir del programa");
                System.out.println("1. Establecer conexión con el sgbd");
                System.out.println("2. Mostrar emp_no, oficio y dept_no");
                System.out.println("3. Mostrar emp_no, oficio, dept_no y dnombre");

                System.out.println("Introduzca una opción por favor");
                opcion = sc.nextInt();


                switch (opcion) {
                    case 0:
                        System.out.println("Gracias por usar el programa");
                        break;
                    case 1:
                        establecer_conexion();
                        break;
                    case 2:
                        mostrar_sin_dnombre();
                        break;
                    case 3:
                        mostrar_con_dnombre();
                        break;
                }

            }while (opcion!=0);
    }

    private static void mostrar_con_dnombre() throws SQLException{
        asignar_bd();
        PreparedStatement ps = conn.prepareStatement("select e.emp_no, e.oficio, d.dept_no, d.dnombre from empleados e inner join departamentos d on e.dept_no = d.dept_no;");
        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            System.out.println("EMP_NO: "+rs.getInt(1)+ " OFICIO: "+rs.getString(2)+ " DEPT_NO: "+rs.getInt(3)+ " DNOMBRE: "+rs.getString(4));
        }
    }

    private static void mostrar_sin_dnombre() throws SQLException{
        asignar_bd();
        PreparedStatement ps = conn.prepareStatement("select e.emp_no, e.oficio, d.dept_no  from empleados e inner join departamentos d on e.dept_no = d.dept_no;");
        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            System.out.println("EMP_NO: "+rs.getInt(1)+ " OFICIO: "+rs.getString(2)+ " DEPT_NO: "+rs.getInt(3));
        }

    }

    private static void asignar_bd() throws SQLException{

        String query = "use acceso_datos";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
        System.out.println("Asignación realizada correctamente");
    }


    private static void establecer_conexion() throws SQLException {
        //conexión al sgbd

        String url = "jdbc:mysql://localhost:3306/";
        String user ="root";
        String pwd="Noteloesperas1";
        conn = DriverManager.getConnection(url,user,pwd);
        System.out.println("conexión establecida");
    }


    }
