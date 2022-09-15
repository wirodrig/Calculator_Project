import java.util.Scanner;




public class App {
    public static void main(String[] args) throws Exception {
        //Esta aplicacion es para saludar a una persona
        // Los / se usan para escribir por linea
        /*se utuliza para escribir varias lineas sin usar el //
         * Aqui estan todo mis comentarios
         */
        Scanner read = new Scanner(System.in);
        System.out.println("Entrar su Numero de Seguro");
        String name = read.nextLine();
        read.close();        
        System.out.println("Hola " + name);
    }
}
