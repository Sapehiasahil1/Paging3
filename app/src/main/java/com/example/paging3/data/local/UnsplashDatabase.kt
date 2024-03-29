package com.example.paging3.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.paging3.data.local.dao.UnsplashImageDao
import com.example.paging3.data.local.dao.UnsplashRemoteKeyDao
import com.example.paging3.models.UnsplashImage
import com.example.paging3.models.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase: RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeyDao(): UnsplashRemoteKeyDao
}