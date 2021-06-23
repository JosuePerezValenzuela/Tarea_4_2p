public class EspadaDeHielo extends Espadas
{
    private String atributo;
    private Persona p;
    public EspadaDeHielo()
    {
        this.atributo = "Hielo";
    }
    public int reduccionDevelo (){
        int nuevoVelo = p.getvelo() - 30;
        durabilidad--;
        return nuevoVelo;
    }
}
