//class Persona constructor(nombre:String,edad:Int)
//CONSTRUCTOR PRINCIPAL
class Persona (nombre:String){
    //PROPERTIES (Attributes)
    var nombre:String="Sebas"
    var edad:Int=0
    var mujer:Boolean=false

    var propiedad:Int=0

    //+CONSTRUCTOR
    init {
        this.nombre = nombre
    }

    //CONSTRUCTOR SECUNDARIO
    constructor(nombre: String, edad:Int):this(nombre){
        this.edad = edad
    }
    constructor(nombre: String,edad: Int,mujer:Boolean):this(nombre,edad){
        this.mujer = mujer
    }

    //METHOD
    fun registrar(n:String):String {
        return "Registrado"
    }
}