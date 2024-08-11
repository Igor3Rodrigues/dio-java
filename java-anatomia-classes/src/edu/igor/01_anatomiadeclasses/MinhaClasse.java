package edu.igor.anatomiadeclasses;
public class MinhaClasse {
    
    // Define o método nomeCompleto
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome + " " + segundoNome;
    }

    public static void main(String[] args) {
        String primeiroNome = "Igor";
        String segundoNome = "Rodrigues";

        // Chama o método nomeCompleto
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
}
