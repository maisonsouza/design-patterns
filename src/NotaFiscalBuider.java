import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuider {

    private String razaosocial;
    private String cnpj;
    private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
    private double valorBruto;
    private double impostos;
    private String observacoes;
    private Calendar data;


    public NotaFiscalBuider paraEmpresas(String razaosocial) {
        this.razaosocial = razaosocial;
        return this;
    }

    public NotaFiscalBuider comCnpj(String cnpj){
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuider comItem(ItemDaNota item){
        todosItens.add(item);
        valorBruto += item.getValor();
        impostos += item.getValor() * 0.05;
        return this;
    }

    public NotaFiscalBuider comObservacoes (String observacoes){
        this.observacoes = observacoes;
        return this;
    }

    public NotaFiscalBuider naDataAtual(){
        this.data = Calendar.getInstance();
        return this;
    }

    public NotaFiscal constroi(){
        return new NotaFiscal(razaosocial,cnpj,data,valorBruto,impostos,todosItens,observacoes);

    }




}
