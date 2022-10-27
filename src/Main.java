public class Main {
    public static void main(String[] args) {

        // Condicion If
        System.out.println("Condicion If");
        int numeroIf = 0;

        if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }

        // Bucle While
        System.out.println("Bucle While");
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile += 1;
        }

        // Bucle Do While
        System.out.println("Bucle Do While");
        int numeroDoWhile = 2;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile += 1;
        } while (numeroDoWhile < 3);

        // Bucle For
        System.out.println("Bucle For");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        // Switch
        System.out.println("Switch");
        String estacion = "Otoño";

        switch (estacion) {
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println(estacion + " no es una estacion");
        }
    }
}