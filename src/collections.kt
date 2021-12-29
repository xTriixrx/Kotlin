package com.qfi

/**
 * Collections are a common concept for most programming languages. A collection usually contains a number of objects
 * of the same type and Objects in a collection are called elements or items. The Kotlin Standard Library provides a
 * comprehensive set of tools for managing collections. The following collection types are relevant for Kotlin:
 *
 * Kotlin List - List is an ordered collection with access to elements by indices. Elements can occur more than once
 * in a list.
 * Katlin Set - Set is a collection of unique elements which means a group of objects without repetitions.
 * Kotlin Map - Map (or dictionary) is a set of key-value pairs. Keys are unique, and each of them maps to exactly one
 * value.
 *
 * Kotlin provides both collection/immutable and mutable collections.
 *
 * Kotlin Immutable Collection
 * Immutable collection or simply calling a Collection interface provides read-only methods which means once a collection
 * is created, we cannot change it because there is no method available to change the object created.
 * Collection Types                     Methods of Immutable Collection
 *      List                                    listOf() | listOf<T>()
 *      Map                                     mapOf()
 *      Set                                     setOf()
 *
 * Kotlin Mutable Collection
 * Mutable collections provide both read and write methods
 * Collection Types                     Methods of Muttable Collection
 *      List                                    ArrayList<T>() | arrayListOf() | mutableListOf()
 *      Map                                     HashMap | hashMapOf() | mutableMapOf()
 *      Set                                     hashSetOf() | mutableSetOf()
 */
