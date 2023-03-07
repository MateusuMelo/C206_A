public class Motor {
    String cilindradas;
    float velMax;

    public Motor(String cilindradas, float velMax){
        this.cilindradas = cilindradas;
        this.velMax = velMax;

    }
    void mostraInfo(){
        System.out.println(cilindradas);
        System.out.println(velMax + " KM/h");
    }
}
