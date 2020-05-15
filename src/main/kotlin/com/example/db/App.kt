package com.example.db

import tables.MyTable

fun main(args: Array<String>) {
    val db = DbHelper().database
    db.tableQueries.insert(MyTable.Impl(0, 1, 10))
    db.tableQueries.insert(MyTable.Impl(0, 2, 10))
    db.tableQueries.insert(MyTable.Impl(0, 3, 10))
    val rows = db.tableQueries.select(10, setOf(1, 2)).executeAsList()
    println(rows.toString())
}