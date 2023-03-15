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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param collectionId 
 * @param tokenId 
 * @param from The ss-58 encoded address
 * @param to The ss-58 encoded address
 * @param amount 
 */


data class TransferRefungibleTokenParsed (

    @Json(name = "collectionId")
    val collectionId: java.math.BigDecimal? = null,

    @Json(name = "tokenId")
    val tokenId: java.math.BigDecimal? = null,

    /* The ss-58 encoded address */
    @Json(name = "from")
    val from: kotlin.String? = null,

    /* The ss-58 encoded address */
    @Json(name = "to")
    val to: kotlin.String? = null,

    @Json(name = "amount")
    val amount: java.math.BigDecimal? = null,

)

