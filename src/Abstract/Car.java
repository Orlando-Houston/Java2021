package Abstract;

public  abstract  class Car {
    private int agirlik;
    private String renk;
    private String model;


    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public abstract   int  saateYaktigiBenzinLitresi();
}
class Jeep extends Car{
    private int cantKalinligi;

    public int getCantKalinligi(){
        return cantKalinligi;
    }
    public void setCantKalinligi(int cantKalinligi){
        this.cantKalinligi=cantKalinligi;
    }
    public  int saateYaktigiBenzinLitresi(){
        return getAgirlik ()*2;
    }
}
