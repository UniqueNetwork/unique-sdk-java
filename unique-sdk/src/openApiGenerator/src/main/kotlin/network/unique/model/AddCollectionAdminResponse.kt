/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package network.unique.model

import network.unique.model.AddCollectionAdminParsed
import network.unique.model.FeeResponse

import com.squareup.moshi.Json

/**
 * 
 *
 * @param isError 
 * @param parsed 
 * @param fee 
 */


data class AddCollectionAdminResponse (

    @Json(name = "isError")
    val isError: kotlin.Boolean? = null,

    @Json(name = "parsed")
    val parsed: AddCollectionAdminParsed? = null,

    @Json(name = "fee")
    val fee: FeeResponse? = null

)

