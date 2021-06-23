
public class EspadaMolde extends Espadas
{
    private String atributo;
    private Persona personaje;
    public EspadaMolde()
    {
        this.material = "Soy un molde no sivo para nada :v";
        this. daño = 0;
        this.durabilidad = 1;
        this.atributo = "Si me convinas con un elemento estare mamadisimo";
    }
    public String convinacionAFuego (){
        if (personaje.getAlmaDeFuego() == 1){
          super.material = "espada de fuego";
          super.daño = 30;
          super.durabilidad = 100;
          this.atributo = "Fuego";
          personaje.restaDeAlmasDeFuego();
        }
        return "a sos re capo me convertiste en una espada de Fuego";
    }
}

