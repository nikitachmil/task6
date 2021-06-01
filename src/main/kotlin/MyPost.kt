data class MyPost(
    val id: Int,
    val owner_id: Int,
    val from_id: Int,
    val date: Int,
    val text: String,
    val reply_owner_id: Int,
    val reply_post_id: Int,
    val friend_only: Boolean,
    val comments: Comments?,
    val copyright: Copyright,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val post_type: String,
    val can_pin: Boolean,
    val can_delete: Boolean,
    val can_edit: Boolean,
    val is_pinned: Boolean,
    val marked_as_ads: Boolean,
    val is_favorite: Boolean,
    val donut: Donute,
    val postponed_id: Int,
    //новое задание
    val audio: Audio,
    val document: Document,
    val link: Link,
    val note: Note,
    val page: Page,
    val pol: Pol,
    val post: Post?,
    val postSource: Post_source,
    val sticker: Sticker,
    val video: Video,


    ) {

}


