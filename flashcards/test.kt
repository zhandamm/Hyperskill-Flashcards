package flashcards

fun main() {

}

fun removing(currentMap: MutableMap<Int, String>, value: String): MutableMap<Int, String> {
    // Write your code here. Do not print the result of the function!
    return currentMap.filterValues { it != value }.toMutableMap()
}