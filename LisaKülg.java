public class LisaKülg extends Powerup{
    @Override
    public void muuda(Mängija mängija) {
        mängija.getTäring().setKülge(mängija.getTäring().getKülge()+1);
    }

    @Override
    public String toString() {
        return "+1 täringukülg";
    }
}
