public class SuvalinePowerup {
    Powerup[] asi= {new LisaKülg(), new Toppelt(), new KuiPaaris(),
            new VahemikusKorrutus(), new VahemikusLiitmine(), new Algarv()};

    public Powerup uuedPowerupid(){
        int indeks = (int) (Math.random() * asi.length);
        return asi[indeks];
    }

}
