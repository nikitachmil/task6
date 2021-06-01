class Answers(
    val id:Int,
    val text: String,
    val votes: Int,
    val rate: Number,
    val myArray: Array<out Any>? = arrayOf(id, text , votes,rate)
        )
