public class Täring {
    private int külge;
    public Täring(int külge){
        this.külge = külge;
    }

    public int getKülge() {
        return külge;
    }

    public void setKülge(int külge) {
        this.külge = külge;
    }

    public int veereta(){
        return (int) (Math.random() * külge + 1);
    }
}
