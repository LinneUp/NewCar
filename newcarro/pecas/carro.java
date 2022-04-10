package pecas;

public class carro {

    private Integer pneus;
    private Integer calotas;
    private Integer parafusosPneu;
    private Integer retrovisor;


    public carro(Integer pneus) {
    setQPneus(pneus);
    }

    public Integer getQPneus() {
        return pneus;

    }

    public Integer getCalotas() {

        return pneus;
    }

    public Integer getParafusos(){

        return pneus * 4;
    }

    public void setQPneus(Integer pneus) {
        calotas = pneus;
        parafusosPneu = pneus * 4;
        this.pneus = pneus;

    }



}

