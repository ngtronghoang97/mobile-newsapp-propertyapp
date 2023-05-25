package com.example.newsapp.model

class DataModelVertical {
    /**
     * Other News
     */
    var newsTitle : String? = null
    var otherImageHolder : Int? = null

    /**
     * Secondary constructor
     */
    constructor(newsTitle: String?, otherImageHolder: Int?) {
        this.newsTitle = newsTitle
        this.otherImageHolder = otherImageHolder
    }
}