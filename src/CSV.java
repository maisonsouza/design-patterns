public class CSV implements Resposta {


    private CSV outraResposta;

    @Override
    public void responde(Requisicao req, Conta conta) {
        if(req.getFormato()== Requisicao.Formato.CSV){
            System.out.println("CSV");
        }
       else{
           outraResposta.responde(req,conta);
        }
    }

    @Override
    public void setProxima(Resposta resposta) {
        this.outraResposta.setProxima(resposta);
    }
}