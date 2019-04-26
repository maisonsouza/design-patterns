public class Porcento implements Resposta {
    Resposta outraResposta;

    public Porcento(Resposta outraResposta) {
        this.outraResposta = outraResposta;
    }

    @Override
    public void responde(Requisicao req, Conta conta) {
        if (req.getFormato() == Requisicao.Formato.PORCENTO) {
            System.out.println("%%%%%%");
        } else {
            this.outraResposta.responde(req, conta);
        }
    }

    @Override
    public void setProxima(Resposta resposta) {
        outraResposta.setProxima(resposta);
    }
}
