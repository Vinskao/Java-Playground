package pack1;

public class IdentifierTests {
    public static void main(String[] args){

        Identifier IDT = new Identifier("a129161672");
        boolean v = IDT.validator();
        System.out.println(v);
    }
}
