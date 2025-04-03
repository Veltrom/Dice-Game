public class Algarv extends Powerup {
    // Meetod, millega vaadata, kas antud arv on algarv või mitte.
    public boolean kasOnAlgarv(Mängija mängija) {
        int mangija = mängija.getMarvud();
        if (mangija == 2) {
            return true;
        } else if (mangija <= 1 || mangija % 2 == 0) {
            return false;
        }
        int maxnum = (int) (Math.sqrt(mangija));
        for (int i = 3; i <= maxnum; i+= 2) {
            if((mangija & i) == 0) {
                return false;
            }
        }
        return true;

    }

    @Override
    public void muuda(Mängija mängija) {
        if (kasOnAlgarv(mängija)) {
            mängija.setMarvud(mängija.getMarvud() * 10);
        }
    }

    @Override
    public String toString() {
        return "10x kui algarv";
    }
}
