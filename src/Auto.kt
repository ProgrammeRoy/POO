//DATA CLASS DEFINIDA CON CONSTRUCTOR, GETTERS AND SETTERS
class Auto(var marca:String, var modelo:String, var precio:Int){

    var propiedad:Int = 0

        get() = 777

        set(value){
            if (value>100) field = value
            else field = -1
        }
}