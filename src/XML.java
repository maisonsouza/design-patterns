public class XML implements Resposta{

    private Resposta outraResposta;

    @Override
    public void responde(Requisicao req, Conta conta) {
        if(req.getFormato()== Requisicao.Formato.XML){
            System.out.println("<conta><titular>João da Silva</titular><saldo>1500.0</saldo></conta>");
        }else{
            outraResposta.responde(req, conta);
        }

    }

    @Override
    public void setProxima(Resposta resposta) {
        this.outraResposta = resposta;

    }
}
