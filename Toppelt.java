public class Toppelt extends Powerup{
    @Override
    public void muuda(Mängija mängija) {
        mängija.setMarvud(mängija.getMarvud() * 2);
    }

    @Override
    public String toString() {
        return "2x skoor";
    }
}
