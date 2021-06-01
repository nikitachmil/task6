class Comments(
    val count: Int,
    var can_post: Boolean,
    val can_close: Boolean,
    val can_open: Boolean,
) {
    fun update (post : MyPost): Any {
        can_post = false

        return can_post
    }
    fun editComment(count: Int = this.count, can_post: Boolean = this.can_post,can_close: Boolean = this.can_close,
             can_open: Boolean = this.can_open ) {}
}