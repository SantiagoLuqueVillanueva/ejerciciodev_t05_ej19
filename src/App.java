public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura de la pirámide: "));
        String c = System.console().readLine("Introduzca el carácter de relleno: ");

        for (int i = 0; i < altura; i++) {
            for (int j = altura; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
