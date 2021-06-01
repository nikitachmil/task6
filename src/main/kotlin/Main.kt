fun main() {


    val Post = MyPost(
        1, 2, 3, 200, "text", 1, 2, false,
        Comments(200, true, true, false),
        Copyright(1, "face", "friend", "Chandler"),
        Likes(200, true, true, true),
        Reposts(4, false),
        Views(800),
        "ross",
        false,
        false, false, false,
        true, true,
        Donute(true, 2, Placeholder(true), true, "Yes"),
        1,
         Audio(1,2,"2Pac","2",1,"URL",1,2,3,4,true,false),Document(1,2,"title",1,"ext","URL",1,
            2,Preview(Photo(1,2,3,4,"yes",1,Sizes("yes","URL",1,2,null),2,2),Graffiti("yes",1,2,
            ),Audio_massage(1,null,"URL","LINK"))),Link("st","title","1","2",Photo(1,1,2,3,"tx",1,Sizes(
            "1","2",1,2,null),1,2),Product(),Button(),"1","2"),Note(1,2,3,"tx",1,2,3,
        "url"),Page(1,2,3,"tl",true,false,false,true,1,2,3,5,"rs","ch",
        "source","html","vies_url"),Pol(1,2,3,4,5,Answers(1,"tx",1,2,null),false,true,null,
            1,true,1,false,false,true,false,1,Photo(1,1,2,3,"tx",1,Sizes(
                "1","2",1,2,null),1,2),Background(1,"t",1,2,3,4,null,null)),Post(1,2,3
        ,4,5,"tx",1,2,true,Comments(1, true, true, true),"1",Likes(1,
            true,true,false),Reposts(1,true),Views(1),"1",Post_source("s","s","2","irl"),null,Geo("st",
            "st",Place()),1,null,true,false,true,false,true,true,1),Post_source("st","t",
        "2","url"),Sticker(1,2,"url",1,2,"url",1,2,null,null),Video(1,2,"tl","2","2",
        "3","4","6","2","5","3","5","8","0",1,2,3,4,"1",
        "t",true,true,"2",false,false,false,false)
            )


    //val Post2 = MyPost(
        //1, 2, 3, 200, "text", 1, 2, false,
        //Comments(200, true, true, true, false),
       // Copyright(1, "face", "friend", "Chandler"),
        //Likes(200, true, true, true),
       // Reposts(4, false),
       // Views(800),
       // "ross",
       // false,
       // false, false, false,
       // true, true,
       // Donute(true, 2, Placeholder(true), true, "Yes"),
       // 1,Audio(1,2,"2Pac","2",1,"URL",1,2,3,4,true,false)
    //)
   // val Post3 = MyPost(
        //1, 2, 3, 200, "text", 1, 2, false,
        //Comments(200, true, true, true, false),
       // Copyright(1, "face", "friend", "Chandler"),
       // Likes(200, true, true, true),
       // Reposts(4, false),
       // Views(800),
       // "ross",
        //false,
       // false, false, false,
       // true, true,
       // Donute(true, 2, Placeholder(true), true, "Yes"),
       // 1,Audio(1,2,"2Pac","2",1,"URL",1,2,3,4,true,false)
    //)


    var update = 3
    WallService.add(Post)
    var textCreate= "TEXT"
        //WallService.add(Post2)
        //WallService.add(Post3)
   WallService.printAllPosts(WallService.posts)
       //var result = WallService.update(WallService.posts,update)
    var total = WallService.checkCopyrightLink(Post)
    println(total)
    var t = WallService.closeComments(Post)
    println(t)
    var c = WallService.creatComment(Post,textCreate)
    println(c)
    var d = WallService.delete(Post)
    println(d)
    var dc = WallService.deleteComment(Post)
    println(dc)
    var ec = WallService.edit(Post)
    println(ec)
   var result = Attachment.VideoAttachment("Video", Post.video)
    println(result)
    var result1 = Attachment.AudoiAttachment("Audio", Post.audio)
    println(result1)
    var result2 = Attachment.DocumentsAttachment("Documents", Post.document)
    println(result2)
    var result3 = Attachment.RepostAttachment("Repost", Post.reposts)
    println(result3)
    var result4 = Attachment.StickerAttachment("Sticker", Post.sticker)
    println(result4)





}






