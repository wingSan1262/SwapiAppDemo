package com.example.testapplication.domain.models.request

import com.example.testapplication.base_component.base_interface.BaseModel
import java.io.Serializable

data class QueryPeopleRequest(
    val page : Int
) : Serializable, BaseModel

data class SearchPeopleRequest(
    val query : String,
    val page : Int
) : Serializable, BaseModel
