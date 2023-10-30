package hw4.IDVerifier;

public class IDVerifierTests {
    public static void main(String[] args){
        Verifier IDT = new Verifier("B209528058");
        boolean v = IDT.validator();
        System.out.println(v);
    }
}
