class Isogram {
    fun isIsogram(text:String): Boolean = text.toLowerCase()
            .filter{it.isLetter()}
            .groupBy{it}
            .values
            .any{it.size > 1}
            .not()
}