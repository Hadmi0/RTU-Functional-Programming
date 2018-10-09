

object NewtonMethod extends App {
  
    val precision = 0.001
    
    def square(x: Double) = x * x
    
    def isGoodEnough(x: Double, y: Double) = Math.abs(square(y) - x) < precision
    
    def improve(x: Double, y: Double) = (y + x/y) / 2
    
    def sqrtIter(x: Double, y: Double): Double = if (isGoodEnough(x, y)) y else sqrtIter(x, improve(x, y))
    
    def sqrt(x: Double) = sqrtIter(x, 1)
    
    println(sqrt(10))
}