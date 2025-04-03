public class VahemikusKorrutus extends Powerup{
    private boolean kasutatud;
    private int juhuslikArv;

    public VahemikusKorrutus() {
        this.kasutatud = false;
        this.juhuslikArv = 0;
    }

    @Override
    public void muuda(Mängija mängija) {
        this.juhuslikArv = (int) (Math.random() * 5);
        mängija.setMarvud(mängija.getMarvud() * (juhuslikArv + 1));
        this.kasutatud = true;
    }

    @Override
    public String toString() {
        if (this.kasutatud) {
            this.kasutatud = false;
            return (this.juhuslikArv + 1) + "x skoor";
        } else {
            return "1x kuni 5x skoor";
        }
    }
}
