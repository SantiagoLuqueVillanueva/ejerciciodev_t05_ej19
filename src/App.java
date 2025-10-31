public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura de la pirámide: "));
        String c = System.console().readLine("Introduzca el carácter de relleno: ");

        for (int fila = 0; fila < altura; fila++) {
            for (int j = altura; j > fila; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * fila; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
