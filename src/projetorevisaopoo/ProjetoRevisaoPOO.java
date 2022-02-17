package projetorevisaopoo;

public class ProjetoRevisaoPOO {
    
    public static void main(String[] args) {
        Caneta caneta01 = new Caneta("Azul", false, 0.456f);
        Caneta caneta02 = new Caneta("Vermelha", true, 2.5f);
        Caneta caneta03 = new Caneta("Verde", false, 1);
        //OU
        /*Caneta canetaTeste = new Caneta();
        canetaTeste.setCor("sdjsdhsdj");
        canetaTeste.setTampada(true);
        canetaTeste.setTamanhoPonta(0.2f);*/
        
        System.out.println("CANETA 01");
        System.out.println(caneta01.getCor());
        System.out.println(caneta01.isTampada());
        System.out.println(caneta01.getTamanhoPonta());

        System.out.println("CANETA 02");
        System.out.println(caneta02.getCor());
        System.out.println(caneta02.isTampada());
        System.out.println(caneta02.getTamanhoPonta());

        System.out.println("CANETA 03");
        System.out.println(caneta03.getCor());
        System.out.println(caneta03.isTampada());
        System.out.println(caneta03.getTamanhoPonta());
    }
}
