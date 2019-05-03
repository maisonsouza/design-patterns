import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    protected double valor;
    private final List<Item> itens;
    protected EstadoDeUmOrcamento estadoatual;

    public Orcamento(double valor){
        this.valor = valor;
        itens = new ArrayList<Item>();
        estadoatual = new EmAprovacao();
    }

    public double getValor() {
        return valor;
    }

    public void adicionaItem(Item item){
        itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public boolean contemItemDeNome(String nomeDoItem) {
        for (Item item : itens) {
            if (item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }

    public void aplicaDescontoExtra() {
        estadoatual.aplicaDescontoExtra(this);
    }

    public void aprova(){
        estadoatual.aprova(this);
    }

    public void reprova(){
        estadoatual.reprova(this);
    }

    public void finaliza(){
        estadoatual.finaliza(this);
    }
}
