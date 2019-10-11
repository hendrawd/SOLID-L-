package io.github.hendrawd.solid.dummy

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 */
object Content {

    /**
     * An array of items.
     */
    val ITEMS: MutableList<Item> = ArrayList()

    /**
     * A map of items, by ID.
     */
    private val ITEM_MAP: MutableMap<String, Item> = HashMap()

    init {
        addItem(createItem(1, "Single Responsibility Principle"))
        addItem(createItem(2, "Open/Closed Principle"))
        addItem(createItem(3, "Liskov Substitution Principle"))
        addItem(createItem(4, "Interface Segregation Principle"))
        addItem(createItem(5, "Dependency Inversion Principle"))
    }

    private fun addItem(item: Item) {
        ITEMS.add(item)
        ITEM_MAP[item.id] = item
    }

    private fun createItem(position: Int, content: String): Item {
        return Item(
            position.toString(), content, makeDetails(position), if (position == 3) {
                "http://news.mit.edu/sites/mit.edu.newsoffice/files/styles/news_article_image_top_slideshow/public/images/2009/20091222102310-0_0.jpg"
            } else {
                null
            }
        )
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("<b>Details about Item: </b>").append(position)
        if (position == 3) {
            builder.append(
                "<br>- \"S is a subtype of T, then objects of type T may be replaced with objects of type S\"<br>" +
                        "- Derived types must be completely substitutable for their base types<br>" +
                        "- Liskov substitution principle (LSP) is a particular definition of subtyping relation, called (strong) behavioral subtyping\n" +
                        "- Introduced by Barbara Liskov<br>" +
                        "- Extension of the Open Close Principle"
            )

            builder.append(
                "<br><br><b>Implementation Guidelines</b><br>" +
                        "- No new exceptions can be thrown by the subtype<br>" +
                        "- Clients should not know which specific subtype they are calling<br>" +
                        "- New derived classes just extend without replacing the functionality of old classes<br>"
            )
        } else {
            builder.append("<br>More details information here.")
        }
        return builder.toString()

//        - Introduced by Barbara Liskov state that "objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program"
//        - If a program module is using a Base class, then the reference to the Base class can be replaced with a Derived class without affecting the functionality of the program module
//        - We can also state that Derived types must be substitutable for their base types
    }

    /**
     * A item representing a piece of content.
     */
    @Parcelize
    data class Item(
        val id: String,
        val content: String,
        val details: String,
        val imageUrl: String?
    ) : Parcelable
}
