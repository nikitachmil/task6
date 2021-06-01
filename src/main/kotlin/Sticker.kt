class Sticker(
    val product_id: Int,
    val sticker_id: Int,
    val url: String,
    val width: Int,
    val height: Int,
    val url1: String,
    val width1: Int,
    val height1: Int,
    val myArray: Array<out Any>? = arrayOf(url, width , height),
    val myArray1: Array<out Any>? = arrayOf(url1, width1 , height1)
        )
