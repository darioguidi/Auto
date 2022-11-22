public class Telaio {

    private static double generatore_seriale=0;
    private int seriale;
    private String materiale;

    public Telaio (String ma){
        materiale=ma;
    }

    public void setMateriale(String ma){
        materiale=ma;
    }
    public String getMateriale(){
        return materiale;
    }

    public void setSeriale(int se){
        seriale=se;
    }
}
