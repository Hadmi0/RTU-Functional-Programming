import org.junit.Test

class IsbnVerifier {
    fun isValid(text:String): Boolean = text.filter {it.isDigit() || it == 'X'}
            .apply{if(length != 10) return false}
            .apply{if (indexOf('X') !in listOf(-1,9)) return false}
            .map{ if(it == 'X') 10 else Character.getNumericValue(it)}
            .mapIndexed {index, it -> (10 - index) * it}
            .sum() % 11 == 0
}