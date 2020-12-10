fun main() {
    val list = mutableListOf<String>("1", "2", "32", "2", "1", "3", "asa")
    val map = maxCountRepeat(list.groupingBy { it }.eachCount())

    println("Our list: $list")

    for ((key, value) in map) {
        if (value == 1) {
            println("Element \"$key\" is repeated $value time")
        } else {
            println("Element \"$key\" is repeated $value times")
        }
    }
}

fun <T> maxCountRepeat(array: Map<T, Int>): Map<T, Int> {
    val maxvalue = array.maxBy { it.value }

    return array.filter { it.value == maxvalue?.value }
}


