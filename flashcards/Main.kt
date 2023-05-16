package flashcards

fun main() {
    val card = Card()

    card.createCard()
    card.answerForQuest()
    /*    println("Input the number of cards:")
        val numberOfCards = readln().trim().toInt()

        val answer = readln().trim()
        if (definition == answer) {
            println("Your answer is right!")
        } else println("Your answer is wrong...")*/

}


class Card(private val question: String = "", private val definition: String = "") {
    private val cards = mutableListOf<Card>()

    fun createCard() {
        println("Input the number of cards:")
        val numberOfCards = readln().trim().toInt()
        for (i in 1..numberOfCards) {
            println("Card #${i}:")
            val questionInput = readln()
            println("The definition for card #${i}:")
            val definition = readln().trim()
            val card = Card(questionInput, definition)
            cards.add(card)
        }
    }

    fun answerForQuest() {
        for (i in cards) {
            println("Print the definition of \"${i.question}\":")
            val answer = readln()
            if (i.definition == answer) {
                println("Correct!")
            } else{
                println("Wrong. The right answer is \"${i.definition}\".")
            }
        }
    }
}