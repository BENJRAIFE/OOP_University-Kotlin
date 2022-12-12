package héritage.university
data class Student(
    var nomEt:String, var ageEt:Int, var numeroMat:Int
) {
    var probabilité:Int=50
    var inscriCour= mutableSetOf<Course>()
    fun inscription(courSTdnt:Course) {
        //permet d'inscrire un etudiant dans un cour
        inscriCour.add(courSTdnt)
    }
    var PassExam= mutableMapOf<Any,Any>()
    fun takeExam(cour:Course,notStdnt:Result){
        //pour passer un examin sur un cours
        PassExam.put(cour,notStdnt)
    }
    fun Learn(){
        //Incrémente la probabilité de succés a de  2%
        probabilité+=2
    }
    fun party(){
        //décrémente la probabilité de succés a de  2%
        probabilité-=2
    }
    fun toostring(){
        println("la probabilité se succés de $nomEt est: $probabilité")
    }
}






