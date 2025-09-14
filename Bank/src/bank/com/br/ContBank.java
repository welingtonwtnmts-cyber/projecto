package bank.com.br;


public class ContBank {

    private int agnc;    // agência
    private int nmcont;  // número da conta
    private float vlcont; // valor/saldo

    // GETTERS (pegam o valor)
    public int getAgencia() {
        return agnc;
    }

    public int getConta() {
        return nmcont;
    }

    public float getSaldo() {
        return vlcont;
    }

    // SETTERS (definem o valor)
    public void setAgencia(int agnc) {
        this.agnc = agnc;
    }

    public void setConta(int nmcont) {
        this.nmcont = nmcont;
    }

    public void setSaldo(float vlcont) {
        this.vlcont = vlcont;
    }
}
