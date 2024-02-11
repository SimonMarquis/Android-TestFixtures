package fr.smarquis.kotlin_library

import kotlin.random.Random

object KotlinLibraryFixtures

fun Random.nextKotlinLibraryFixture(int: Int = nextInt()) = int.toString()
