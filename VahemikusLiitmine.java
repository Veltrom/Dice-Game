public class VahemikusLiitmine extends Powerup {
    private boolean kasutatud;
    private int juhuslikArv;

    public VahemikusLiitmine() {
        this.kasutatud = false; // Kasutatud selleks, et alguses power-up valimise ekraanil saaks näidata vahemikku, hiljem aga täpset arvu
        this.juhuslikArv = 0; // et hiljem näidata täpset arvu
    }

    //
    @Override
    public void muuda(Mängija mängija) {
        this.juhuslikArv = (int) (Math.random() * 100);
        mängija.setMarvud(mängija.getMarvud() + this.juhuslikArv + 1);
        this.kasutatud = true;
    }

    @Override
    public String toString() {
        if (this.kasutatud) {
            this.kasutatud = false;
            return (this.juhuslikArv + 1) + "+ skoor";
        } else {
            return "+1 kuni +100 skoor";
        }
    }
}
