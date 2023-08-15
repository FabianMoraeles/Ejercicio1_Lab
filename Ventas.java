import java.util.Random;
import java.util.Objects;

public class Ventas {
    private Random boleto;
    private Random rango1;
    private Random rango2;
    private Random RanLocal;
    private int Local1;
    private int Local2;
    private int Local3;
    private float presupuesto;
    private int num_boletos;
    private int ran_boleto;
    private int ran_rango1;
    private int ran_rango2;
    private int ran_RanLocal;

    private String nombre;
    private String email;

    public Ventas() {
        boleto = new Random();
        rango1 = new Random();
        rango2 = new Random();
        RanLocal = new Random();
        Local1 = 20;
        Local2 = 20;
        Local3 = 20;
        presupuesto = 0;
        num_boletos = 0;
        ran_boleto = 0;
        ran_rango1 = 0;
        ran_rango2 = 0;
        ran_RanLocal = 0;
        nombre = "";
        email = "";
    }

    public Ventas(Random boleto, Random rango1, Random rango2, Random RanLocal, int Local1, int Local2, int Local3, float presupuesto, int num_boletos, int ran_boleto, int ran_rango1, int ran_rango2, int ran_RanLocal, String nombre, String email) {
        this.boleto = boleto;
        this.rango1 = rango1;
        this.rango2 = rango2;
        this.RanLocal = RanLocal;
        this.Local1 = Local1;
        this.Local2 = Local2;
        this.Local3 = Local3;
        this.presupuesto = presupuesto;
        this.num_boletos = num_boletos;
        this.ran_boleto = ran_boleto;
        this.ran_rango1 = ran_rango1;
        this.ran_rango2 = ran_rango2;
        this.ran_RanLocal = ran_RanLocal;
        this.nombre = nombre;
        this.email = email;
    }

    public Random getBoleto() {
        return this.boleto;
    }

    public void setBoleto(Random boleto) {
        this.boleto = boleto;
    }

    public Random getRango1() {
        return this.rango1;
    }

    public void setRango1(Random rango1) {
        this.rango1 = rango1;
    }

    public Random getRango2() {
        return this.rango2;
    }

    public void setRango2(Random rango2) {
        this.rango2 = rango2;
    }

    public Random getRanLocal() {
        return this.RanLocal;
    }

    public void setRanLocal(Random RanLocal) {
        this.RanLocal = RanLocal;
    }

    public int getLocal1() {
        return this.Local1;
    }

    public void setLocal1(int Local1) {
        this.Local1 = Local1;
    }

    public int getLocal2() {
        return this.Local2;
    }

    public void setLocal2(int Local2) {
        this.Local2 = Local2;
    }

    public int getLocal3() {
        return this.Local3;
    }

    public void setLocal3(int Local3) {
        this.Local3 = Local3;
    }

    public float getPresupuesto() {
        return this.presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getNum_boletos() {
        return this.num_boletos;
    }

    public void setNum_boletos(int num_boletos) {
        this.num_boletos = num_boletos;
    }

    public int getRan_boleto() {
        return this.ran_boleto;
    }

    public void setRan_boleto(int ran_boleto) {
        this.ran_boleto = ran_boleto;
    }

    public int getRan_rango1() {
        return this.ran_rango1;
    }

    public void setRan_rango1(int ran_rango1) {
        this.ran_rango1 = ran_rango1;
    }

    public int getRan_rango2() {
        return this.ran_rango2;
    }

    public void setRan_rango2(int ran_rango2) {
        this.ran_rango2 = ran_rango2;
    }

    public int getRan_RanLocal() {
        return this.ran_RanLocal;
    }

    public void setRan_RanLocal(int ran_RanLocal) {
        this.ran_RanLocal = ran_RanLocal;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Ventas boleto(Random boleto) {
        setBoleto(boleto);
        return this;
    }

    public Ventas rango1(Random rango1) {
        setRango1(rango1);
        return this;
    }

    public Ventas rango2(Random rango2) {
        setRango2(rango2);
        return this;
    }

    public Ventas RanLocal(Random RanLocal) {
        setRanLocal(RanLocal);
        return this;
    }

    public Ventas Local1(int Local1) {
        setLocal1(Local1);
        return this;
    }

    public Ventas Local2(int Local2) {
        setLocal2(Local2);
        return this;
    }

    public Ventas Local3(int Local3) {
        setLocal3(Local3);
        return this;
    }

    public Ventas presupuesto(float presupuesto) {
        setPresupuesto(presupuesto);
        return this;
    }

    public Ventas num_boletos(int num_boletos) {
        setNum_boletos(num_boletos);
        return this;
    }

    public Ventas ran_boleto(int ran_boleto) {
        setRan_boleto(ran_boleto);
        return this;
    }

    public Ventas ran_rango1(int ran_rango1) {
        setRan_rango1(ran_rango1);
        return this;
    }

    public Ventas ran_rango2(int ran_rango2) {
        setRan_rango2(ran_rango2);
        return this;
    }

    public Ventas ran_RanLocal(int ran_RanLocal) {
        setRan_RanLocal(ran_RanLocal);
        return this;
    }

    public Ventas nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Ventas email(String email) {
        setEmail(email);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Ventas)) {
            return false;
        }
        Ventas ventas = (Ventas) o;
        return Objects.equals(boleto, ventas.boleto) && Objects.equals(rango1, ventas.rango1) && Objects.equals(rango2, ventas.rango2) && Objects.equals(RanLocal, ventas.RanLocal) && Local1 == ventas.Local1 && Local2 == ventas.Local2 && Local3 == ventas.Local3 && presupuesto == ventas.presupuesto && num_boletos == ventas.num_boletos && ran_boleto == ventas.ran_boleto && ran_rango1 == ventas.ran_rango1 && ran_rango2 == ventas.ran_rango2 && ran_RanLocal == ventas.ran_RanLocal && Objects.equals(nombre, ventas.nombre) && Objects.equals(email, ventas.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boleto, rango1, rango2, RanLocal, Local1, Local2, Local3, presupuesto, num_boletos, ran_boleto, ran_rango1, ran_rango2, ran_RanLocal, nombre, email);
    }

