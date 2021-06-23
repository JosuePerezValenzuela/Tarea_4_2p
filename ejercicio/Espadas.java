
public class Espadas
{
    protected String material;
    protected int daño;
    protected int durabilidad;
    protected int xp;
    protected Persona p;
    public Espadas(Persona p){
        this.material = "piedra";
        this.daño = 10;
        this.durabilidad = 50;
        this.xp = 0;
        this.p = p;
    }
    public String descripcion (){
       return "hola papacho soy una espada de " + material + " mi daño es " + daño + " y mi durabilidad es " + durabilidad;
    }
    public int pegar(){
        int dañoRealizado = daño - p.getarmadura();
        this.durabilidad--;
        this.xp++;
        return dañoRealizado;
    }
    public String estadoDeLaEspada (){
      if(this.durabilidad == 0){
        this.daño = 0;
        return "Me destrui reparame para que recupere mi daño"; 
        }else{
         return "Estoy bien papacho mi durabilidad restante es " + durabilidad;
        }
    }
    public String mejorarEspada (){
        if(xp == 100){
          int nuevoDaño = this.daño + 10;
          return "Estoy tan mamado que mejorare y mi nuevo daño sera" + nuevoDaño;
        }else{
          return "che capo me falta xp sigue farmeando";
        }
    }
    public int getDaño(){
        return daño;
    }
}