package roomexample.com.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database (entities = [ListCardsEntity::class], version = 1)
abstract class ListCardsDatabase: RoomDatabase() {

    abstract fun listCardsDao(): ListCardsDao

    companion object {
        private var instanceDatabase: ListCardsDatabase ?= null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instanceDatabase ?: synchronized(LOCK) {
            instanceDatabase ?: buildDatabase(context).also { instanceDatabase = it } }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext, ListCardsDatabase::class.java, "list.db").build()
    }
}