package héritage.university



data class Professor(var nomPrf:String,var Age:Int,
                     var SallaireAnn:Int) {
    var teachList= mutableListOf<Course>()
    fun teach( coursePrf:  Course){
        teachList.add(coursePrf)
   }
}



