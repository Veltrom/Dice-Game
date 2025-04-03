public class MänguTäring extends Täring{
    private int tase;
    public MänguTäring(int külge, int tase) {
        super(külge);
        this.tase = tase;
    }
    public void TõstaTaset(){
        tase += 1;
    }

    public int getTase() {
        return tase;
    }

    @Override
    public int veereta() {
        int summa = 0;
        for (int i = 0; i < tase; i++) {
            summa += (int) (Math.random() * getKülge() + 1);
        }
        return summa;
    }
}
