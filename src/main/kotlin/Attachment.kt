 abstract class Attachment {
     abstract val type: String
      var array = emptyArray<Any>()

     class VideoAttachment(override val type: String, val video: Any) : Attachment() {
         var result = if (video is Video) {
             array += video
             println("true")
         } else {
             println("false")
         }


     }
     class AudoiAttachment(override val type: String ,val audio: Any) : Attachment() {
         var result = if (audio is Audio) {
             array += audio
             println("true")
         } else {
             println("false")
         }


     }
     class DocumentsAttachment(override val type: String, val document: Any) : Attachment() {
         var result = if (document is Document) {
             array += document
             println("true")
         } else {
             println("false")
         }


     }
     class RepostAttachment(override val type: String, val repost: Any) : Attachment() {
         var result = if (repost is Reposts) {
             array += repost
             println("true")
         } else {
             println("false")
         }


     }
     class StickerAttachment(override val type: String, val sticker: Any) : Attachment() {
         var result = if (sticker is Sticker) {
             array += sticker
             println("true")
         } else {
             println("false")
         }


     }



 }

