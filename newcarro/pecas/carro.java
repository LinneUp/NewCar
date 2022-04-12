package pecas;

public class carro {
    //obrigatorios
    private int nPortas;
    private int nChassi;
    private int anoFabricacao;
    private Integer Combustivel;
   //opcionais
    private int pneus;
    private Integer calotas;
    private Integer parafusosPneu;
    private Integer retrovisor;





    public carro(int nPortas,int nChassi,Integer combustivel,int anoFabricacao,int pneus) {
    this.setnPortas(nPortas);
    this.setnChassi(nChassi);
    this.setCombustivel(combustivel);
    this.setAnoFabricacao(anoFabricacao);

    }



    public Integer getnPortas() {
        return nPortas;
    }

    public void setnPortas(Integer nPortas) {
        this.nPortas = nPortas;
    }

    public Integer getnChassi() {
        return nChassi = 198585330;
    }

    public void setnChassi(Integer nChassi) {
        this.nChassi = nChassi;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao= 2022;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Integer getCombustivel() {
        return Combustivel;
    }

    public void setCombustivel(Integer combustivel) {
        Combustivel = combustivel;
    }

    public Integer getQPneus() {
        return pneus = 5;

    }

    public Integer getCalotas() {

        return pneus;
    }

    public Integer getParafusos(){

        return pneus * 4;
    }

    public Integer getPneus() {
        return pneus;
    }

    public void setPneus(Integer pneus) {
        this.pneus = pneus;
    }

}

