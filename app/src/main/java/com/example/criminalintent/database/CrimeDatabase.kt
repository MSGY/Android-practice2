package com.example.criminalintent.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.criminalintent.Crime
import java.util.*

@Database(entities = [Crime::class], version = 2)
@TypeConverters(CrimeTypeConverter::class)
abstract class CrimeDatabase : RoomDatabase() {

    abstract fun crimeDao() : CrimeDao

}