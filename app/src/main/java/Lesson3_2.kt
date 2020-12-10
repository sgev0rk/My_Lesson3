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

    val mapPerson = mutableMapOf<Person, String>()
    mapPerson[person1] = "person1"
    mapPerson[person2] = "person2"
    mapPerson[person3] = "person3"
    mapPerson[person4] = "person4"
    mapPerson[person5] = "person5"
    mapPerson[person6] = "person6"
    mapPerson[person7] = "person7"
    mapPerson[person8] = "person8"

    println("Map:\n$mapPerson")

    val sortedMapPerson = mapPerson.toList().sortedBy { (key, value) -> key.age }.toMap()

    println("\nSorted map:\n$sortedMapPerson")
}