class Pol(
    val id: Int,
    val owner_id: Int,
    val created: Int,
    val question: Int,
    val votes: Int,
    val answers: Answers,
    val anonymous: Boolean,
    val multiple: Boolean,
    val answer_ids: Array<Any>?,
    val end_date: Int,
    val closed: Boolean,
    val is_board: Int,
    val can_edit: Boolean,
    val can_vote: Boolean,
    val can_report: Boolean,
    val can_share: Boolean,
    val author_id: Int,
    val photo: Photo,
    val background: Background

        )
