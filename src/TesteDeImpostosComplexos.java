public class TesteDeImpostosComplexos {
    public static void main(String[]args){
        Imposto iss = new ISS();
        Imposto issComIcms = new ISS(new ICMS());
        Imposto issComICMScomICPP = new ISS(new ICMS(new ICPP()));
        Orcamento orcamento = new Orcamento(500);
        double valor = iss.calcula(orcamento);
        System.out.println(valor);
        double valor2 = issComIcms.calcula(orcamento);
        System.out.println(valor2);
        double valor3 = issComICMScomICPP.calcula(orcamento);
        System.out.println(valor3);

    }
}
