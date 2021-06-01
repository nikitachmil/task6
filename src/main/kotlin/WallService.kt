object WallService {
    var posts = emptyArray<MyPost>()

    var item = 0


    fun add(post: MyPost): MyPost {
        posts += post.copy(id = if (posts.isEmpty()) 1 else posts.last().id + 1)
        return posts.last()
    }

    fun printAllPosts(posts: Array<MyPost>) {
        for (post in posts) {
            print(post)
        }
    }


    fun update(post: Array<MyPost>, item: Int): Any  {
        for ((index, post) in posts.withIndex()) {
            if (item == post.id) {
                posts[index] = post.copy(id = post.id, date = post.date)
                return true
            }
        }
        return false
    }

    fun checkCopyrightLink(post: MyPost): Any{
        var result = post.link.url
        return result
    }
    fun closeComments(post: MyPost): Any? {
        var result = post.comments?.update(post)

      return result

    }
   fun creatComment(post: MyPost, text: String): Any? {
    var result = post.post?.update(post,text)
    return result
   }
    fun delete(post: MyPost): Any{
        var result = post.copy(post = null)
        return result
    }
    fun deleteComment(post: MyPost): Any{
        var result = post.copy(comments = null)
        return result
    }
    fun edit(post: MyPost): Unit? {
        return post.comments?.editComment(1)
    }








    //var resultUpdate = false
        // for ((index, posts) in post.withIndex()) {
        //if (item == posts.id) {
        // var result = posts.copy(text = "text")
        //resultUpdate = true}

        //else
        //resultUpdate = false


        //}
        // return resultUpdate


        // }
    }

















