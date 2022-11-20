fun main(args: Array<String>) {

    println(" unSorted list:")
    val numbers = listOf<Int>(30, 400, 0, 2, 23, 37, 98, 1, 4)
    println(numbers)
    println(" sorted list:")
    val ordered =  quicksort(numbers)
    println(ordered)


}

fun quicksort(items:List<Int>):List<Int>{
    if (items.count() < 2){
        return items
    }
    val pivot = items[items.count()/2]

    val equal = items.filter { it == pivot }
//    println("pivot value is : "+equal)

    val less = items.filter { it < pivot }
//    println("Lesser values than pivot : "+less)

    val greater = items.filter { it > pivot }
//    println("Greater values than pivot : "+greater)

    return quicksort(less) + equal + quicksort(greater)
}


