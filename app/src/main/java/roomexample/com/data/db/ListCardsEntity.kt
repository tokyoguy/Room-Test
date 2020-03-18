package roomexample.com.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "list_cards")
class ListCardsEntity(
    var nameCredit: String,
    var numberCredit: String,
    var dateCredit: String,
    var codeCredit: String) {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}