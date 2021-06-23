
public class EspadaDeFuego extends Espadas
{
    private String atributo;
    public EspadaDeFuego(Persona p)
    {
        super(p);
        this.atributo = "Fuego";
    }
    public int dañoPorElElemnto (){
        int nuevoDaño = super.daño + 20 - p.getarmadura();
        this.durabilidad --;
        return nuevoDaño;
    }
}

