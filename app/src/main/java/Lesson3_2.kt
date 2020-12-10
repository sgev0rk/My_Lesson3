class Person(val name: String, val age: Int) {
    override fun toString(): String {
        return "(name: '$name', age: $age)"
    }
}

fun main() {
    val person1 = Person("Anton", 12)
    val person2 = Person("Illya", 13)
    val person3 = Person("Kolyan", 34)
    val person4 = Person("Artur", 17)
    val person5 = Person("Artur", 12)
    val person6 = Person("Inna", 32)
    val person7 = Person("Amaliya", 67)
    val person8 = Person("Valeriy", 21)

    var mapPerson = mapOf<Person, String>(
        person1 to "person1",
        person2 to "person2",
        person3 to "person3",
        person4 to "person4",
        person5 to "person5",
        person6 to "person6",
        person7 to "person7",
        person8 to "person8"
    )

    println("Map:\n$mapPerson")

    val sortedMapPerson = mapPerson.toList().sortedBy { (key, value) -> key.age }.toMap()

    println("\nSorted map:\n$sortedMapPerson")
}