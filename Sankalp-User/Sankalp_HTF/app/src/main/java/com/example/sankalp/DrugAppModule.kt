package com.example.sankalp

import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
class DrugAppModule{
    @Provides
    fun provideAuth():FirebaseAuth = Firebase.auth

    @Provides
    fun provideFirestore():FirebaseFirestore = Firebase.firestore
}