public class Tamagotchi {
    

    private final int energiaMax;

    private final int saciedadeMax;

    private final int limpezaMax;

    private final int idadeMax;

    private int energiaAtual;

    private int saciedadeAtual;

    private int limpezaAtual;

    private int idadeAtual=0;

    private int diamantes=0;

    private boolean estaVivo=true;

    public Tamagotchi(int energiaMax, int saciedadeMax, int limpezaMax, int idadeMax){
        this.energiaMax=energiaMax;
        energiaAtual=energiaMax;
        this.saciedadeMax=saciedadeMax;
        saciedadeAtual=saciedadeMax;
        this.limpezaMax=limpezaMax;
        limpezaAtual=limpezaMax;
        this.idadeMax=idadeMax;
    }

    public int getEnergiaMax() {
        return energiaMax;
    }

    public int getSaciedadeMax() {
        return saciedadeMax;
    }

    public int getLimpezaMax() {
        return limpezaMax;
    }

    public int getIdadeMax() {
        return idadeMax;
    }

    public int getEnergiaAtual() {
        return energiaAtual;
    }

    public int getSaciedadeAtual() {
        return saciedadeAtual;
    }

    public int getLimpezaAtual() {
        return limpezaAtual;
    }

    public int getIdadeAtual() {
        return idadeAtual;
    }

    public int getDiamantes() {
        return diamantes;
    }

    public boolean getEstaVivo(){
        return estaVivo;
    }

    public boolean brincar(){
        if(estaVivo){
            energiaAtual=Math.max(energiaAtual-2,0);
            saciedadeAtual=Math.max(saciedadeAtual-1,0);
            limpezaAtual=Math.max(limpezaAtual-3,0);
            idadeAtual=Math.min(idadeAtual+1,idadeMax);
            diamantes++;
            if(energiaAtual==0||saciedadeAtual==0||limpezaAtual==0||idadeAtual==idadeMax)
                estaVivo=false;
            return true;
        }
        else
            return false;
    }

    public boolean comer(){
        if(estaVivo){
            energiaAtual=Math.max(energiaAtual-1,0);
            saciedadeAtual=Math.min(saciedadeAtual+4,saciedadeMax);
            limpezaAtual=Math.max(limpezaAtual-2,0);
            idadeAtual=Math.min(idadeAtual+1,idadeMax);
            if(energiaAtual==0||saciedadeAtual==0||limpezaAtual==0||idadeAtual==idadeMax)
                estaVivo=false;
            return true;
        }
        else
            return false;
    }

    public boolean dormir(){
        if(estaVivo&&energiaAtual<=energiaMax-5){
            int turnos=energiaMax-energiaAtual;
            energiaAtual=energiaMax;
            saciedadeAtual=Math.max(saciedadeAtual-2,0);
            idadeAtual=Math.min(idadeAtual+turnos,idadeMax);
            if(energiaAtual==0||saciedadeAtual==0||limpezaAtual==0||idadeAtual==idadeMax)
                estaVivo=false;
            return true;
        }
        else
            return false;
    }

    public boolean banhar(){
        if(estaVivo){
            energiaAtual=Math.max(energiaAtual-3,0);
            saciedadeAtual=Math.max(saciedadeAtual-1,0);
            limpezaAtual=limpezaMax;
            idadeAtual=Math.min(idadeAtual+2,idadeMax);
            if(energiaAtual==0||saciedadeAtual==0||limpezaAtual==0||idadeAtual==idadeMax)
                estaVivo=false;
            return true;
        }
        else
            return false;
    }

}