fun collectionsFunc()
{
    println("collectionsFunc started.")
    println()

    listsFunc()

    setsFunc()

    mapsFunc()

    println("collectionsFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}

/**
 * Kotlin list is an ordered collection of items. A Kotlin list can be either mutable (mutableListOf) or read-only (listOf).
 * The elements of a list can be accessed using indices. Kotlin mutable or immutable lists can have duplicate elements.
 */
fun listsFunc()
{
    println("listsFunc started.")
    println()

    // For list creation, use the standard library functions listOf() for read-only lists and mutableListOf() for
    // mutable lists. To prevent unwanted modifications, obtain read-only views of mutable lists by casting them to List.

    val theList = listOf("one", "two", "three", "four")
    println("theList - $theList")
    var theMutableList = mutableListOf("one", "two", "three", "four")
    println("theMutableList - $theMutableList")

    // There are various ways to loop through a Kotlin list:
    // Using Iterator
    val itr = theList.iterator()
    while (itr.hasNext())
    {
        print("${itr.next()} ")
    }
    println()

    // Using for loop
    for (value in theList)
    {
        print("$value ")
    }
    println()

    // Using forEach (Note: here it works like this operator in Java)
    theList.forEach { print("$it ") }
    println()

    // We can use the size property to get the total number of elements in a list
    println("Size of the list: ${theList.size}")

    // The 'in' operator can be used to check the existence of an element in a list
    if ("two" in theList)
    {
        println("Two is in the list.")
    }

    // The contain() method can also be used to check the existence of an element in a list
    if (theList.contains("two"))
    {
        println("Two is in the list.")
    }

    // The isEmpty() method returns true if the collection is empty (contains no elements), false otherwise.
    if (!theList.isEmpty())
    {
        println("This list is not empty.")
    }

    // The indexOf() method returns the index of the first occurrence of the specified element in the list, or -1
    // if the specified element is not contained in the list
    println("Index of 'two': ${theList.indexOf("two")}")

    // The get() method ca nbe used to get the element at the specified index in the list. First element index will be 0
    println("Element at 3rd position: ${theList.get(2)}")

    // We can use + operator to add two or more lists into a single list. This will add the second list into the first
    // list, even duplicated elements will be added.
    val firstList = listOf("one", "two", "three")
    val secondList = listOf("four", "five", "six")
    val resultList = firstList + secondList
    println("Result of list addition: $resultList")

    // We can use the - operator to subtract a list from another list. This operation will remove the common elements
    // from the first list and will return the result.
    val thirdList = listOf("one", "five", "six")
    val subResultList = firstList - thirdList
    println("Result of list subtraction: $subResultList")

    // We can obtain a sublist from a given list using the slice() method which makes use of ranges
    val sliceResultList = resultList.slice(2..4)
    println("Result of list slice: $sliceResultList")

    // We can use filterNotNull() method to remove null elements from a Kotlin list
    val nullList = listOf("one", "two", null, "four", "five")
    val nullRemoveResultList = nullList.filterNotNull()
    println("Result of null element removal: $nullRemoveResultList")

    // We can use filter() to filter out the elements matching with the given predicate
    val numList = listOf(10, 20, 30, 31, 40, 50, -1, 0)
    val filterResult = numList.filter { it > 30 }
    println("Result of filter where element must be greater than 30: $filterResult")

    // We can use the drop() method to drop the first N elements from a list
    val dropResult = numList.drop(3)
    println("Result of dropping first 3 elements: $dropResult")

    // We can use groupBy() method to group the elements matching with the given predicate
    val groupResult = numList.groupBy { it % 3 }
    println("Result of groupBy 'it % 3': $groupResult")

    // We can use map() method to map all elements using the provided function
    val mapResult = numList.map { it / 3 }
    println("Result of map 'it / 3': $mapResult")

    // We can use chunked() method to create chunks of the given size from a list.
    val chunkedResult = numList.chunked(3)
    println("Result of chunked(3): $chunkedResult")

    // We can use windowed() method to a list of element ranges by moving a sliding window of a given size of a
    // collection of elements
    val windowedResult = numList.windowed(3)
    println("Result of windowed(3): $windowedResult")

    // By default, the sliding window moves one step further each time but we can change that by passing a custom step value:
    val windowedStepResult = numList.windowed(3, 3)
    println("Result of windowed(3, 3): $windowedStepResult")

    // We can create a mutable list using mutableListOf(), later we can use add() to add more elements in the same list,
    // and we can use remove() to remove the elements from the list
    val mutableList = mutableListOf(10, 20, 30)
    mutableList.add(40)
    mutableList.add(50)
    println("Mutable List after add: $mutableList")
    mutableList.remove(10)
    mutableList.remove(30)
    println("Mutable List after remove: $mutableList")

    println()
    println("listsFunc finished.")
    println()
}

/**
 * Kotlin sets are an unordered collection of items. A Kotlin set can be either mutable (mutableSetOf) or read-only
 * (setOf). Kotlin mutable or immutable sets do not allow duplicate elements.
 */
fun setsFunc()
{
    println("setsFunc started.")
    println()

    // For set creation, use the standard library functions setOf() for read-only sets and mutableSetOf() for mutable
    // sets
    val theSet = setOf("one", "two", "three", "four")
    println("theSet - $theSet")
    val theMutableSet = mutableSetOf("one", "two", "three", "four")
    println("theMutableSet - $theMutableSet")

    // There are various ways to loop through a Kotlin set:
    // Using Iterator
    val itr = theSet.iterator()
    while (itr.hasNext())
    {
        print("${itr.next()} ")
    }
    println()

    // Using for loop
    for (value in theSet)
    {
        print("$value ")
    }
    println()

    // Using forEach (Note: here it works like this operator in Java)
    theSet.forEach { print("$it ") }
    println()

    // We can use the size property to get the total number of elements in a set
    println("Size of the set: ${theSet.size}")

    // The 'in' operator can be used to check the existence of an element in a set
    if ("two" in theSet)
    {
        println("Two is in the set.")
    }

    // The contain() method can also be used to check the existence of an element in a set
    if (theSet.contains("two"))
    {
        println("Two is in the set.")
    }

    // The isEmpty() method returns true if the collection is empty (contains no elements), false otherwise.
    if (!theSet.isEmpty())
    {
        println("This set is not empty.")
    }

    // The indexOf() method returns the index of the first occurrence of the specified element in the set, or -1
    // if the specified element is not contained in the set
    println("Index of 'two': ${theSet.indexOf("two")}")

    // The elementAt() method can be used to get the element at the specified index in the set
    println("Element at 3rd position ${theSet.elementAt(2)}")

    // We can use + operator to add two or more lists into a single set. This will add the second set into the first
    // set.
    val firstSet = setOf("one", "two", "three")
    val secondSet = setOf("four", "five", "six")
    val resultSet = firstSet + secondSet
    println("Result of list addition: $resultSet")

    // We can use the - operator to subtract a set from another set. This operation will remove the common elements
    // from the first list and will return the result.
    val thirdSet = setOf("one", "five", "six")
    val subResultSet = firstSet - thirdSet
    println("Result of list subtraction: $subResultSet")

    // We can use filterNotNull() method to remove null elements from a Kotlin set
    val nullSet = setOf("one", "two", null, "four", "five")
    val nullRemoveResultSet = nullSet.filterNotNull()
    println("Result of null element removal: $nullRemoveResultSet")

    // We can use sorted() to sort elements in ascending order or sortedDescending() to sort the set elements in decending
    // order
    val numSet = setOf(10, 20, 30, 31, 40, 50, -1, 0)
    println("Ascending sorted list: ${numSet.sorted()}")
    println("Descending sorted list: ${numSet.sortedDescending()}")

    // We can use filter() to filter out the elements matching with the given predicate
    val filterResult = numSet.filter { it > 30 }
    println("Result of filter where element must be greater than 30: $filterResult")

    // We can use the drop() method to drop the first N elements from a list
    val dropResult = numSet.drop(3)
    println("Result of dropping first 3 elements: $dropResult")

    // We can use groupBy() method to group the elements matching with the given predicate
    val groupResult = numSet.groupBy { it % 3 }
    println("Result of groupBy 'it % 3': $groupResult")

    // We can use map() method to map all elements using the provided function
    val mapResult = numSet.map { it / 3 }
    println("Result of map 'it / 3': $mapResult")

    // We can use chunked() method to create chunks of the given size from a set.
    val chunkedResult = numSet.chunked(3)
    println("Result of chunked(3): $chunkedResult")

    // We can use windowed() method to a set of element ranges by moving a sliding window of a given size of a
    // collection of elements
    val windowedResult = numSet.windowed(3)
    println("Result of windowed(3): $windowedResult")

    // By default, the sliding window moves one step further each time but we can change that by passing a custom step value:
    val windowedStepResult = numSet.windowed(3, 3)
    println("Result of windowed(3, 3): $windowedStepResult")

    // We can create mutable set using mutableSetOf(), later we can use add() to add more elements in the same set, and
    // we can use remove() to remove the elements from the set.
    val mutableSet = mutableSetOf(10, 20, 30)
    mutableSet.add(40)
    mutableSet.add(50)

    println("Mutable Set after add: $mutableSet")
    mutableSet.remove(10)
    mutableSet.remove(30)
    println("Mutable Set after remove: $mutableSet")

    println()
    println("setsFunc finished.")
    println()
}

/**
 * Kotlin map is a collection of key/value pairs, where each key is unique, and it can only be associated with one value.
 * The same value can be associated with multiple keys though. We can declare the keys and values to be any type; there are
 * no restrictions. A Kotlin map can be either mutable (mutableMapOf) or read-only (mapOf). Maps are also known as dictionaries
 * or associative arrays in other programming languages.
 */
fun mapsFunc()
{
    println("mapsFunc started.")
    println()

    // For map creation, use the standard library functions mapOf() for read-only maps and mutableMapOf() for mutable maps.
    // Note: A read-only view of a mutable map can be obtained by casting it to Map.
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println("theMap - $theMap")
    val theMutableMap = mutableSetOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println("theMutableMap - $theMutableMap")

    // A Kotlin map can be created from Java's HashMap
    val hashMap = HashMap<String, Int>()
    hashMap["one"] = 1
    hashMap["two"] = 2
    hashMap["three"] = 3
    hashMap["four"] = 4
    println("hashMap - $hashMap")

    // We can use Pair() to create key/value pairs
    val pairMap = mapOf(Pair("one", 1), Pair("two", 2), Pair("three", 3))
    println("pairMap - $pairMap")

    // Kotlin map has properties to get all entries, keys, and values of the map
    println("theMap entries: ${theMap.entries}")
    println("theMap keys: ${theMap.keys}")
    println("theMap values: ${theMap.values}")

    // There are various ways to loop through a Kotlin Map:
    // Iterator
    val itr = theMap.iterator()
    while (itr.hasNext())
    {
        val entry = itr.next()
        println("${entry.key} = ${entry.value}")
    }

    // Using for loop
    for ((key, value) in theMap)
    {
        println("Key: $key, Value: $value")
    }

    // Using forEach (Note: here it works like this operator in Java)
    theMap.forEach { (key, value) -> println("Key: $key, Value: $value") }
    println()

    // We can use the size property or count() method to get the total number of elements in a map
    println("Size of the Map is ${theMap.size}")
    println("Size of the Map is ${theMap.count()}")

    // The containsKey() checks if the map contains a key whereas the containsValue() checks if the map contains a value
    if (theMap.containsKey("two"))
    {
        println("The map contains a key of 'two'.")
    }

    if (!theMap.containsValue(5))
    {
        println("The map does not contain a value of '5'.")
    }

    // The isEmpty() method returns true if the collection is empty
    if (!theMap.isEmpty())
    {
        println("The map is not empty.")
    }

    // The get() method can be used to get the value corresponding to a given key.
    println("The value for key two ${theMap.get("two")}")
    println("The value for key two ${theMap["two"]}")

    // We can use + operator to add two or more maps into a single set. This will the second map into the first map,
    // discarding duplicate elements. If there are duplicate keys in two maps, then the second maps's key will override
    // the previous map key
    val firstMap =  mapOf("one" to 1, "two" to 2, "three" to 3)
    val secondMap = mapOf("one" to 10, "four" to 4)
    val resultMap = firstMap + secondMap
    println("Result of map addition: $resultMap")

    // We can use - operator to subtract a list from a mpa. This operation will remove all keys of the list from the map
    // and will return the result.
    val theKeyList = listOf("one", "four")
    val subResultList = theMap - theKeyList
    println("Result of map subtraction with key list: $subResultList")

    // We can use remove() method to remove the element from a mutable map, or we can use minus-assign (-=) operator to
    // perform the same operation
    val mutableMap = mutableMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    mutableMap.remove("two")
    println("Mutable map removed of key 'two': $mutableMap")
    mutableMap -= listOf("three")
    println("Mutable map -= listOf(\"three\"): $mutableMap")

    // We can use toSortedMap() to sort the elements in ascending order You can also create a sorted map with the
    // given key/values using sortedMapOf() in place of mapOf().
    println("Ascending sorted map: ${theMap.toSortedMap()}")

    // We can use either filterKeys() or filterValues() methods to filter out the entries
    // We can also use filter() to filter ot the elements matching both key/value
    println("Filter map.filterValues{ it > 2}: ${theMap.filterValues { it > 2 }}")
    println("Filter map.filterKeys{ it == \"two\"}: ${theMap.filterKeys { it == "two" }}")
    println("Filter map.filter{ it.key == \"two\" || it.value == 4}: ${theMap.filter{ it.key == "two" || it.value == 4}}")

    // We can use map() to map all elements using the provided function
    println("Map map.map{(k,v) -> \"Key is \$k, Value is \$v\"}: ${theMap.map{ (k, v) -> "Key is $k, Value is $v" }}")

    // We can create mutable maps using mutableMapOf(), later we can use put to add more elements in the same map, and
    // we can use remove() to remove elements from the map using a key.
    val mutMap = mutableMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    mutMap.put("four", 4)
    println("mutMap after mutMap.put(\"four\", 4): $mutMap")
    mutMap["five"] = 5
    println("mutMap after mutMap[\"five\"] = 5: $mutMap")
    mutMap.remove("two")
    println("mutMap after mutMap.remove(\"two\"): $mutMap")

    println()
    println("mapsFunc finished.")
    println()
}