    @Override
    public String toString() {
        return "{" +
            " boleto='" + getBoleto() + "'" +
            ", rango1='" + getRango1() + "'" +
            ", rango2='" + getRango2() + "'" +
            ", RanLocal='" + getRanLocal() + "'" +
            ", Local1='" + getLocal1() + "'" +
            ", Local2='" + getLocal2() + "'" +
            ", Local3='" + getLocal3() + "'" +
            ", presupuesto='" + getPresupuesto() + "'" +
            ", num_boletos='" + getNum_boletos() + "'" +
            ", ran_boleto='" + getRan_boleto() + "'" +
            ", ran_rango1='" + getRan_rango1() + "'" +
            ", ran_rango2='" + getRan_rango2() + "'" +
            ", ran_RanLocal='" + getRan_RanLocal() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }
    public int generarNumeroAleatorio(){
        return boleto.nextInt(15000)+1;
    }
    
    public int generarNumeroAleatorio2(){
        return rango1.nextInt(15000)+1;
    }
    public int generarNumeroAleatorio3(){
        return rango2.nextInt(15000)+1;
    }
    public int generarNumeroAleatorio4(){
        return RanLocal.nextInt(3)+1;
    }


    public boolean apto(){
        ran_rango1 = generarNumeroAleatorio2();
        ran_rango2 = generarNumeroAleatorio3();
        ran_boleto = generarNumeroAleatorio();

        if( ( (ran_boleto >= ran_rango1) && (ran_boleto <= ran_rango2)) || ((ran_boleto <= ran_rango1) && (ran_boleto >= ran_rango2))){
            return true;
        }
        return false;
  
    }

    public void comprar(){
        ran_RanLocal = generarNumeroAleatorio4();
        ran_rango1 = 0;
        if((ran_RanLocal == 1) && (Local1 > 0)){

            if(num_boletos <= Local1){
                if((num_boletos * 100) <= presupuesto){
                    Local1 = Local1 - num_boletos;
                    presupuesto = presupuesto - (num_boletos * 100);
                    ran_rango1 = 1;

                }

            } else{
                if((num_boletos * 100) <= presupuesto){
                    Local1 = 0;
                    presupuesto = presupuesto - (Local1 * 100);
                    ran_rango1 = 1;
                }
            }

        }
        // LOCAL 2 ------------------------------------------
        if((ran_RanLocal == 2) && (Local2 > 0)){

            if(num_boletos <= Local2){
                if((num_boletos * 500) <= presupuesto){
                    Local2 = Local2 - num_boletos;
                    presupuesto = presupuesto - (num_boletos * 500);
                    ran_rango1 = 2;

                }

            } else{
                if((num_boletos * 500) <= presupuesto){
                    Local2 = 0;
                    presupuesto = presupuesto - (Local2 * 500);
                    ran_rango1 = 2;
                }
            }

        }
        // LOCAL 3 ------------------------------------------
        if((ran_RanLocal == 3) && (Local3 > 0)){

            if(num_boletos <= Local3){
                if((num_boletos * 1000) <= presupuesto){
                    Local3 = Local3 - num_boletos;
                    presupuesto = presupuesto - (num_boletos * 1000);
                    ran_rango1 = 3;

                }

            } else{
                if((num_boletos * 1000) <= presupuesto){
                    Local3 = 0;
                    presupuesto = presupuesto - (Local3 * 1000);
                    ran_rango1 = 3;
                    
                }
            }

        }

    }
}

 
