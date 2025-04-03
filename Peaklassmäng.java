import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Peaklassmäng {
    public static void main(String[] args) throws InterruptedException {
        SuvalinePowerup a = new SuvalinePowerup();
        MänguTäring mängutäring = new MänguTäring(6,1);
        Täring mängijatäring = new Täring(6);
        List<Powerup> asjad = new ArrayList<>();
        Mängija mängija = new Mängija(asjad, mängijatäring);
        int mäarvud= 0;

        while (true){
            System.out.println("Tase: " + mängutäring.getTase());
            mäarvud = mängutäring.veereta(); //punktisumma, mida mängija saadud punktisumma peab ületama
            System.out.println("Vaja on veeretada üle " + mäarvud + "!");
            Thread.sleep(2000);
            mängija.uustase();//veeretab esialgse täringu mängija jaoks
            System.out.println("Esialgne täringuveeretus andis sulle "+ mängija.getMarvud() + " punkti.");

            // If kontrollib, kas power-upe on. Kui pole, prindib lihtsalt, et puudub powerupe. Kui on,
            // siis tsükkliga läbib mängijal olevate power-upide järjendit ning rakendab igat powerupi.
            if (mängija.getLisad().size() == 0)  {
                Thread.sleep(2000);
                System.out.println("Puudub power-upe, mida rakendada!");
            } else {
                Thread.sleep(2000);
                System.out.println("Power-upide rakendamine:");
                for (Powerup pu: mängija.getLisad()) {//rakendab kõik seni saadud power-upid
                    int algneSkoor = mängija.getMarvud();
                    pu.muuda(mängija);
                    Thread.sleep(2000);
                    System.out.println(pu + ": Tulemus " + algneSkoor + " --> " + mängija.getMarvud());
                }
            }
            Thread.sleep(3500);
            System.out.println("Said lõpptulemuseks "+ mängija.getMarvud() + " punkti!");
            Thread.sleep(2000);

            if (mängija.getMarvud() > mäarvud){//kui mängija võidab saab valida 3 suvalise power-upi seast ühe endale juurde
                System.out.println("Tase " + mängutäring.getTase() + " on võidetud! Nüüd saad valida endale power-upi!");
                mängutäring.TõstaTaset();
                Thread.sleep(2000);

                System.out.println("Saad valida 3 power-upi vahel: ");
                Powerup esimene = a.uuedPowerupid();
                Powerup teine = a.uuedPowerupid();
                Powerup kolmas = a.uuedPowerupid();
                Thread.sleep(1000);
                System.out.println("(1) " + esimene);
                Thread.sleep(1000);
                System.out.println("(2) " + teine);
                Thread.sleep(1000);
                System.out.println("(3) "+ kolmas);
                Thread.sleep(1500);
                System.out.println("Sisesta tahetud power-upi number: ");

                // Tsükkel selleks, et kontrollida, kas sisestatud arv on vahemikus 1-3. Kui pole, siis küsib arvu uuesti.
                // Kui arv on vahemikus 1-3, siis prindib, mis power-up valitud ning kui on +1 täringukülg, siis kohe
                // rakendab mängijale, kui mitte, siis lisab power-upide järjendisse.
                while (true) {
                    Scanner sisestus = new Scanner(System.in);
                    int arv = sisestus.nextInt();

                    if (arv == 1) {
                        System.out.println("Valisite: " + esimene);
                        if (esimene instanceof LisaKülg) {
                            esimene.muuda(mängija);
                            break;
                        } else {
                            mängija.lisaLisad(esimene);
                            break;
                        }
                    }
                    else if (arv == 2) {
                        System.out.println("Valisite: " + teine);
                        if (teine instanceof LisaKülg) {
                            teine.muuda(mängija);
                            break;
                        } else {
                            mängija.lisaLisad(teine);
                            break;
                        }
                    }
                    else if (arv == 3) {
                        System.out.println("Valisite: " + kolmas);
                        if (kolmas instanceof LisaKülg) {
                            kolmas.muuda(mängija);
                            break;
                        } else {
                            mängija.lisaLisad(kolmas);
                            break;
                        }
                    }
                    else {
                        System.out.println("Sisestatud arv ei ole vahemikus 1-3. Palun sisesta uuesti! ");
                    }
                }
                Thread.sleep(2000);

            }
            else {
                Thread.sleep(2000);
                System.out.println("Teie saadud number oli väiksem kui oli vaja, et taset võita.");
                Thread.sleep(1500);
                System.out.println("Teie Kaotasite.");
                break;
            }
        }
    }
}
