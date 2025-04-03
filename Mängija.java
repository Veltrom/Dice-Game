import java.util.List;

public class Mängija {
    private List<Powerup> lisad;
    private Täring täring;
    private int marvud = 0;//määrab meetod uustase iga uue taseme alguses või powerup saab muuta set ja get meetoditega
    public Mängija(List<Powerup> lisad, Täring täring){
        this.lisad = lisad;
        this.täring = täring;
    }

    public void setMarvud(int marvud) {
        this.marvud = marvud;
    }

    public Täring getTäring() {
        return täring;
    }

    public int getMarvud() {
        return marvud;
    }

    public void lisaLisad(Powerup uus){
        lisad.add(uus);
    }
    public void uustase(){
        marvud = täring.veereta();
    }

    public List<Powerup> getLisad() {
        return lisad;
    }
}
