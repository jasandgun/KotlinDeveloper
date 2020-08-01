fun main() {
    val productType = readLine()!!
    val price = readLine()!!.toInt()
    val product = when (productType) {
        "headphones" -> Headphones(price)
        "smartphone" -> Smartphone(price)
        "tv" -> TV(price)
        else -> Laptop(price)
    }
    println(totalPrice(product))
}
fun totalPrice(product: Product): Int = product.price + (product.price * product.productTax).toInt()

open class Product(val price: Int, val productTax: Double)
class Headphones(price: Int) : Product(price, 0.11)
class Smartphone(price: Int) : Product(price, 0.15)
class TV(price: Int) : Product(price, 0.17)
class Laptop(price: Int) : Product(price, 0.19)