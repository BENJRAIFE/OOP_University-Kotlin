package héritage.university

class University( var nomUni:String, var AnneFond:Int) {
    var recrutement= mutableListOf<Professor>()
    fun hie(Prfs:Professor){
        //permet de recruter un professeur
        recrutement.add(Prfs)
    }
    var studentsUni= mutableListOf<Student>()
     fun enroll(Stdnt:Student){
         //permet d'inscrire un etudiant dans l'universite
         studentsUni.add(Stdnt)
    }
}



