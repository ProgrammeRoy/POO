fun main (args: Array<String>){
    //OBJETOS Creados con la clase Persona
    val persona1 = Persona("José")
    val persona2 = Persona("Ricardo",24)
    val persona3 = Persona("Leticia",15,true)

    println(persona1.nombre+" "+persona1.edad)
    println(persona2.nombre+" "+persona2.edad)
    println(persona3.nombre+" "+persona3.edad+" "+persona3.mujer)

    val auto1 = Auto("Hyundai","i30",22000)
    println(auto1.marca)
    auto1.precio = 23000
    println(auto1.precio)

    auto1.propiedad = 99
    println(auto1.propiedad)
}

//CLASS NESTED
class OuterClassName{
    class NestedClassName{}
}

//CLASS INNER
class outer{
    class Nested{}
    inner class Inner{}
}