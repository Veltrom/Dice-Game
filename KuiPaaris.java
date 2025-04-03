public class KuiPaaris extends Powerup{

    @Override
    public void muuda(Mängija mängija) {
        if (mängija.getMarvud() % 2 == 0) {
            mängija.setMarvud(mängija.getMarvud() * 5);
        }
    }

    @Override
    public String toString() {
        return "Paarisarvu puhul 5x skoor";
    }
}
