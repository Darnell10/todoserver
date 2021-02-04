package com.raywenderlich.repository

import com.raywenderlich.models.User

interface Repository {

    suspend fun addUser(
        email: String,
        displayName: String,
        passwordHash: String
    ): User?

    suspend fun findUser(userId: Int): User?
    suspend fun findEmail(email: String): User?
}