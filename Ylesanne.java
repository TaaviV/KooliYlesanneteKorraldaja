import java.time.LocalDate;
public class Ylesanne {
    private String nimetus;
    private LocalDate tahtaeg;
    private boolean tehtud;
    public Ylesanne(String nimetus, LocalDate tahtaeg){
        this.nimetus=nimetus;
        this.tahtaeg=tahtaeg;
        this.tehtud=false;
    }
    public String getNimetus() {
        return nimetus;
    }
    public LocalDate getTahtaeg() {
        return tahtaeg;
    }
    public void märgiTehtuks(){
        tehtud=true;
    }

    @Override
    public String toString() {
        return nimetus+"(Tähtaeg: ("+tahtaeg+") "+"- "+(tehtud?" Tehtud!":"Tegemata.");
    }
    public String failiRida(){
        return nimetus + ";" + tahtaeg + ";" + tehtud;
    }
    public static Ylesanne loeRealt(String rida){
        String[] osad = rida.split(";");
        Ylesanne yl = new Ylesanne(osad[0], LocalDate.parse(osad[1]));
        if (Boolean.parseBoolean(osad[2])){
            yl.märgiTehtuks();
        }
        return yl;
    }
}