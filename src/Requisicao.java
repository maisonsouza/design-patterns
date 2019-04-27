public class Requisicao {

    enum Formato{
        XML,CSV,PORCENTO
    }
    private Formato formato;

    public Formato getFormato() {
        return formato;
    }

    public Requisicao(Formato formato) {
        this.formato = formato;
    }

}
